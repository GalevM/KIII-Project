package mk.ukim.finki.showsappbackend.repository

import mk.ukim.finki.showsappbackend.domain.Movie
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : MongoRepository<Movie, String>