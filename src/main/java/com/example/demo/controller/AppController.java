package com.example.demo.controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ContactDaoImpl;
import com.example.demo.dao.CourseDao;
import com.example.demo.dao.CourseDaoImpl;
import com.example.demo.dao.FeedbackDao;
import com.example.demo.dao.FeedbackDaoImpl;
import com.example.demo.dao.UserDaoImpl;
import com.example.demo.model.Contact;
import com.example.demo.model.Course;
import com.example.demo.model.Feedback;
import com.example.demo.model.User;

@RestController
public class AppController {
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/course")
	public ModelAndView course() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("course");
		return mv;
	}
	
	@RequestMapping("/feedback")
	public ModelAndView feedback() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("feedback");
		return mv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contact");
		return mv;
	}
	
	@RequestMapping("/registration")
	public ModelAndView registration() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping("/registerUser")
	public ModelAndView registerUser(User user) {
		System.out.println("User Data:"+user);
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		boolean result = userDaoImpl.registerUser(user);
		return redirect(result);
	}
	
	@RequestMapping("/addContact")
	public ModelAndView addContact(@ModelAttribute("contactFormData")Contact contact) {
		System.out.print(contact);
		ContactDaoImpl contactDaoImpl = new ContactDaoImpl();
		boolean result = contactDaoImpl.addContact(contact);
		return redirect(result);
	}
	
	
	@RequestMapping("/addFeedback")
	public ModelAndView addFeedback(Feedback feedback) {
		FeedbackDao feedbackdao = new FeedbackDaoImpl();
		System.out.println(feedback);
		boolean result = feedbackdao.addFeedback(feedback);
		return redirect(result);
	}
	
	private ModelAndView redirect(boolean result) {
		ModelAndView mv = new ModelAndView();
		if(result == true) {
			
			mv.setViewName("success");
		}
		else {
			mv.setViewName("Failure");
		}
		return mv;
		
	}

	@RequestMapping("/addCourse")
	public ModelAndView addCourse(Course course) {
		CourseDao courseDao = new CourseDaoImpl();
		System.out.print(course);
		boolean result = courseDao.addCourse(course);
		return redirect(result);
	}
}
