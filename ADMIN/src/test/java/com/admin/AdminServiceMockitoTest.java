package com.admin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;



import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.admin.exception.DuplicateKeyException;
import com.admin.exception.ResourceNotFoundException;
import com.admin.model.Admin;
import com.admin.repo.AdminRepository;
import com.admin.serviceImpl.AdminServiceImpl;

@SpringBootTest(classes= {AdminServiceMockitoTest.class})
public class AdminServiceMockitoTest {  //invoking service method

	@Mock
	AdminRepository adminRepository;
	
	@InjectMocks
	AdminServiceImpl adminServiceImpl;
	
	public List<Admin> allAdmin;
	
	
	
	@Test
	@Order(1)
	public void test_getAllUsers() {
List<Admin> admin = Stream.of(new Admin(1, "ashish"),new Admin(2, "ashis")).collect(Collectors.toList());
//		List<Admin> admin = new ArrayList<Admin>();
//		admin.add(new Admin(1, "Ashish"));
//		admin.add(new Admin(2, "Ashish"));
//mocking the data
		when(adminRepository.findAll()).thenReturn(admin);// prevent from connecting to database
//it means when(external dependency..'i.e. dependency directly related to database ).thenReturn(our created object or mocked object);
		List<Admin> allUser = adminServiceImpl.getAllUser();
		assertEquals(2, allUser.size());
//assertEqauls(expected(2),actual)
		}
	
	
	   @Test
	   @Order(2)
	    public void testGetAllUserWithEmptyList() {
	        when(adminRepository.findAll()).thenReturn(Collections.emptyList());

	        assertThrows(ResourceNotFoundException.class, () -> adminServiceImpl.getAllUser());
	    }
	
	@Test
	@Order(3)
	public void test_getUserById() {
		Admin admin1 = new Admin(1, "ashish");
		when(adminRepository.findById(1)).thenReturn(Optional.of(admin1));
		Admin result = adminServiceImpl.getUserById(1);
		assertNotNull(result);
		assertEquals(1, result.getId());
	}
	
	@Test
	@Order(4)
	public void test_getUserById_NonExistingId() {
	   
		// Mock the behavior of adminRepository.findById(id) to return an empty Optional
	    when(adminRepository.findById(2)).thenReturn(Optional.empty());

	    // Call the getUserById method with a non-existing ID, which should throw a ResourceNotFoundException
	    assertThrows(ResourceNotFoundException.class, () -> adminServiceImpl.getUserById(2));
	}
	
	@Test
	@Order(5)
	public void saveUser() {
		
		Admin admin=new Admin(1,"Ashish");
		
		
		when(adminRepository.save(admin)).thenReturn(admin);
		
		assertEquals(admin, adminServiceImpl.saveUser(admin));
		//saveUser method of AdminServiceImpl class is taking behavior of that method only 
		
	}
	
	@Test
	@Order(6)
	public void test_saveUser_Duplicate() {
		Admin admin=new Admin(1,"Ashish");
		

		// Mock the behavior of adminRepository.findById(id) to return an empty Optional
	    when(adminRepository.existsById(admin.getId())).thenReturn(true);
	    

	    // Call the getUserById method with a non-existing ID, which should throw a ResourceNotFoundException
	    assertThrows(DuplicateKeyException.class, () -> adminServiceImpl.saveUser(admin));
	   
//	    the code inside the saveUser method does not handle the DuplicateKeyException appropriately, 
//	    there could be a chance that the save method is called even after the exception is thrown. 
//	    This could potentially lead to unintended behavior or data corruption,
//	    as the save operation might not be intended to execute in such cases.
	    verify(adminRepository, times(0)).save(admin);
  
	}
	
	@Test
	@Order(7)
	public void test_test_updateUserById_WithValidId() {
		
		Admin adm=new Admin(1, "Ashish");
		
	    // Mock the behavior of adminRepository.existsById(id) to return true
        when(adminRepository.existsById(1)).thenReturn(true);
		when(adminRepository.save(adm)).thenReturn(adm);
		
	    // Call the updateUserById method with a valid ID
        ResponseEntity<?> updateUserById = adminServiceImpl.updateUserById(adm, 1);
		System.out.println(updateUserById.getStatusCode());
		System.out.println(updateUserById.getBody());
		
	    // Assert that the response status is HttpStatus.OK and the response body contains the updated Admin object
        assertEquals(HttpStatus.OK, updateUserById.getStatusCode());//whether HttpStatus.OK is matching with our code i.e. updateUserById.getStatusCode()
		assertEquals(adm, updateUserById.getBody());//whether admin is matching with our updatedUserById or not
		
	    // Verify that the save method is called with the correct Admin object
        verify(adminRepository,timeout(1)).save(adm);
		
	}
	
	@Test
	@Order(8)
	public void test_updateUserById_WithInvalidId() {
		
		Admin adm=new Admin(1, "Ashish");
		
		when(adminRepository.existsById(1)).thenReturn(false);
		ResponseEntity<?> updateUserById = adminServiceImpl.updateUserById(adm, 2);
		
		System.out.println(updateUserById.getStatusCode());
		
		assertEquals(HttpStatus.BAD_REQUEST, updateUserById.getStatusCode());
		
        assertEquals("The provided ID does not match any existing records or is not valid", updateUserById.getBody());
		
	}
	
	@Test
	@Order(9)
	public void test_deleteUserById_WithValidId() {
	    // Create a sample Admin object
	    Admin admin = new Admin(1, "John Doe");

	    // Mock the behavior of adminRepository.findById(id) to return an Optional containing the Admin object
	  when(adminRepository.findById(1)).thenReturn(Optional.of(admin));
//using Optional.of(admin) will return data associated with particular id or perform any operation related to that id

	    // Mock the behavior of adminRepository.deleteById(id)
	    doNothing().when(adminRepository).deleteById(1);

	    // Call the deleteUserById method with a valid ID
	    adminServiceImpl.deleteUserById(1);

	    // Verify that the deleteById method is called once with the correct ID
	   verify(adminRepository, times(1)).deleteById(1);
	}
	
	@Test
	@Order(10)
	public void test_deleteUserById_WithInvalidId() {
	    // Mock the behavior of adminRepository.findById(id) to return an empty Optional
	    when(adminRepository.findById(2)).thenReturn(Optional.empty());

	    // Call the deleteUserById method with an invalid ID
	    assertThrows(ResourceNotFoundException.class, () -> adminServiceImpl.deleteUserById(2));
	}
}
