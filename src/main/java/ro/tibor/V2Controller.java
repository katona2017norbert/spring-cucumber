package ro.tibor;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class V2Controller {

	@RequestMapping(method = { RequestMethod.GET }, value = { "/egy2ketto5" })
    public String egyKetto1(HttpServletResponse response) {
        return "" + (2 + 5);
    }
	
	@RequestMapping(method = { RequestMethod.GET }, value = { "egy3ketto1" })
    public String egyKetto2(HttpServletResponse response) {
		 return "" + (3 + 1);
    }
	
	@RequestMapping(method = { RequestMethod.GET }, value = { "/egy5ketto1" })
    public String egyKetto3(HttpServletResponse response) {
		return "" + (5 + 1);
    }
}
