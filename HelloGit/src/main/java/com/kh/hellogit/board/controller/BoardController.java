package com.kh.hellogit.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@RequestMapping("blist.do")
	public String boardListSelect() {
		return "home";
	}
}
