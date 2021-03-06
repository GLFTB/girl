package cn.glftb.girl.controller;

import cn.glftb.girl.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    private StudentProperties studentProperties;
    @Value(value = "${test.telephone}")
    private String telephone;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {

        return studentProperties.getTelephone();
    }

    @RequestMapping(value = "/say/telephone", method = RequestMethod.GET)
    public String say2() {

        return studentProperties.getTelephone();
    }

    @RequestMapping(value = "/say/telephone1", method = RequestMethod.GET)
    public String say3() {
        return telephone;
    }

    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    public String say4(@PathVariable("id") Integer id) {
        return "id: " + id;
    }//NO!!!!!!!!

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say5(@RequestParam("id") Integer id) {
        return "id: " + id;

    }//YES!!!!!!!!


}


