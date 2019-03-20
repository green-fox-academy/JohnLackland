package com.greenfoxacademy.weekendtrial.repositoryes;

import com.greenfoxacademy.weekendtrial.models.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLRepository extends CrudRepository<Link, Integer> {
}
