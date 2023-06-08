package com.chat.Live_Chat.dto;

import com.chat.Live_Chat.Entity.ChatUser;
import lombok.*;


@Getter
@NoArgsConstructor
public class UserDto {

    private Long userId;
    private String username;

    private String email;
    private String passwd;


    public ChatUser toEntity(){
        ChatUser build = ChatUser.builder()
                .userId(userId)
                .username(username)
                .email(email)
                .passwd(passwd)
                .build();
        return build;
    }


    @Builder
    public UserDto(Long userId, String username, String email, String passwd){
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.passwd = passwd;
    }
}
