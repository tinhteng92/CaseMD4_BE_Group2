package com.codegym.service.impl;

import com.codegym.model.Color;
import com.codegym.repository.IColorRepo;
import com.codegym.service.IColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService implements IColorService {
    @Autowired
    IColorRepo iColorRepo;
    @Override
    public List<Color> getAll() {
        return (List<Color>) iColorRepo.findAll();
    }

    @Override
    public Color save(Color color) {
        return iColorRepo.save(color);
    }
}
