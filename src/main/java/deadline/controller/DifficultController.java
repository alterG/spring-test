package deadline.controller;

import deadline.service.DifficultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

@Controller
public class DifficultController {

    private DifficultService difficultService;

    public DifficultController(DifficultService difficultService) {
        this.difficultService = difficultService;
    }

    @RequestMapping("/difficult")
    @ResponseBody
    public String control() {
        return difficultService.say();
    }

}
