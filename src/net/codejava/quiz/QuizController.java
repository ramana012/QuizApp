package net.codejava.quiz;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuizController {

	@Autowired
	private QuizService qs;
	private int cout=0;
	private String status="";
	
	@RequestMapping("/")
	public ModelAndView home() {
		Random rand = new Random(); 
        int rand1 = rand.nextInt(4); 
        if(rand1==0){
        	rand1=1;
        }
		QuizClass listCustomer = qs.getQuiz(rand1);
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listCustomer", listCustomer);
		mav.addObject("count",cout);
		mav.addObject("status",status);
		return mav;
	}
	@RequestMapping("/ans")
	public ModelAndView answ(@RequestParam int id,int cid) {
		if(id==cid){
			System.out.println(cid+"-----hello-----------------");
			status="Correct Answer";
			cout++;
		}
		else{
			status="Wrong Answer";
		}
		//QuizClass listCustomer = qs.getQuiz();
		//ModelAndView mav = new ModelAndView("index");
		//mav.addObject("listCustomer", listCustomer);
		return home();
	}
}
