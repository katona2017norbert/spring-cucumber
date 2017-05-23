package ro.tibor;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class V1Controller {

	@RequestMapping(method = { RequestMethod.GET }, value = { "/test1" })
    public String sayHello(HttpServletResponse response) {
        return "test1";
    }
	
	@RequestMapping(method = { RequestMethod.GET }, value = { "/test2" })
    public String sayHello1(HttpServletResponse response) {
        return "test2";
    }
}
