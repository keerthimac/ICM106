import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-registration',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './registration.component.html',
  styleUrl: './registration.component.css',
})
export class RegistrationComponent {
  public product = {
    name: undefined,
    description: undefined,
    category: undefined,
    price: undefined,
  };

  onClick() {
    console.log(this.product);
  }
}
