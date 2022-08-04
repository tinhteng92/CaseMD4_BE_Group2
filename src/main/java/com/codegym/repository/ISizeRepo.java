package com.codegym.repository;

import com.codegym.model.Size;
import org.springframework.data.repository.CrudRepository;

public interface ISizeRepo extends CrudRepository<Size, Long> {
}
