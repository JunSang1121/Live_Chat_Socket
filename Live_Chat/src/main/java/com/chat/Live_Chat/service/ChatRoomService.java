package com.chat.Live_Chat.service;

import com.chat.Live_Chat.Entity.ChatUser;
import com.chat.Live_Chat.dto.ChatRoomDto;
import com.chat.Live_Chat.dto.ChatRoomSingleTon;
import com.chat.Live_Chat.dto.UserDto;
import com.chat.Live_Chat.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChatRoomService {

    //조회 *
    //생성 *
    //삭제 *
    //찾기 *


    private ConcurrentHashMap<String,ChatRoomDto> rooms = new ConcurrentHashMap<>();



    //전체 방 리스트
    public List<ChatRoomDto> findAllRoom(){
        List<ChatRoomDto> Rooms = new ArrayList<>(ChatRoomSingleTon.getInstance().getChatRooms().values());
        Collections.reverse(Rooms);
        return Rooms;
    }


    //id로 방찾기
    public ChatRoomDto findRoomId(String roomId){
        return ChatRoomSingleTon.getInstance().getChatRooms().get(roomId);
    }


    //생성
    public ChatRoomDto createRoom(String chatRoomName){

        String RandomId = UUID.randomUUID().toString();
        ChatRoomDto chatRoom = ChatRoomDto.builder()
                .chatRoomId(RandomId)
                .chatRoomName(chatRoomName)
                .build();

        rooms.put(RandomId,chatRoom);

        return chatRoom;
    }

    //방 삭제
    public void delete_Room(String roomId){
        ChatRoomSingleTon.getInstance().getChatRooms().remove(roomId);
    }



}
