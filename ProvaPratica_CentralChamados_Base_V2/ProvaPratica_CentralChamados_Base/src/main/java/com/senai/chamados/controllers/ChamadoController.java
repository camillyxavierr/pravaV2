
package com.senai.chamados.controllers;

import com.senai.chamados.dtos.ChamadoDto;
import com.senai.chamados.services.ChamadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/chamados")
public class ChamadoController {

    private final ChamadoService service;

    public ChamadoController(ChamadoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {

        // TODO AVALIACAO C1:
        // Obter a lista de chamados pelo Service.

        List<ChamadoDto> lista = new ArrayList<>();

        model.addAttribute("chamados", lista);

        return "chamados/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {

        // TODO AVALIACAO C2:
        // Preparar o DTO para o formulario.

        model.addAttribute("chamado", new ChamadoDto());

        return "chamados/form";
    }

    @PostMapping("/salvar")
    public String salvar(
            @ModelAttribute("chamado") ChamadoDto dto,
            Model model) {

        // TODO AVALIACAO C3:
        // Cadastrar chamado utilizando o Service.

        return "redirect:/chamados";
    }

    @GetMapping("/editar/{id}")
    public String editar(
            @PathVariable Long id,
            Model model) {

        // TODO AVALIACAO C4:
        // Buscar chamado pelo ID utilizando o Service.

        ChamadoDto dto = new ChamadoDto();

        // Dados ficticios apenas para visualizar a tela.
        dto.setId(id);
        dto.setTitulo("Chamado de exemplo");
        dto.setDescricao("Descricao de exemplo");
        dto.setStatus("ABERTO");

        model.addAttribute("chamado", dto);

        return "chamados/form";
    }

    @PostMapping("/atualizar/{id}")
    public String atualizar(
            @PathVariable Long id,
            @ModelAttribute("chamado") ChamadoDto dto) {

        // TODO AVALIACAO C5:
        // Atualizar chamado utilizando o Service.

        return "redirect:/chamados";
    }

    @PostMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {

        // TODO AVALIACAO C6:
        // Excluir chamado utilizando o Service.

        return "redirect:/chamados";
    }
}
