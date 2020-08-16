package com.kh.hellogit.notice.controller;

import org.springframework.stereotype.Controller;

@Controller
public class NoticeController {
  @RequestMapping("nlist.do")
  public String noticeListSelect(){
    return "home";
  }

}
