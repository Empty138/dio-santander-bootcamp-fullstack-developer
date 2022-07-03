import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  apiUrl = 'https://sheet.best/api/sheets/710861f9-002a-43b4-98dd-cba47d12b6cb'
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  constructor(private httpCliente: HttpClient) { }

// C.R.U.D - CREATE, READ, UPDATE, DELETE

// Retorna a lista de usuários READ
  getUsers():Observable<User[]> {
    return this.httpCliente.get<User[]>(this.apiUrl);
  }

// Salva usuário no banco CREATE
  postUser(user: User):Observable<User>{
    return this.httpCliente.post<User>(this.apiUrl, user)
  }

// Exclui o usuário do banco DELETE
  deleteUser(id: number):Observable<User> 
  {
    return this.httpCliente.delete<User>(`${this.apiUrl}/id/${id}`)
  }

// Edita usuário UPDATE
  updateUser(id: string, user: User):Observable<User>{
    return this.httpCliente.put<User>(`${this.apiUrl}/id/${id}`, user, this.httpOptions)
  }

// Lista usuário único
  getUser(id: string):Observable<User[]> {
    return this.httpCliente.get<User[]>(`${this.apiUrl}/id/${id}`)
  }

}
