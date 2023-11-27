import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EnquiryComponent } from './enquiry/enquiry.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    EnquiryComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    FormsModule
  ],
  exports:[
    EnquiryComponent
  ]
})
export class RelationalExecutiveModule { }
