package ytori.contoller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ytori.model.HelloMessage

@RestController
class HelloController {

    @RequestMapping("/")
    fun hello(@RequestParam("name") name: String?): HelloMessage {
        return HelloMessage(name ?: "Anonymous");
    }

}