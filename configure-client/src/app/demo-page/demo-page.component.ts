import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { DemoService } from './demo-page.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-demo-page',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './demo-page.component.html',
  styleUrl: './demo-page.component.scss'
})
export class DemoPageComponent {
  demoValue!: Observable<string>;

  constructor(private demoService: DemoService) { }

  ngOnInit(): void {
    this.demoValue = this.demoService.getDemo();
  }
}
