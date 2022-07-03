import { Injectable } from '@angular/core';
import { Observable, observable, of} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor() { }

  getPeople():Observable<any> {
    let peopleArray = [
      {
        firstName: 'Ivonaldo',
        lastName: 'Soares',
        age: 26 
      },
      {
        firstName : 'Lucas',
        lastName: ' Silva',
        age: 31
      },
      {
        firstName:'João',
        lastName: 'Pereira',
        age: 32
      },
      {
        firstName: 'Marcio',
        lastName: 'Santos',
        age: 46
      }
    
    ]
    return of(peopleArray)
  }
}
