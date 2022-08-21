package springMvc;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMvc.model.User;
import springMvc.service.UserService;

@Controller
public class ViewController 
{
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonMathod(Model model) 
	{
		model.addAttribute("Header","Learn Spring Mvc");
		model.addAttribute("desc", "Home for programmer");
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
//	@RequestMapping(path="/process",method=RequestMethod.POST)
//	//Old way which we were using in servlet
//	public String process(HttpServletRequest request)
//	{
//		
//		String email1=(String) request.getParameter("add");
//		String username1=(String) request.getParameter("user");
//		String password1=(String) request.getParameter("pass");
//		
//		ArrayList<String> login=new ArrayList<String>();
//		login.add(email1);
//		login.add(username1);
//		login.add(password1);
//		System.out.println(login);
//		return "success";
//	}
	@RequestMapping(path="/process",method=RequestMethod.POST)
	public String handlerMethod(@ModelAttribute("user") User user,Model model)
	{
		if(user.getEmail().isBlank())
		{
			return "redirect:/contact";
		}
		int id=(Integer)userService.createUser(user);
		model.addAttribute("id");
		
		return "success";
	}
//	@RequestMapping(path="/process",method=RequestMethod.POST)
//	public String handlerMethod(@RequestParam("email") String Email,
//			@RequestParam("username") String userName, 
//			@RequestParam("password") String passWord,Model model)
//	{
//		System.out.println("email:"+Email+" "+"username:"+userName+" "+"password:"+passWord);
//		model.addAttribute("email", Email);
//		model.addAttribute("username", userName);
//		model.addAttribute("password", passWord);
//		return "success";
//	}

}
