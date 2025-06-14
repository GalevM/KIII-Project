import { Routes } from '@angular/router';
import { SearchComponent } from './search/search.component';
import { ShowsComponent } from './shows/shows.component';
import { MoviesComponent } from './movies/movies.component';

export const routes: Routes = [
    { path: 'search', component: SearchComponent },
    { path: 'shows/:imdbID', component: ShowsComponent },
    { path: 'movies/:imdbID', component:MoviesComponent },
    { path: '', redirectTo: '/search', pathMatch: 'full' },
    { path: '**', redirectTo: '/search' }
];
