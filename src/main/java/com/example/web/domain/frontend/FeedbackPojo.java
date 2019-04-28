package com.example.web.domain.frontend;

import java.io.Serializable;

public class FeedbackPojo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String email;
	private String firstName;
	private String lastName;
	private String feedback;
	public FeedbackPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedbackPojo(String email, String firstName, String lastName, String feedback) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.feedback = feedback;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "FeedbackPojo [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", feedback="
				+ feedback + "]";
	}
	
}
