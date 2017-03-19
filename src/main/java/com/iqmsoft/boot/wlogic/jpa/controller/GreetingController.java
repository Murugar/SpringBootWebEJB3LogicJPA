package com.iqmsoft.boot.wlogic.jpa.controller;

import javax.ejb.EJB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.iqmsoft.boot.wlogic.jpa.ejb3.MyServiceInterface;


@RestController
@RequestMapping(value="/greet")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class GreetingController {
	
	@EJB(mappedName="ejb/MyService")
	protected MyServiceInterface myService;


	@RequestMapping(method=RequestMethod.GET)
	public String hello(@RequestParam(name="name", defaultValue="Guest") String name) {
		myService.someMethod();
		myService.someMethod1();
		return "Greetings , ".concat(name);
	}
}
