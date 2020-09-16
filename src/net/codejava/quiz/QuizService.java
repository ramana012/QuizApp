package net.codejava.quiz;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Service
@Transactional
public class QuizService {
	@Autowired
	QuizRepositery qr;
	
	public QuizClass getQuiz(int id){
		return qr.getQuiz(id);
	}
	
}
