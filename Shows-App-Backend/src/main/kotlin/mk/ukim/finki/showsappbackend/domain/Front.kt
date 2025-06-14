package mk.ukim.finki.showsappbackend.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "front")
data class Front(
        @Id
        val imdbID: String,
        val title: String,
        val year: String,
        val type: String,
        val poster: String
)