package cn.glftb.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

        return studentProperties.getTelephone();
    }

}


