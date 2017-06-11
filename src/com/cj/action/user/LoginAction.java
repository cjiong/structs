package com.cj.action.user;

import com.cj.action.SuperAction;
import com.cj.dao.LoginDao;
import com.cj.model.User;
import com.cj.util.*;

public class LoginAction extends SuperAction {

	private static final long serialVersionUID = 8858495057397661353L;
    User user = new User();
    
    @Override
    public String execute() {
        boolean check = new LoginDao().checkLegal(user);
        mapSession.put(Constants.USER_SESSION, String.valueOf(user.getUsername()));
        
        if (check) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    public String toLoginPage() {
        return "toLoginPage";
    }
    
    
    
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
