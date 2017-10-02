package deadline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

@Controller
public class GreetingController {

    @RequestMapping("/")
    @ResponseBody
    public String greeting() {
        return "Hello World";
    }
}
