package springapp.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springapp.domain.User;

@Controller
public class AnnotatedControler {

	@RequestMapping("/spring")
	public ModelAndView helloWorld() {
		
		User user = new User();
		user.setName("Somebody");
		user.setEmail("somebody@blabal.com");
		
		ModelAndView mav = new ModelAndView();
		String now = (new Date()).toString();
		mav.setViewName("hello");
		mav.addObject("now", now);
		mav.addObject("user", user);
		
		return mav;
	}
}