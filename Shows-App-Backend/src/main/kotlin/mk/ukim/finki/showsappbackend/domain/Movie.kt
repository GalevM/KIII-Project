package mk.ukim.finki.showsappbackend.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "movies")
data class Movie(
        @Id
        val imdbID: String,
        val title: String,
        val genre: String,
        val actors: String,
        val language: String,
        val poster: String,
        val imdbRating: String
)