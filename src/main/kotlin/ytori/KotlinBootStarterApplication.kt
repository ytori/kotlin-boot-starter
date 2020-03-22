package ytori

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBootStarterApplication

fun main(args: Array<String>) {
    runApplication<KotlinBootStarterApplication>(*args)
}
