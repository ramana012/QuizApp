package net.codejava.quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sun.xml.bind.v2.model.core.ID;

public interface QuizRepositery extends CrudRepository<QuizClass , Long> {

	@Query("Select q from quizdb q where id=?1")
	public QuizClass getQuiz(int id);
	
}
