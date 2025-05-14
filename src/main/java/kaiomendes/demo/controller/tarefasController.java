package kaiomendes.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kaiomendes.demo.entity.Tarefas;
import kaiomendes.demo.repository.tarefasRepository;
import kaiomendes.demo.service.tarefasService;

@RestController
@RequestMapping("/tarefas")
public class tarefasController {
  private tarefasService tarefasService;
  //retornando na camada view o q foi feito no back end em service
  public tarefasController(kaiomendes.demo.service.tarefasService tarefasService) {
    this.tarefasService = tarefasService;
  }

  @PostMapping
  List<Tarefas> create(@RequestBody Tarefas tarefas){
    return tarefasService.create(tarefas);
  }

  @GetMapping
  List<Tarefas> list(){
    return tarefasService.list();

  }

  @PutMapping
  List<Tarefas> update(@RequestBody Tarefas tarefas){
    return tarefasService.update(tarefas);

  }
  
  @DeleteMapping("{id}")
  List<Tarefas> delete(@PathVariable("id") Long id){
    return tarefasService.delete(id);

  }

  public void setTarefasService(tarefasService tarefasService) {
    this.tarefasService = tarefasService;
  }
}
