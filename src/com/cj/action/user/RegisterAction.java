package com.cj.action.user;

import com.cj.action.SuperAction;
import com.cj.dao.RegisterDao;
import com.cj.model.User;

public class RegisterAction extends SuperAction {

	private static final long serialVersionUID = -8232297084450409340L;
    User user = new User();
    
    @Override
    public String execute() {
        boolean check = new RegisterDao().writeStudent(user);
        
        if(check) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    public String toRegisterPage() {
        return "toRegisterPage";
    }
    
    
    
    public User getUser() {
        return user;
    }
    public void setAccount(User user) {
        this.user = user;
    }
}
