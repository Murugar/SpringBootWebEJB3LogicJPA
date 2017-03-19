package com.iqmsoft.boot.wlogic.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.iqmsoft.boot.wlogic.jpa.entity.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Long> {

}
