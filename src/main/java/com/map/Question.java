package com.map;
import java.util.*;

import javax.persistence.*;

@Entity
public class Question {

	@Id
	private int questionId;
	private String question;

//	@OneToOne
//	@JoinColumn(name="a_id")
//	private Answer answer;
	
	@OneToMany(mappedBy="question")
	private List<Answer> answers;

	
	public Question(int questionId, String question, List<Answer> answers) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answers = answers;
}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


}
