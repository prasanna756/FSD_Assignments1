import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { 
    console.log('User Service initialized');
  }
  users:User[]=[
                {"uid":100,"username":"Prasanna","email":"prasanna@gmail.com","address":"Hyderabad"},
                {"uid":101,"username":"Vishnu","email":"vishnu@gmail.com","address":"Hyderabad"}
                ]; 
  
                getAllUsers(){
                  console.log('gerAllUsers() called');
                  return this.users;
                }


  }

