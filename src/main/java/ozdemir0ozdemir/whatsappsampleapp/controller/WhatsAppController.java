package ozdemir0ozdemir.whatsappsampleapp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/webhooks")
class WhatsAppController {

    private static final Logger log = LoggerFactory.getLogger(WhatsAppController.class);

    @PostMapping
    void whatsapp(@RequestBody String body,
                  HttpServletRequest request) {
        log.info("webhook requested: {}", body);
        log.info("request: {}", request);
    }


    @GetMapping
    String verification(
            @RequestParam(name = "hub.mode") String hubMode,
            @RequestParam(name = "hub.challenge") String hubChallenge,
            @RequestParam(name = "hub.verify_token") String hubVerifyToken) {

        log.info("verify requested. mode: {}, challenge: {}, verify token: {}",
                hubMode, hubChallenge, hubVerifyToken);
        return hubChallenge;
    }
}
