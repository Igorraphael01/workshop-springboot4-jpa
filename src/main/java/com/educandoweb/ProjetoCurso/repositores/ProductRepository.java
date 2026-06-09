package com.educandoweb.ProjetoCurso.repositores;

import com.educandoweb.ProjetoCurso.entities.Category;
import com.educandoweb.ProjetoCurso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
