import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { DemoPageComponent } from './demo-page/demo-page.component';

export const routes: Routes = [
    {
        path: 'login',
        component: LoginComponent,
    },
    {
        path: 'demoPage',
        component: DemoPageComponent,
    },
];
