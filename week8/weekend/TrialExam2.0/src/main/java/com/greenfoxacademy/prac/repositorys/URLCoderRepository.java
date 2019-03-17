package com.greenfoxacademy.prac.repositorys;

import com.greenfoxacademy.prac.models.URLCoder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface URLCoderRepository extends CrudRepository<URLCoder, Long> {
}
