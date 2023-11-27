package com.re.reRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.re.entity.EnquiryInfo;

@Repository
public interface ReRepository extends JpaRepository<EnquiryInfo, Integer> {

}
