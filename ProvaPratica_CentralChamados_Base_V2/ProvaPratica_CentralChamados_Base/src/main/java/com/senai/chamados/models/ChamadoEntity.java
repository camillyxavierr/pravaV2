package com.senai.chamados.models;
import jakarta.persistence.*;

@Entity
@Table(name="chamado")
public class ChamadoEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false,length=100)
    private String titulo;

    @Column(nullable=false,length=300)
    private String descricao;

    @Column(nullable=false,length=20)
    private String status;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao=descricao;
    }

    public String getStatus(){return status;} public void setStatus(String status){
     this.status=status;
    }

}
