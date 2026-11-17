package com.senai.chamados.controllers;
import com.senai.chamados.models.UsuarioEntity;
import com.senai.chamados.repositories.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
public class LoginController {

    private final UsuarioRepository repository;

    private final BCryptPasswordEncoder encoder;

    public LoginController(UsuarioRepository repository,BCryptPasswordEncoder encoder){
        this.repository=repository;
        this.encoder=encoder;
    }

    @GetMapping("/login")
    public String formulario(){
        return "login";
    }

    @PostMapping("/login")
    public String entrar(@RequestParam String login,@RequestParam String senha,HttpSession sessao,Model model){

        // TODO AVALIACAO L1: pesquisar login no repository e conferir a senha informada com encoder.matches(senha, usuario.getSenhaHash()).
        // OBS: o BCrypt já está configurado, não compare senha em texto puro.

        boolean credenciaisValidas = true; // SUBSTITUIR pela validação real.

        if(credenciaisValidas){
            sessao.setAttribute("usuarioLogado",login);
            return "redirect:/chamados";
        }

        model.addAttribute("erro","Login ou senha inválidos");
        return "login";
    }

    @GetMapping("/logout")
    public String sair(HttpSession sessao){
        sessao.invalidate();
        return "redirect:/login";
    }

}
