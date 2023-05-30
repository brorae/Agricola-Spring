package com.example.demo.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReadyMessage {

    private String type;
    private String sender;
    private String channelId;
    private String data;
}
