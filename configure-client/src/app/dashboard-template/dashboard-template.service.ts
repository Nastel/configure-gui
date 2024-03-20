import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";

@Injectable({ providedIn: 'root' })
export class DashboardTemplateService {
  constructor(private httpClient: HttpClient) {}

  getTemplateDashboards(): Observable<string> {
    return this.httpClient.get('http://localhost:8080/template_dashboard', { responseType: 'text' });
  }
}
