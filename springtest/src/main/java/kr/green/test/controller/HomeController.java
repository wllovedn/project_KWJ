package kr.green.test.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.service.MemberService;
import kr.green.test.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	MemberService memberService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView signinGet(ModelAndView mv) {
		mv.setViewName("signin");
		return mv;
	}
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public ModelAndView signinPost(ModelAndView mv,MemberVO user) {
		System.out.println(user);
		//서비스에게 아이디와 비밀번호를 전달하면, 해당 정보가 DB에 있으면
		//회원 정보를 없으면 null을 반환
		//작업이 다 끝난 후 URI가 /signin인 곳으로 넘어감
		mv.setViewName("redirect:/");
		return mv;
	}
	
}