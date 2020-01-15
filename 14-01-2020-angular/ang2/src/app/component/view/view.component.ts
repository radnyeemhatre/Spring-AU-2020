import { Component, OnInit } from '@angular/core';
import { DisplayService } from 'src/display.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.scss']
})
export class ViewComponent implements OnInit {
  
  users:any;
  constructor(public ser:DisplayService) { }

  ngOnInit() {
    console.log("service call")
    this.users=this.ser.getuser();
  }

}
