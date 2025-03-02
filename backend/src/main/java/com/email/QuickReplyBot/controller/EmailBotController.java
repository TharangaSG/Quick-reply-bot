package com.email.QuickReplyBot.controller;

import com.email.QuickReplyBot.domain.EmailRequest;
import com.email.QuickReplyBot.services.EmailBotService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailBotController {

    private final EmailBotService emailBotService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailBotService.generateReply(emailRequest);
        return ResponseEntity.ok(response);

    }
}
