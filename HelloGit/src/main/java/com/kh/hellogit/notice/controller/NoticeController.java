package com.kh.hellogit.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
  @RequestMapping("nlist.do")
  public String noticeListSelect(){
	  System.out.println("hello");
    return "home";
  }

}
