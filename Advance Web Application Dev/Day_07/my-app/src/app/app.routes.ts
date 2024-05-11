import { Routes } from '@angular/router';
import { RegisterComponent } from './pages/register/register.component';
import { AboutComponent } from './pages/about/about.component';

export const routes: Routes = [
  { path: 'register', component: RegisterComponent },
  { path: 'about', component: AboutComponent },
];
