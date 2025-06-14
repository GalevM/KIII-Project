package mk.ukim.finki.showsappbackend.repository

import mk.ukim.finki.showsappbackend.domain.Show
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ShowRepository : MongoRepository<Show, String>