import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { FormularioComponent } from "./formulario/formulario.component";
import { ResultadoComponent } from "./resultado/resultado.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, FormsModule, FormularioComponent, ResultadoComponent]
})
export class AppComponent {
  titulo = 'Aplicacion Calculadora';

  resultadoPadre: number;

  ProcesarResultado(resultado: number){
    this.resultadoPadre = resultado;
  }
}
