package com.greenfoxacademy.springslq.repository;

import com.greenfoxacademy.springslq.modells.Todo;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryInterface extends CrudRepository<Todo, Long> {
}
