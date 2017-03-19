package com.iqmsoft.boot.wlogic.jpa.service;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.iqmsoft.boot.wlogic.jpa.entity.Person;

public interface PeopleService {
	Person register(@NotNull @Validated Person person);
	boolean registered(Long id);
	Person details(@NotNull Long id);
	List<Person> list();
}
