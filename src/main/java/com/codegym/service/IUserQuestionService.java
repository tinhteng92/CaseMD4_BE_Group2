package com.codegym.service;

import com.codegym.model.UserQuestion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserQuestionService {
    UserQuestion save(UserQuestion userQuestion);
    Page<UserQuestion> getAll (Pageable pageable);
}
