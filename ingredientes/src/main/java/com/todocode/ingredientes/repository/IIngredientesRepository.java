package com.todocode.ingredientes.repository;

import com.todocode.ingredientes.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIngredientesRepository extends JpaRepository<Ingrediente, Long> {

}
