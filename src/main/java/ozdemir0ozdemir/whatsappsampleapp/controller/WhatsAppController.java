package ozdemir0ozdemir.whatsappsampleapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
class WhatsAppController {

//    @PostMapping("/whatsapp")
//    void whatsapp(@RequestBody String body) {
//        System.out.println(body);
//    }

    @PostMapping("/{path}")
    void whatsapp(@RequestBody String body, @PathVariable String path) {
        System.out.println("PATH: " + path);
        System.out.println("BODY: " + body);
    }
}
