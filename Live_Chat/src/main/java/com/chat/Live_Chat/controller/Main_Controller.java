package com.chat.Live_Chat.controller;

import com.chat.Live_Chat.dto.ChatRoomDto;
import com.chat.Live_Chat.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/chat")
@Log4j2
public class Main_Controller {

    private final ChatRoomService chatRoomService;
    @GetMapping(value = "/rooms")
    public ModelAndView rooms(){
        log.info("SHOW ALL ChatList");
        ModelAndView mv = new ModelAndView("rooms");
        mv.addObject("list", chatRoomService.findAllRoom());
        return  mv;
    }

    @PostMapping(value = "/room")
    public String create(@RequestParam String name, RedirectAttributes rttr){
        log.info("# Create Chat Room , name: " + name);
        rttr.addFlashAttribute("roomName", chatRoomService.createRoom(name));
        return "redirect:/chat/rooms";
    }
    // view파일과 일치시키기

    public void del_Room(@RequestBody String roomId){
        chatRoomService.delete_Room(roomId);
    }



}
