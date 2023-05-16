package com.jspiders.studentmangement.student;

public class Student {

	private int id;
	private String Name;
	private String Email_id;
	private long Mobile_no;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail_id() {
		return Email_id;
	}

	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}

	public long getMobile_no() {
		return Mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		Mobile_no = mobile_no;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Email_id=" + Email_id + ", Mobile_no=" + Mobile_no + "]";
	}
	
	

}
