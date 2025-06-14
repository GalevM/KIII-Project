package mk.ukim.finki.showsappbackend.service

import mk.ukim.finki.showsappbackend.domain.Movie
import mk.ukim.finki.showsappbackend.repository.MovieRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MovieService(
        private val movieRepository: MovieRepository
) {
    fun getByImdbId(imdbId: String): Movie? {
        return movieRepository.findByIdOrNull(imdbId)
    }
}