import { Component } from '@angular/core';
import { FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { FormBuilder } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-usuarios',
  imports: [FormsModule,ReactiveFormsModule,CommonModule],
  templateUrl: './usuarios.html',
  styleUrl: './usuarios.css',
})
export class Usuarios {

  private readonly htpp:HttpClient;
  formulario:FormGroup
  usuarios:any = [];

  constructor(http:HttpClient, private fb: FormBuilder){
    this.htpp=http;
    this.formulario = this.fb.group(
      {
        nombreusuario:['',Validators.required],
        nombres:['',Validators.required],
        apellidos:[''],
        telefono:[''],
        correo:['',[Validators.required,Validators.email]],
        contrasena:['',Validators.required],
        idrol:['',Validators.required],
      }
    );
    this.buscarUsuarios();
  }

  buscarUsuarios(){
    this.htpp.get("http://localhost:8080/usuario/buscar"
    ).subscribe(
      data => this.usuarios=data
    )
  }

  guardar(){
    if(this.formulario.valid){
      let temp = {... this.formulario.value};
      this.htpp.post("http://localhost:8080/usuario/guardar"
      ,temp).subscribe(
      user => this.mostrar(user)
      )
    }
    else{
      alert("Completar Campos");
    }
  }

  mostrar(user:any){
    if(user?.idusuario){
      alert ("Usuario creado exitosamente con ID: "+ user.idusuario);
      this.buscarUsuarios();
    }
    else{
      alert("Error con el servidor")
    }
  }
}
