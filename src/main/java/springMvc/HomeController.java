package springMvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
// to enable controller annotation we have to configure in the spring-servlet.xml file
//@controller means this HomeController class is a controller
@RequestMapping(path="/first",method=RequestMethod.GET)
public class HomeController {
	
	@RequestMapping("/home")
	// This annotation means if anyone requesting /home then this home method will called
	public String home(Model model)  //passing model object in this method.. using model object to pass value to jsp
	{
		model.addAttribute("Name","Md Amir Alam Ansari");// adding this data
		model.addAttribute("Empid","MSI3966");
		System.out.println("This home method is called");
		List<String> team=new ArrayList<String>();
		team.add("Venketesh");
		team.add("prabhu");
		team.add("Chhaya");
		team.add("Anouska");
		team.add("Ranjini");
		model.addAttribute("d", team);
		return "index";
	}
	
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
    @RequestMapping("/help")
	public ModelAndView help()
	{
    	//Creating model and view object
    	ModelAndView modelview=new ModelAndView();
    	modelview.addObject("name", "Amir");
    	modelview.addObject("roll", 9);
    	LocalDateTime local=LocalDateTime.now();
    	modelview.addObject("time",local);
    	ArrayList al=new ArrayList();
    	al.add("amir");
    	al.add("sam");
    	al.add("semi");
    	modelview.addObject("array",al);
    	//Setting view name in which i have to show name
    	modelview.setViewName("help");
		return modelview;
	}
}
