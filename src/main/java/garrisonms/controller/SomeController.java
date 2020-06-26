package garrisonms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SomeController {

    @ResponseBody
    @RequestMapping(value = "/cicdtest", method = RequestMethod.GET)
    public String ciCdTest() {
        return "CI/CD test v 0.1 worked";
    }
}