package com.cj.action.operation;

import com.cj.action.SuperAction;
import com.cj.dao.StudentDao;

public class DeleteStudentAction extends SuperAction {

	private static final long serialVersionUID = -2889068838703617160L;
    private int number;
    
    @Override
    public String execute() {
        boolean checkDelete = new StudentDao().deleteStudent(number);
        
        if(checkDelete) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
