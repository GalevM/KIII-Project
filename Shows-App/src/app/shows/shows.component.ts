import { Component, inject, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Show } from '../show';
import { ShowsService } from '../shows.service';
import { forkJoin } from 'rxjs';

@Component({
  selector: 'app-shows',
  templateUrl: './shows.component.html',
  styleUrls: ['./shows.component.css']
})
export class ShowsComponent implements OnInit {
  show!: Show;
  imdbID: string = '';
  service = inject(ShowsService);
  route = inject(ActivatedRoute);

  ngOnInit(): void {

    this.route.params.subscribe(params => {
      this.imdbID = params['imdbID'];
    });

    this.service.getShow(this.imdbID).subscribe(showData => {
      this.show = showData;
    });
  }

}
