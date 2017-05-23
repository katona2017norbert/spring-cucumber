package ro.tibor;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NorbiController {

	@RequestMapping(method = { RequestMethod.GET }, value = { "/norbi1" })
    public String sayHello(HttpServletResponse response) {
        return "norbi1";
    }

}
