package kaiomendes.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;

@Entity
@Table(name="Tarefas")
public class Tarefas {
  @Id //dizendo que é um id
  @GeneratedValue(strategy = GenerationType.IDENTITY) //para gerar sequencial no banco
  private Long id;
  private String nome;
  private String responsavel;
  private LocalDate data;
  private Boolean realizado;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }
  public LocalDate getData() {
    return data;
  }
  public void setData(LocalDate data) {
    this.data = data;
  }
  public boolean isRealizado() {
    return realizado;
  }
  public void setRealizado(boolean realizado) {
    this.realizado = realizado;
  }
}
