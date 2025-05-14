package kaiomendes.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import kaiomendes.demo.entity.Tarefas;
import kaiomendes.demo.repository.tarefasRepository;

//para se torna passível de injeção precisa da anotação
@Service
public class tarefasService {
  private tarefasRepository tarefasRepository;

  public tarefasService(kaiomendes.demo.repository.tarefasRepository tarefasRepository) {
    this.tarefasRepository = tarefasRepository;
  } //constructor substitui o autowired na injeção de dependecias

  public List<Tarefas> create(Tarefas tarefas){
    tarefasRepository.save(tarefas);
    return list();
  }
  
  public List<Tarefas> list(){
    return tarefasRepository.findAll();
  }

  public List<Tarefas> update(Tarefas tarefas){
    tarefasRepository.save(tarefas);
    return list();

  }

  public List<Tarefas> delete(Long id){
    tarefasRepository.deleteById(id);;
    return list();
  }
}
