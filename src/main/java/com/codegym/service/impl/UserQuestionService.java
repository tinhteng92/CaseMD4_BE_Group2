package com.codegym.service.impl;

import com.codegym.model.UserQuestion;
import com.codegym.repository.IUserQuestionRepo;
import com.codegym.service.IUserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserQuestionService implements IUserQuestionService {
    @Autowired
    IUserQuestionRepo iUserQuestionRepo;

    @Override
    public UserQuestion save(UserQuestion userQuestion) {
        return iUserQuestionRepo.save(userQuestion);
    }

    @Override
    public Page<UserQuestion> getAll(Pageable pageable) {
        return iUserQuestionRepo.findAll(pageable);
    }
}
