import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Student } from '../../../Student';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css',
})
export class RegisterComponent {
  firstName!: string;
  lastName!: string;

  onSubmit() {
    let formData: Student = {
      firstName: this.firstName,
      lastName: this.lastName,
    };
    console.log(formData);
  }
}
