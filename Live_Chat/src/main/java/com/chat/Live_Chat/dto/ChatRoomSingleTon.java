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


    // 싱글톤 다시 공부해야함. 왜 static을 사용하는지, 왜 hashmap이 아니라 ConcurrentHashMap을 사용하는지, getinstance할때는 왜 static을 사용하는지 다시 공부.
    //        고정 메모리를 통해 객체를 1개만 사용하기 위해서,   멀티 스레드를 사용하여 1:n을 가능하게,    static을 사용하는 이유, 고정 메모리로 객체가 변경되지 않게
}
