package com.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.ejb.HelloWorldBeanRemote;

public class DemoClient {

	public static void main(String[] args) throws NamingException {
		InitialContext sc = new InitialContext();
		HelloWorldBeanRemote service = (HelloWorldBeanRemote) sc.lookup("java:global/EJB/HelloWorldBean!com.ejb.HelloWorldBeanRemote");
		String str = service.proccessHello();
		System.out.println("Message from EJB bean: "+str);

	}

}

