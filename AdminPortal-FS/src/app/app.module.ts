import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpModule } from '@angular/http';
import { routing } from './core/app.routing';
import 'hammerjs';
import { CustomMaterialModule } from './core/material.module';//material module is imported from core folder
import {FormsModule} from '@angular/forms'

import { LoginService } from './services/login.service';


import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './components/login/login.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';


@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    CustomMaterialModule,
    routing,
    HttpModule,
    FormsModule
  
  ],
  
  providers: [
    LoginService
  ],

  bootstrap: [AppComponent]
})
export class AppModule { }
