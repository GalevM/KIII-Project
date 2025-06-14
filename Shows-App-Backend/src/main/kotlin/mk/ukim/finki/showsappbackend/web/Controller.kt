package mk.ukim.finki.showsappbackend.web


import mk.ukim.finki.showsappbackend.service.FrontService
import mk.ukim.finki.showsappbackend.service.MovieService
import mk.ukim.finki.showsappbackend.service.ShowService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = ["http://localhost:4200"])
class Controller(
        private val frontService: FrontService,
        private val movieService: MovieService,
        private val showService: ShowService
) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getFronts(@RequestParam search: String): ResponseEntity<Any> {
        val fronts = frontService.getBySearch(search)
        return ResponseEntity.ok(fronts)
    }

    @GetMapping("/showMovie", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getShowOrMovie(@RequestParam imdbId: String): ResponseEntity<Any> {
        return if (movieService.getByImdbId(imdbId) != null) {
            ResponseEntity.ok(movieService.getByImdbId(imdbId))
        } else {
            ResponseEntity.ok(showService.getByImdbId(imdbId))
        }

    }
}