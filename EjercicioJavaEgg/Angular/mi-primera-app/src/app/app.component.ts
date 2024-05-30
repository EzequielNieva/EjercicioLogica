import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PersonasComponent } from "./personas/personas.component";
import { PersonaComponent } from './persona/persona.component';


@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, PersonasComponent,PersonaComponent]
})
export class AppComponent {
  title = 'Hola mundo desde Angular';
}
