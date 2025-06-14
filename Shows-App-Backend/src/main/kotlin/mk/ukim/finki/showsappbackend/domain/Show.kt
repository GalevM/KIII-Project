package mk.ukim.finki.showsappbackend.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "shows")
data class Show(
        @Id
        val imdbID: String,
        val title: String,
        val genre: String,
        val actors: String,
        val plot: String,
        val language: String,
        val poster: String,
        val imdbRating: String,
        val totalSeasons: String
)
