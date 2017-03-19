package com.iqmsoft.boot.wlogic.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.WebApplicationInitializer;

import com.iqmsoft.boot.wlogic.jpa.entity.Person;
import com.iqmsoft.boot.wlogic.jpa.repository.PeopleRepository;

@SpringBootApplication
@EnableAutoConfiguration
public class SampleApplication extends SpringBootServletInitializer
		implements WebApplicationInitializer, CommandLineRunner {

	@Autowired
	private PeopleRepository prepos;

	private static final Class<SampleApplication> SOURCE = SampleApplication.class;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SOURCE).profiles("staging");
	}

	/**
	 * Main class, so that we still can start this application in embedded mode.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(SOURCE).profiles("dev").web(true).run(args);
	}

	@Override
	public void run(String... args) throws Exception {

		if (prepos.findAll().isEmpty()) {
			
			Person p = new Person();
			p.setEmail("shit@shit.com");
			p.setName("Crap");

			prepos.save(p);

			Person p1 = new Person();
			p1.setEmail("shit1@shit1.com");
			p1.setName("Crap1");

			prepos.save(p1);
		}

	}
}
