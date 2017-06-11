package com.cj.action.user;

import com.cj.action.*;

public class LogoutAction extends SuperAction {

	private static final long serialVersionUID = 2710642116483072187L;

    public String execute(){
		mapSession.clear();
		return "success";
	}
}
