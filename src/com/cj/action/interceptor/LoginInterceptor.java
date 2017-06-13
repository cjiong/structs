package com.cj.action.interceptor;

import java.util.Map;

import com.cj.util.Constants;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1266367680914085592L;
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = invocation.getInvocationContext();  
        Map<String, Object> session = ctx.getSession();
        
    String user1 = (String) session.get(Constants.USER_SESSION);
        
        if ((user1 != null) && (!user1.equals(""))) {
            return invocation.invoke();
        }
        
        ctx.put("tip", "cwu");
        return Action.LOGIN;
	}

}
