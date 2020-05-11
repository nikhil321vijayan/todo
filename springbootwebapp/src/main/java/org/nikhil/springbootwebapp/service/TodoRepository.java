package org.nikhil.springbootwebapp.service;

import java.util.List;

import org.nikhil.springbootwebapp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

	List<Todo> findByUser(String user);
}
