import { Routes } from '@angular/router';
import { Login } from './login/login';
import { Bienvenida } from './bienvenida/bienvenida';
import { Usuarios } from './usuarios/usuarios';
import { Anuncios } from './anuncios/anuncios';

export const routes: Routes = [
    {path:'',component:Login},
    {path:'bienvenida',component:Bienvenida},
    {path:'usuarios',component:Usuarios},
    {path:'anuncios',component:Anuncios},
];
