package kaiomendes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kaiomendes.demo.entity.Tarefas;
//repositorios sempre sao interfaces que estendem do JPAREPOSITORY
public interface tarefasRepository extends JpaRepository<Tarefas, Long>{ 
  
}
