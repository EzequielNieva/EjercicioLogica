import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-formulario',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './formulario.component.html',
  styleUrl: './formulario.component.css'
})
export class FormularioComponent {
  operandoA: number;
  operandoB: number;

  @Output() resultado1 = new EventEmitter<number>();


  sumar():void{
    let resultado = this.operandoA + this.operandoB;
    this.resultado1.emit(resultado);
  }

  restar():void{
   let resultado = this.operandoA - this.operandoB;
   this.resultado1.emit(resultado);
  }

  multiplicar():void{
    let resultado = this.operandoA * this.operandoB;
    this.resultado1.emit(resultado);
  }

  dividir():void{
    let resultado = this.operandoA / this.operandoB;
    this.resultado1.emit(resultado);
  }
}

