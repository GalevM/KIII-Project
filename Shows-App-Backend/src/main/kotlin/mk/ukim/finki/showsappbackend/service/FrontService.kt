package mk.ukim.finki.showsappbackend.service

import mk.ukim.finki.showsappbackend.domain.Front
import mk.ukim.finki.showsappbackend.domain.Movie
import mk.ukim.finki.showsappbackend.domain.Show
import mk.ukim.finki.showsappbackend.repository.FrontRepository
import mk.ukim.finki.showsappbackend.repository.MovieRepository
import mk.ukim.finki.showsappbackend.repository.ShowRepository
import org.springframework.stereotype.Service

@Service
class FrontService(
        private val frontRepository: FrontRepository,
        private val showRepository: ShowRepository,
        private val movieRepository: MovieRepository
) {
    fun getBySearch(search: String): List<Front> {
        if (search.isEmpty()) {
            return ArrayList<Front>()
        }

         val f: List<Front> = frontRepository.findByTitleContainingIgnoreCase("Game of Thrones")

        if (f.isEmpty()){
            frontRepository.save(Front(
                    "tt0944947",
                    "Game of Thrones",
                    "2011–2019",
                    "series",
                    "https://m.media-amazon.com/images/M/MV5BMTNhMDJmNmYtNDQ5OS00ODdlLWE0ZDAtZTgyYTIwNDY3OTU3XkEyXkFqcGc@._V1_SX300.jpg",
            ))

            frontRepository.save(Front(
                    "tt2084970",
                    "The Imitation Game",
                    "2014",
                    "movie",
                    "https://m.media-amazon.com/images/M/MV5BNjI3NjY1Mjg3MV5BMl5BanBnXkFtZTgwMzk5MDQ3MjE@._V1_SX300.jpg"
            ))

            frontRepository.save(Front(
                    "tt10919420",
                    "Squid Game",
                    "2021–2025",
                    "series",
                    "https://m.media-amazon.com/images/M/MV5BNDMxNTYzYTAtYTJkMy00YTA4LTk5NzYtNzFhOTIxZTRmOTkyXkEyXkFqcGc@._V1_SX300.jpg"
            ))

            frontRepository.save(
                    Front(
                            "tt0455275",
                            "Prison Break",
                            "2005–2017",
                            "series",
                            "https://m.media-amazon.com/images/M/MV5BMTg3NTkwNzAxOF5BMl5BanBnXkFtZTcwMjM1NjI5MQ@@._V1_SX300.jpg"
                    )
            )

            frontRepository.save(
                    Front(
                            "tt0420293",
                            "The Stanford Prison Experiment",
                            "2015",
                            "movie",
                            "https://m.media-amazon.com/images/M/MV5BMTUyNDIyMTA4NV5BMl5BanBnXkFtZTgwODM2MDMxNjE@._V1_SX300.jpg"
                    )
            )

            frontRepository.save(
                    Front(
                            "tt4257858",
                            "Going Clear: Scientology & the Prison of Belief",
                            "2015",
                            "movie",
                            "https://m.media-amazon.com/images/M/MV5BZjY4NmM1YTgtMzVlZi00YTA3LTg5MGQtMDllNGU0OWUxZTdkXkEyXkFqcGc@._V1_SX300.jpg"
                    )
            )

            movieRepository.save(
                    Movie(
                            "tt2084970",
                            "The Imitation Game",
                            "Biography, Drama, Thriller",
                            "Benedict Cumberbatch, Keira Knightley, Matthew Goode",
                            "English, German",
                            "https://m.media-amazon.com/images/M/MV5BNjI3NjY1Mjg3MV5BMl5BanBnXkFtZTgwMzk5MDQ3MjE@._V1_SX300.jpg",
                            "8.0"
                    )
            )

            movieRepository.save(
                    Movie(
                            "tt0420293",
                            "The Stanford Prison Experiment",
                            "Biography, Drama, History",
                            "Ezra Miller, Tye Sheridan, Billy Crudup",
                            "English",
                            "https://m.media-amazon.com/images/M/MV5BMTUyNDIyMTA4NV5BMl5BanBnXkFtZTgwODM2MDMxNjE@._V1_SX300.jpg",
                            "6.8"
                    )
            )

            movieRepository.save(
                    Movie(
                            "tt4257858",
                            "Going Clear: Scientology & the Prison of Belief",
                            "Documentary",
                            "Paul Haggis, Jason Beghe, Spanky Taylor",
                            "English",
                            "https://m.media-amazon.com/images/M/MV5BZjY4NmM1YTgtMzVlZi00YTA3LTg5MGQtMDllNGU0OWUxZTdkXkEyXkFqcGc@._V1_SX300.jpg",
                            "8.0"
                    )
            )

            showRepository.save(
                    Show(
                            "tt0944947",
                            "Game of Thrones",
                            "Action, Adventure, Drama",
                            "Emilia Clarke, Peter Dinklage, Kit Harington",
                            "Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia.",
                            "English",
                            "https://m.media-amazon.com/images/M/MV5BMTNhMDJmNmYtNDQ5OS00ODdlLWE0ZDAtZTgyYTIwNDY3OTU3XkEyXkFqcGc@._V1_SX300.jpg",
                            "9.2",
                            "8"
                    )
            )

            showRepository.save(
                    Show(
                            "tt10919420",
                            "Squid Game",
                            "Action, Drama, Mystery",
                            "Lee Jung-jae, Greg Chun, Tom Choi",
                            "Hundreds of cash-strapped players accept a strange invitation to compete in children's games. Inside, a tempting prize awaits with deadly high stakes: a survival game that has a whopping 45.6 billion-won prize at stake.",
                            "Korean, English, Urdu",
                            "https://m.media-amazon.com/images/M/MV5BNDMxNTYzYTAtYTJkMy00YTA4LTk5NzYtNzFhOTIxZTRmOTkyXkEyXkFqcGc@._V1_SX300.jpg",
                            "8.0",
                            "3"
                    )
            )

            showRepository.save(
                    Show(
                            "tt0455275",
                            "Prison Break",
                            "Action, Crime, Drama",
                            "Dominic Purcell, Wentworth Miller, Amaury Nolasco",
                            "A structural engineer installs himself in a prison he helped design, in order to save his falsely accused brother from a death sentence by breaking themselves out from the inside.",
                            "English, Spanish, Arabic",
                            "https://m.media-amazon.com/images/M/MV5BMTg3NTkwNzAxOF5BMl5BanBnXkFtZTcwMjM1NjI5MQ@@._V1_SX300.jpg",
                            "8.3",
                            "5"
                    )
            )
        }

        return frontRepository.findByTitleContainingIgnoreCase(search)
    }
}