package com.codegym.service;

import com.codegym.model.Size;

import java.util.List;

public interface ISizeService{
    List<Size> getAll();
    Size save(Size size);
}
