import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";

@Injectable({ providedIn: 'root' })
export class DemoService {
    constructor(private httpClient: HttpClient) { }

    getDemo(): Observable<string> {
        return this.httpClient.get('http://localhost:8080/configure-server/api/v1/connections', { responseType: 'text' });
    }
}
