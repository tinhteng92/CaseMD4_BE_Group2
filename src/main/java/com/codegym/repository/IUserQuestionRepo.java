package com.codegym.repository;

import com.codegym.model.UserQuestion;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserQuestionRepo extends PagingAndSortingRepository<UserQuestion, Long> {
}
