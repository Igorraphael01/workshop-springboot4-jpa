package com.educandoweb.ProjetoCurso.services;

import com.educandoweb.ProjetoCurso.entities.Category;
import com.educandoweb.ProjetoCurso.entities.User;
import com.educandoweb.ProjetoCurso.repositores.CategoryRepository;
import com.educandoweb.ProjetoCurso.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
