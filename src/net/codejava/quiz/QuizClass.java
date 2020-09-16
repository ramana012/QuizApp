package net.codejava.quiz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="quizdb")
public class QuizClass {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idquiz;
	
	
	private String question;
	private String ans1;
	private String ans2;
	private String ans3;
	private String ans4;
	private String answer;
	
		
	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public QuizClass() {
	}

	
	public int getidquiz() {
		return idquiz;
	}
	public void setidquiz(int idquiz) {
		this.idquiz = idquiz;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getans1() {
		return ans1;
	}
	public void setans1(String ans1) {
		this.ans1 = ans1;
	}
	public String getans2() {
		return ans2;
	}
	public void setans2(String ans2) {
		this.ans2 = ans2;
	}
	public String getans3() {
		return ans3;
	}
	public void setans3(String ans3) {
		this.ans3 = ans3;
	}
	public String getans4() {
		return ans4;
	}
	public void setans4(String ans4) {
		this.ans4 = ans4;
	}	
	
	
}
