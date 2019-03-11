package com.greenfoxacademy.secondexercise.repository;

import com.greenfoxacademy.secondexercise.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryInterface extends CrudRepository<Todo, Long> {
}
