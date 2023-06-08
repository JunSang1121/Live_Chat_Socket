package com.chat.Live_Chat.chat_test;

import com.chat.Live_Chat.dto.ChatRoomDto;
import com.chat.Live_Chat.dto.UserDto;
import com.chat.Live_Chat.repository.UserRepo;
import com.chat.Live_Chat.service.ChatRoomService;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional

public class userTest {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ChatRoomService chatRoomService;

    @Test
    @Rollback(value = false)
    public void saveTes(){
        Long id = 1L;
        String username = "hello";
        String email = "asdf@ggg";

        UserDto dto = UserDto.builder()
                .userId(id)
                .username(username)
                .build();




    }

    @Test
    @Rollback(value = false)
    public void create_test(){

        String name1 = "test1";
        String name2 = "test2";
        String name3 = "test3";

        chatRoomService.createRoom(name1);
        chatRoomService.createRoom(name2);
        chatRoomService.createRoom(name3);

        chatRoomService.findAllRoom();
        assertThat("name1").isEqualTo()
    }
}
