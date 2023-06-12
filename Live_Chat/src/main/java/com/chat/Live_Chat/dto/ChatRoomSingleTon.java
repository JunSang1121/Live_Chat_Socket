package com.chat.Live_Chat.dto;

import lombok.Getter;

import java.util.concurrent.ConcurrentHashMap;

@Getter
public class ChatRoomSingleTon {
    private static ChatRoomSingleTon chatRoomSingleTon = new ChatRoomSingleTon();
    private ConcurrentHashMap<String,ChatRoomDto> chatRooms = new ConcurrentHashMap<>();

    private ChatRoomSingleTon(){};

    public static ChatRoomSingleTon getInstance(){
        return chatRoomSingleTon;
    }


    
}
