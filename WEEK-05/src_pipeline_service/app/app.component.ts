import { Component, OnInit } from '@angular/core';
import { UserService } from './user.service';
import { User } from './user';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
 // providers: [UserService]
})


export class AppComponent implements OnInit{
  title = 'directives';

  object:Object=
  {foo:'bar',baz:'baz',prasanna: 'prasanna'};

  userList:User[]=[];

constructor(private userService:UserService){
  console.log("component class object created")


}
ngOnInit():void{
  console.log('ngOnInit is called')
  this.getAll();

}

getAll(){
  this.userList=this.userService.getAllUsers();
}
}
