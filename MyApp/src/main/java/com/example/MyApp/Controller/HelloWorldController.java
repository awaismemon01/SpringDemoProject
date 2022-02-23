package com.example.MyApp.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld"; 
	}

	@RequestMapping("/processFormVersionTwo")
	public String sayName(@RequestParam("studentName") String name, Model model) {
		
//		String name = request.getParameter("studentName");
		
		
		name = name.toUpperCase();
		
		System.out.println(name);
		
//		String result = "Yo!" + name;
		
//		System.out.println(result);
		
		model.addAttribute("message",name);
		
		System.out.println(model.getAttribute("message"));
		
		return "helloworld";
	}
	
}
