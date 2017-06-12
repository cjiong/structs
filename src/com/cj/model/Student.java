package com.cj.model;

public class Student {

	private int stu_number;
	private String stu_name;
	private String stu_sex;
	private String stu_birthday;
	private String stu_department;
	
	public Student() {
		super();
	}
	
	public Student(int stu_id, String stu_name, String stu_sex,
            String stu_birthday, String stu_department) {
        super();
        this.stu_number = stu_id;
        this.stu_name = stu_name;
        this.stu_sex = stu_sex;
        this.stu_birthday = stu_birthday;
        this.stu_department = stu_department;
    }
	
	public int getStu_number() {
		return stu_number;
	}
	public void setStu_number(int stu_number) {
		this.stu_number = stu_number;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}
	public String getStu_birthday() {
		return stu_birthday;
	}
	public void setStu_birthday(String stu_birthday) {
		this.stu_birthday = stu_birthday;
	}
	public String getStu_department() {
		return stu_department;
	}
	public void setStu_department(String stu_department) {
		this.stu_department = stu_department;
	}
	
	
}
