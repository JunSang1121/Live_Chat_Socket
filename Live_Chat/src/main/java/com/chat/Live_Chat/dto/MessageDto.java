package com.chat.Live_Chat.dto;

import com.chat.Live_Chat.Enum.MessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {


    private MessageType type;
    private String roomId;
    private String sender;
    private String content;
    private String time;



}
