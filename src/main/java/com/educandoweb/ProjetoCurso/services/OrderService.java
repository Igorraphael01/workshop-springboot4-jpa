package com.educandoweb.ProjetoCurso.services;

import com.educandoweb.ProjetoCurso.entities.Order;
import com.educandoweb.ProjetoCurso.entities.User;
import com.educandoweb.ProjetoCurso.repositores.OrderRepository;
import com.educandoweb.ProjetoCurso.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

