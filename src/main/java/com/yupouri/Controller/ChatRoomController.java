package com.yupouri.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChatRoomController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showChatRoom(ModelAndView mav) {
        mav.setViewName("chatroom");
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView sendText(@RequestParam("name") String name, @RequestParam("text") String text) {
        TestLog.showString(name);
        TestLog.showString(text);
        return new ModelAndView("redirect:/");
    }

}
