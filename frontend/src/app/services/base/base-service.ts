import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { BaseModel } from 'app/models/base-model';
import { environment } from 'environments/environment';

@Injectable({
  providedIn: 'root',
})
export abstract class BaseService<Type extends BaseModel> {
  http = inject(HttpClient);
  path = environment.BACKEND_URL;
  abstract resource: string;

  getAll() {
    return this.http.get<Type[]>(`${this.path}${this.resource}`);
  }
  getById(id: number) {
    return this.http.get<Type>(`${this.path}${this.resource}/${id}`);
  }
  create(item: Type) {
    return this.http.post<Type>(`${this.path}${this.resource}`, item);
  }
  update(id: number, item: Type) {
    return this.http.put<Type>(`${this.path}${this.resource}/${id}`, item);
  }
  delete(id: number) {
    return this.http.delete<Type>(`${this.path}${this.resource}/${id}`);
  }
}