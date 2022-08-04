package com.codegym.service.impl;

import com.codegym.model.Size;
import com.codegym.repository.ISizeRepo;
import com.codegym.service.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SizeService implements ISizeService {
    @Autowired
    ISizeRepo iSizeRepo;
    @Override
    public List<Size> getAll() {
        return (List<Size>) iSizeRepo.findAll();
    }

    @Override
    public Size save(Size size) {
        return iSizeRepo.save(size);
    }
}
