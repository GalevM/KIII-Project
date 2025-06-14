package mk.ukim.finki.showsappbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShowsAppBackendApplication

fun main(args: Array<String>) {
    runApplication<ShowsAppBackendApplication>(*args)
}
