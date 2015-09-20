package cn.thiki.phonebook.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ù˝ on 2015/9/20.
 */
@Controller
@RequestMapping("/hello")
public class PersonsService {
    @ResponseBody
    @RequestMapping("/spring")
    public String printWelcome() {
        return "hello spring";
    }
    @ResponseBody
    @RequestMapping("/persons")
    public String loadPersons() {
        return "hello spring";
    }
}
