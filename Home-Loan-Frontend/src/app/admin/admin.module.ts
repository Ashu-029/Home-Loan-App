import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminControllerComponent } from './admin-controller/admin-controller.component';
import { AdminServiceComponent } from './admin-service/admin-service.component';
import { AdminServiceImplComponent } from './admin-service-impl/admin-service-impl.component';



@NgModule({
  declarations: [
    AdminControllerComponent,
    AdminServiceComponent,
    AdminServiceImplComponent
  ],
  imports: [
    CommonModule
  ]
})
export class AdminModule { }
