import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { DemoPageComponent } from './demo-page/demo-page.component';
import { DashboardTemplateComponent } from './dashboard-template/dashboard-template.component';

export const routes: Routes = [
    {
        path: 'login',
        component: LoginComponent,
    },
    {
        path: 'demoPage',
        component: DemoPageComponent,
    },
    {
        path: 'dashboardTemplate',
        component: DashboardTemplateComponent,
    },
];
