import { Component, inject, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { debounceTime, distinctUntilChanged, Observable, Subject, switchMap, tap } from 'rxjs';
import { Front } from '../front';
import { ShowsService } from '../shows.service';
import { ReactiveFormsModule } from '@angular/forms';
import { AsyncPipe } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-search',
  imports: [ReactiveFormsModule, AsyncPipe, RouterLink],
  templateUrl: './search.component.html',
  styleUrl: './search.component.css'
})
export class SearchComponent implements OnInit {

  fronts$?: Observable<Front[]>;
  service = inject(ShowsService);
  subject = new Subject<string>();
  searchQuery = '';
  router = inject(Router)
  activatedRoute = inject(ActivatedRoute)

  ngOnInit(): void {
    this.activatedRoute.queryParams.subscribe(params => {
      if (params['query']) {
        this.searchQuery = params['query'];
      }
    });

    this.getFronts();
  }

  getFronts(){
    this.fronts$ = this.subject.pipe(
      debounceTime(400),
      distinctUntilChanged(),
      switchMap((query) => this.service.getFromSearch(query)),
    );
  }

  onChange(value: string): void {
    this.subject.next(value);

    this.router.navigate([], {
      queryParams: { query: value },
    });
  }

}
