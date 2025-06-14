import { Component, inject, OnInit } from '@angular/core';
import { Movie } from '../movie';
import { ShowsService } from '../shows.service';
import { Subject } from 'rxjs';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-movies',
  imports: [],
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.css'
})
export class MoviesComponent implements OnInit{

  movie!: Movie;
  service = inject(ShowsService);
  route = inject(ActivatedRoute)
  imdbID: string = '';

  ngOnInit(): void {
    this.route?.params.subscribe(params => {
      this.imdbID = params['imdbID'];
    });

    this.service.getMovie(this.imdbID).subscribe(param =>
      this.movie = param
    );
  }

}
