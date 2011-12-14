package springapp.web;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import springapp.domain.User;

public class AnnotatedControlerTest {
	
	@Test
	public void helloWorldTest() {
		
		AnnotatedControler controler = new AnnotatedControler();

		ModelAndView mv = controler.helloWorld();
		Assert.assertEquals(mv.getViewName(), "hello");
		
		User user = (User) mv.getModel().get("user");
		Assert.assertEquals(user.getName(), "Somebody");
	}
}
