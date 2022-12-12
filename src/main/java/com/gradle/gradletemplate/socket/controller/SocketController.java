package com.gradle.gradletemplate.socket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.*;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SocketController {


	@RequestMapping(value = "/socket/socketPage", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView SocketPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("socket/socketPage");
		return mv;
	}

}
