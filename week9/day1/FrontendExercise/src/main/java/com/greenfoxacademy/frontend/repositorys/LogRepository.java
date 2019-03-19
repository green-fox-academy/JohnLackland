package com.greenfoxacademy.frontend.repositorys;

import com.greenfoxacademy.frontend.model.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
