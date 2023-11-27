import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Enquiry } from '../relational-executive/model-enquiry';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommonServiceService {

 

  constructor(private http : HttpClient ) {}
  enq : Enquiry = {
    enqId: 0,
    custName: '',
    custDOB: '',
    custAge: 0,
    custEmail: '',
    custMobileNo: 0,
    custSalary: 0,
    homeLoanAmount: 0,
    custCompanyName: '',
    custCity: '',
    custPincode: 0,
    custPanCardNo: '',
    custAdharCardNo :0
  };

  url :String='http://localhost:9098/v1/RE/';

  saveEnquiry(enq : Enquiry) : Observable<Enquiry>{
    console.log('data Diplayed in common service')
  return this.http.post<Enquiry>(this.url+'save-user',enq);
  }

  getEnquiryData(): Observable<Enquiry[]>{
    return this.http.get<Enquiry[]>(this.url+'getAllEnquiry');
  }
  
}
