package com.hendisantika.springbootvuejs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-vuejs
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 06/12/17
 * Time: 21.20
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/")
public class ViewController {
    @GetMapping({"/", "/countries"})
    public ModelAndView countries(ModelAndView model) {
        model.setViewName("countries");
        return model;
    }
}
