package com.iqmsoft.boot.wlogic.jpa.ejb3;

import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iqmsoft.boot.wlogic.jpa.repository.PeopleRepository;
import com.iqmsoft.boot.wlogic.jpa.service.PeopleService;

@Remote(MyServiceInterface.class)
@Service
@Stateless(name = "MyService", mappedName = "ejb/MyService")
@Transactional

public class MyService implements MyServiceInterface {

	@PersistenceContext
	EntityManager entityManager;
	
	public void someMethod() {
		System.out.println("Hello World!");
		
	}

	public void someMethod1() {
		System.out.println("Hello World!");
	}

	public void someData() {
		System.out.println("Hello World!");
	}

}
