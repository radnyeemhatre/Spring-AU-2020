import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


export class User{
  id:number;
  name:string;
  email:string;
  contact:string;
  constructor(id,name,email,contact)
  {
    this.id=id
    this.name=name
    this.email=email
    this.contact=contact
  }
}
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:  HttpClient) { }

  addUser(id,name,email,contact)
  {
    let user=new User(id,name,email,contact)
    console.log(user)
    return this.http.post("user/adduser",user)
  }

  getAllUsers(){
    console.log("dbcall")
    return this.http.get("user/all");
  }
}
