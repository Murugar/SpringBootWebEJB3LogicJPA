package com.iqmsoft.boot.wlogic.jpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class MainController {
	@RequestMapping(method=RequestMethod.GET)
	public String hello(@RequestParam(name="name", defaultValue="Williams") String name) {
		return "Hello, ".concat(name);
	}
}