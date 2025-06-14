import { HttpClient } from "@angular/common/http";
import { inject, Injectable } from "@angular/core";
import { map, Observable } from "rxjs";
import { Front } from "./front";
import { Show } from "./show";
import { Movie } from "./movie";

@Injectable({
  providedIn: 'root'
})
export class ShowsService {
  http = inject(HttpClient);

  getFromSearch(query: string): Observable<Front[]> {
    return this.http.get<any>(`/api?search=${query}`)
  }

  getShow(imdbID: string): Observable<Show>{
    return this.http.get<Show>(`/api/showMovie?imdbId=${imdbID}`)
  }

  getMovie(imdbID: string): Observable<Movie>{
    return this.http.get<Movie>(`/api/showMovie?imdbId=${imdbID}`)
  }
}
