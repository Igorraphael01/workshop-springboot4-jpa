package com.educandoweb.ProjetoCurso.repositores;

import com.educandoweb.ProjetoCurso.entities.OrderItems;
import com.educandoweb.ProjetoCurso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderitemsRepository extends JpaRepository<OrderItems, Long> {

}
