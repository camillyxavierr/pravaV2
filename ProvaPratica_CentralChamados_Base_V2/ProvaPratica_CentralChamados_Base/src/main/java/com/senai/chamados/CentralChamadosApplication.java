package com.senai.chamados;
import com.senai.chamados.models.UsuarioEntity;
import com.senai.chamados.repositories.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@SpringBootApplication
public class CentralChamadosApplication {

    public static void main(String[] args){
        SpringApplication.run(CentralChamadosApplication.class,args);
    }

    @Bean BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean CommandLineRunner usuarioInicial(UsuarioRepository repository, BCryptPasswordEncoder encoder){
        return args -> {
            if(repository.findByLogin("aluno").isEmpty()){
                UsuarioEntity u = new UsuarioEntity();u.setLogin("aluno");u.setSenhaHash(encoder.encode("senai123"));repository.save(u);
            }
        };

    }
}
