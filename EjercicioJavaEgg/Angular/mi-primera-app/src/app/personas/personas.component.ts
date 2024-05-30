import { Component } from "@angular/core";
import { PersonaComponent } from "../persona/persona.component";
import { FormsModule } from "@angular/forms";
import { CommonModule } from "@angular/common";


@Component({
    selector: 'app-personas',
    standalone: true,
    imports: [PersonaComponent,FormsModule,CommonModule ],
    templateUrl:"./personas.component.html",
    styleUrls:['./personas.component.css']
})
export class PersonasComponent{
  deshabilitar = false;
  mensaje ='No se ha agregado ninguna persona';
  titulo = 'Licenciado';
  mostrar= false;

  agregarPersona(){
      this.mostrar= true;
      this.mensaje='Persona agregada';
  }

  modificarTitulo(event:Event){
      console.log('Entrando al metodo modificar titulo');
      this.titulo = (<HTMLInputElement>event.target).value;
  }
}
