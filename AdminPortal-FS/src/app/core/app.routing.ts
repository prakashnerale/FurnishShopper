import {ModuleWithProviders} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {LoginComponent} from '../components/login/login.component';
import { HomePageComponent } from '../components/home-page/home-page.component';
import { AddItemComponent } from '../components/add-item/add-item.component';
const appRoutes: Routes = [
	{
		path : '',
		redirectTo: '/login',
		pathMatch: 'full'
	},
	{
		path: 'login',
		component: LoginComponent
	},
    {
		path:'home-page',
		component:HomePageComponent 
	},
	{
		path:'add-item',
		component:AddItemComponent 
	}
	

	
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);