package my.com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import my.com.entity.Person;

@Controller
public class TrangChuController {
	
	@RequestMapping("/")
	public ModelAndView ViewTrangChu() {
		ModelAndView account = new ModelAndView();	
		account.setViewName("trangchu");
		return account;
	}
	
//	@RequestMapping("/dangnhap")
//	public String Login(ModelAndView andView) {
//		return "dangnhap";
//	}
}
