package com.codegym.repository;

import com.codegym.model.Color;
import org.springframework.data.repository.CrudRepository;

public interface IColorRepo extends CrudRepository<Color, Long> {
}
