package com.adm.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adm.main.dto.ChattingroomDTO;
import com.adm.main.repository.ChattingroomRepository;

@Controller
public class MainController {
	@Autowired
	ChattingroomRepository re;
	
	@RequestMapping("/")
	public String index() {
		ChattingroomDTO chatroom=new ChattingroomDTO().builder()
				.chatroomname("test")
				.chattime(new Date())
				.chatting_type(0)
				.build();
		System.out.println(chatroom);
		re.save(chatroom);
		
		return "NewFile";
	}
}
