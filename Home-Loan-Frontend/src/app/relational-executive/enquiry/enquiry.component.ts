import { Component } from '@angular/core';
import { Enquiry } from 'src/app/relational-executive/model-enquiry';
import { CommonServiceService } from 'src/app/shared/common-service.service';



@Component({
  selector: 'app-enquiry',
  templateUrl: './enquiry.component.html',
  styleUrls: ['./enquiry.component.css'],
})
export class EnquiryComponent {
  enq1 : Enquiry = {
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
    custAdharCardNo:0
  };

  constructor(public cs : CommonServiceService){


  }
     saveEnquiry(enq : Enquiry){
       console.log('data Diplayed')
       if (enq.enqId==0) {
        this.cs.saveEnquiry(enq).subscribe();
       }
      window.location.reload();


     }
     resetEnquiry() {

      if(confirm('are you sure to reset data ?'))
      this.cs.enq = Object.assign({},this.enq1)
    
    }



}
