import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from '../../Student';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
  }),
};

@Injectable({
  providedIn: 'root',
})
export class StudentService {
  apiUrl: string = 'http://localhost:5000/tasks';
  constructor(private http: HttpClient) {}

  addStudent(student: Student): Observable<Student> {
    return this.http.post<Student>(this.apiUrl, student, httpOptions);
  }
}
