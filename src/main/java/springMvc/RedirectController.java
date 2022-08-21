package springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	//redirect prefix
	@RequestMapping("/one")
	public String one()
	{
		System.out.println("this is one handler");
		return "redirect:/two ";
	}
	
	@RequestMapping("/two")
    public String two()
    {
    	System.out.println("This is 2nd handler");
    	return "contact";
	   
    }
	//Redirect View 
	@RequestMapping("/amir")
	 public RedirectView amir()
	 {
		 RedirectView redirectview=new RedirectView();
		 redirectview.setUrl("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 return redirectview;
	 }
}
