package com.educandoweb.ProjetoCurso.services;

import com.educandoweb.ProjetoCurso.entities.Product;
import com.educandoweb.ProjetoCurso.entities.User;
import com.educandoweb.ProjetoCurso.repositores.ProductRepository;
import com.educandoweb.ProjetoCurso.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
