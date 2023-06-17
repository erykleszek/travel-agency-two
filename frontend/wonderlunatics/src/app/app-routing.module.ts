import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent } from './home/home.component';
import {AdventuresComponent} from './adventures/adventures.component';
import { MyAccountComponent } from './my-account/my-account.component';
import { RegisterComponent } from './register/register.component';
import { ContactUsComponent } from './contact-us/contact-us.component';

const routes: Routes = [
  {path:'',component: HomeComponent},
  {path:'adventures',component: AdventuresComponent},
  {path:'my-account',component: MyAccountComponent},
  {path:'register',component: RegisterComponent},
  {path:'contact-us',component: ContactUsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash:true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
