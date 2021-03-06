package cn.glftb.girl.controller;

import cn.glftb.girl.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @RequestMapping(value = "/user/{username}/{age}", method = RequestMethod.GET)
    public String say4(@PathVariable("username") String username, @PathVariable("age") Integer age) {
        return "id: " + username + " " + age;

    }
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String say5(@RequestParam("username") String username, @RequestParam(value = "age",required = false,defaultValue ="0") Integer age) {
        return "id: " + username + ""+ age;

    }


}
