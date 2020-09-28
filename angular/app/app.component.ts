import { Route } from '@angular/compiler/src/core';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'spring-angular';
  constructor(private router:Router){}

  listar(){
    this.router.navigate(["listar"]);
  }
  nuevo(){
    this.router.navigate(["add"]);
  }
}
