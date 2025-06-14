package mk.ukim.finki.showsappbackend.service

import mk.ukim.finki.showsappbackend.domain.Show
import mk.ukim.finki.showsappbackend.repository.ShowRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ShowService(
        private val showRepository: ShowRepository
) {
    fun getByImdbId(imdbId: String): Show? {
        return showRepository.findByIdOrNull(imdbId)
    }
}