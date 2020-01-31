import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';
import { UserService } from 'src/app/providers/user.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.scss']
})
export class DetailsComponent implements OnInit {

  constructor(public userSer:UserService) { }
 
  
  userDetails = new FormGroup({
    id: new FormControl('', Validators.required),
    name: new FormControl('', Validators.required),
    email:new FormControl('', Validators.required),
    contact:new FormControl('',Validators.required),
  });
   
  formValid;
  ngOnInit() {
    this.formValid=true;
    
  }
  onSubmit() {
    
    // TODO: Use EventEmitter with form value
    console.warn(this.userDetails.valid);
    this.userSer.addUser(this.userDetails.value.id,this.userDetails.value.name,this.userDetails.value.email,
      this.userDetails.value.contact).subscribe((details)=>{console.log(details)});
  }
  errname="";
  erremail="";
  errcon="";
  check(){
    console.log("1")
    this.formValid=true;
    var reg=/^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$/;
    if(!reg.test(this.userDetails.value.name))
    {
      this.formValid=false;
      this.errname="Enter Valid Name";
    }
    else{
      this.errname=" "
    }
    console.log("2")
   var  reg1=/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/i;
   console.log(this.userDetails.value.email)
    console.log(reg1.test(this.userDetails.value.email));
   if(!(reg1.test(this.userDetails.value.email)))
   {
     console.log("email.err")
     this.formValid=false;
     this.erremail="Enter Valid email";
   }
   else{
    console.log(" no email.err")
    this.erremail=" "
   }
   console.log("3")
   var x=this.userDetails.value.contact;
   x=x.toString();
   console.log(x.length);
   if(!(x.length==10)){
    this.formValid=false;
    this.errcon="Enter Valid contact";
   }
   else{
    this.errcon=" "
   }
  }

}
