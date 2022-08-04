package com.codegym.service;

import com.codegym.model.Color;

import java.util.List;

public interface IColorService {
    List<Color> getAll();
    Color save(Color color);
}
