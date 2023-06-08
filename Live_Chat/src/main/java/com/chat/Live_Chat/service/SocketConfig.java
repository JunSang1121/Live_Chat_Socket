package com.chat.Live_Chat.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


@Configuration
@EnableWebSocketMessageBroker
public class SocketConfig implements WebSocketMessageBrokerConfigurer {


    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry.addEndpoint("/").setAllowedOrigins("*").withSockJS();
    }

//    public void configureMessageBroker(MessageBrokerRegistry registry){
//        registry.enableSimpleBroker("/roomname");
//        registry.setApplicationDestinationPrefixes("/message");
//    }
}
