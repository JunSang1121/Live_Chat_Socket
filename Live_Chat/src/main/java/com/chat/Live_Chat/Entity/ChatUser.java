package com.chat.Live_Chat.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Table
public class ChatUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private String passwd;

    @Builder
    public ChatUser(Long userId, String username, String email, String passwd){
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.passwd = passwd;
    }

}
