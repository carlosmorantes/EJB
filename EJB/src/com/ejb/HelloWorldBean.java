package com.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
@LocalBean
public class HelloWorldBean implements HelloWorldBeanRemote, HelloWorldBeanLocal {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
    }

	@Override
	public String proccessHello() {
		return "Hello World from Session bean";
	}

	

}
