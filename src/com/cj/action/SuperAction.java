package com.cj.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SuperAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware {
  
	private static final long serialVersionUID = 1234567890L;
	
	public Map<String, Object> mapRequest;
    public Map<String, Object> mapSession;
    public Map<String, Object> mapApplication;
    

    @Override
    public void setApplication(Map<String, Object> arg0) {
        mapApplication = arg0;
    }

    @Override
    public void setSession(Map<String, Object> arg0) {
        mapSession = arg0;
    }

    @Override
    public void setRequest(Map<String, Object> arg0) {
        mapRequest = arg0;
    }
}
