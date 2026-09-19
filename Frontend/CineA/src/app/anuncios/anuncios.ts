import { Component } from '@angular/core';
import { FormGroup, Validators } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { FormBuilder } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-anuncios',
  imports: [FormsModule,CommonModule,ReactiveFormsModule],
  templateUrl: './anuncios.html',
  styleUrl: './anuncios.css',
})
export class Anuncios {

  private readonly htpp:HttpClient;
  formulario:FormGroup
  anuncio:any = [];

  constructor(http:HttpClient, private fb: FormBuilder){
    this.htpp=http;
    this.formulario = this.fb.group(
      {
        descripcion:[''],
        imagen:[''],
        titulo:['',Validators.required],
      }
    );
    this.buscarAnuncios();
  }

  buscarAnuncios(){
    this.htpp.get("http://localhost:8080/anuncio/buscar"
    ).subscribe(
      data => this.anuncio=data
    )
  }

  guardar(){
    if(this.formulario.valid){
      let temp = {... this.formulario.value};
      temp.fechaPublicacion = new Date();
      this.htpp.post("http://localhost:8080/anuncio/guardar"
      ,temp).subscribe(
      anun => this.mostrar(anun)
      )
    }
    else{
      alert("Completar Campos");
    }
  }

  mostrar(anun:any){
    if(anun?.idanuncio){
      alert ("Anuncio creado exitosamente con ID: "+ anun.idanuncio);
      this.buscarAnuncios();
    }
    else{
      alert("Error con el servidor")
    }
  }

  onImagenSeleccionada(event:any){
    const file = event.target.files[0];
    if (file){
     const reader = new FileReader(); //Esto hace la vonersion FileRider del archivo
     reader.onload = () => {
      this.formulario.patchValue({ imagen:reader.result as string});
     };
     reader.readAsDataURL(file);
    }

  }


}
