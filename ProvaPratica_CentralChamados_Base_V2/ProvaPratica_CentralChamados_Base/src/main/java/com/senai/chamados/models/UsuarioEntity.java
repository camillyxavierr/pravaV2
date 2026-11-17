package com.senai.chamados.models;
import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class UsuarioEntity {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false,unique=true,length=60)
    private String login;

    @Column(nullable=false,length=100)
    private String senhaHash;

    public Long getId(){
     return id;
    }

    public void setId(Long id){
     this.id=id;
    }

    public String getLogin(){
     return login;
    }

    public void setLogin(String login){
     this.login=login;
    }

    public String getSenhaHash(){
     return senhaHash;
    }

    public void setSenhaHash(String senhaHash){
     this.senhaHash=senhaHash;
    }
}
