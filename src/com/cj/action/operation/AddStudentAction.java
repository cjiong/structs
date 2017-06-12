package com.cj.action.operation;

import com.cj.action.SuperAction;
import com.cj.dao.StudentDao;
import com.cj.model.Student;

public class AddStudentAction extends SuperAction {

	private static final long serialVersionUID = 8363141491437502868L;
	
	private Student student;
	
	@Override
	public String execute() {
        boolean checkAdd = new StudentDao().addStudent(student);
        
        if (checkAdd) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    public String toAddPage() {
        return "toAddPage";
    }
    
    

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
