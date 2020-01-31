import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/providers/user.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.scss']
})
export class ViewComponent implements OnInit {
  users :Object;
  constructor(public userSer:UserService) { }

  ngOnInit() {
    console.log("call")
    this.userSer.getAllUsers().subscribe((details)=>{console.log(details),
      this.users=details});
   
    console.log(this.users)
  }

}
