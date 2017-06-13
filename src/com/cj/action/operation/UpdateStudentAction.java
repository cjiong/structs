package com.cj.action.operation;

import java.util.List;

import com.cj.action.SuperAction;
import com.cj.model.Student;
import com.cj.dao.StudentDao;

public class UpdateStudentAction extends SuperAction{

	private static final long serialVersionUID = 7753806215906424234L;
    private Student student;
    private int number;
    
    @Override
    public String execute(){
        boolean checkUpdate = new StudentDao().updateStudent(student);
        
        if (checkUpdate) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    public String toUpdatePage() {
        List<Student> selectList = new StudentDao().selectStudent(number);
        Student student = selectList.get(0);
        mapRequest.put("selectOne", student);
        return "toUpdatePage";
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }    
}
