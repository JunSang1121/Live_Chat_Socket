package com.chat.Live_Chat.repository;

import com.chat.Live_Chat.Entity.ChatUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<ChatUser,Long> {
    ChatUser findByEmail(String email);
}
