import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  ProjectInfo = {
    VERSION: '1.0'
  };

  model = {
    username: '',
    password: '',
    domain: ''
  };
  // returnUrl: string;

  domains: any = [];
  selectedDomain: any;

  constructor(private router: Router, public loginService: LoginService) {}

  login(): void {
    this.router.navigateByUrl('/demoPage')
  }

}
