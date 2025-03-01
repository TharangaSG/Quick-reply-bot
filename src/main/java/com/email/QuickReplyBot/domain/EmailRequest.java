package com.email.QuickReplyBot.domain;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;

}
