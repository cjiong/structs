package com.cj.action.operation;

import java.util.*;

import com.cj.action.SuperAction;
import com.cj.model.Student;
import com.cj.dao.StudentDao;

public class SelectStudentAction extends SuperAction {

	private static final long serialVersionUID = 117714108782554234L;
    private int number;
    
    @Override
    public String execute() {
        
        List<Student> selectList = new StudentDao().selectStudent(number);
        mapRequest.put("selectList", selectList);
        if(!selectList.equals(null)) {
            return SUCCESS;            
        } else {
            return ERROR;
        }
    }
    
    public String selectAllStudent() {
    
        List<Student> selectAllList = new StudentDao().selectStudent();
        mapRequest.put("selectList", selectAllList);
        return SUCCESS;
    }

    public String toSelectPage() {
        return "toSelectPage";
    }
    

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
