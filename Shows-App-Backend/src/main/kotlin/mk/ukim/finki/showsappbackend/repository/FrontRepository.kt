package mk.ukim.finki.showsappbackend.repository

import mk.ukim.finki.showsappbackend.domain.Front
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface FrontRepository : MongoRepository<Front, String> {
    fun findByTitleContainingIgnoreCase(title: String): List<Front>
}