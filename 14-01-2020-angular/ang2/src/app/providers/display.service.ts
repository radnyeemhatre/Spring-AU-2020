import { Injectable } from '@angular/core';
import { userInfo } from 'os';

@Injectable({
  providedIn: 'root'
})
export class DisplayService {
 k="l";
  user=[];
  constructor() { }
  getuser() {
    console.log("getuser")
    console.log(this.user);
    return this.user;  
  }
  adduser(data:any){
    console.log(data)
    
    this.user.push(data);
    console.log(this.user)
  }
}
