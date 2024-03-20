import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { DashboardTemplateService } from './dashboard-template.service';
import { CommonModule } from '@angular/common';

@Component({
	selector: 'app-dashboard-template',
	standalone: true,
	imports: [CommonModule],
	templateUrl: './dashboard-template.component.html',
	styleUrl: './dashboard-template.component.scss'
})
export class DashboardTemplateComponent {
	value!: Observable<string>;

	constructor(private service: DashboardTemplateService) {}

	ngOnInit(): void {
		this.value = this.service.getTemplateDashboards();
	}
}
