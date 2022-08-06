package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductAdmin {
    @Autowired
    IProductService iProductService;

    @GetMapping
    public Page<Product> getAll(@RequestParam(defaultValue = "0") int page) {
        return iProductService.getAll(PageRequest.of(page , 10));
    }

    @GetMapping("/{idProduct}")
    public Product findById(@PathVariable long idProduct){
        return iProductService.findById(idProduct);
    }

    @GetMapping("/search")
    public List<Product> findByName(@RequestParam(defaultValue = "")String nameProduct){
        return iProductService.findByName(nameProduct);
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return iProductService.save(product);
    }

    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile file){
        String name = file.getOriginalFilename();
        try{
            FileCopyUtils.copy(file.getBytes(),new File("/C:\\Users\\HD\\Desktop\\CaseMD4_FE_Group2\\eshopper-1.0.0\\img/"+name));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "img/"+name;
    }

    @PutMapping
    public Product edit(@RequestBody Product product){
        return iProductService.save(product);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        iProductService.delete(id);
    }


}
