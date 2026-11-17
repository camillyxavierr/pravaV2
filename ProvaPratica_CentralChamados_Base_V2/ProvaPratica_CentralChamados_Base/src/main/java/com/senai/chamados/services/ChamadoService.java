package com.senai.chamados.services;
import java.util.List;
import com.senai.chamados.dtos.ChamadoDto;
import com.senai.chamados.models.ChamadoEntity;
import com.senai.chamados.repositories.ChamadoRepository;
import org.springframework.stereotype.Service;

@Service
public class ChamadoService {

    private final ChamadoRepository repository;

    public ChamadoService(ChamadoRepository repository){
        this.repository=repository;
    }

    public List<ChamadoDto> obter(){
        // TODO AVALIACAO S1: consultar as entidades e transformar a lista em DTO.
        throw new UnsupportedOperationException("Implementar S1: obter");
    }

    public ChamadoDto buscar(Long id){
        // TODO AVALIACAO S2: localizar pelo ID e converter em DTO; devolver null se não existir.
        throw new UnsupportedOperationException("Implementar S2: buscar");
    }

    public boolean cadastrar(ChamadoDto dto){
        // TODO AVALIACAO S3: validar titulo/descricao; criar Entity; status ABERTO; salvar; retornar true.
        throw new UnsupportedOperationException("Implementar S3: cadastrar");
    }

    public boolean atualizar(Long id, ChamadoDto dto){
        // TODO AVALIACAO S4: localizar; atualizar titulo, descricao e status; retornar false se inexistente.
        throw new UnsupportedOperationException("Implementar S4: atualizar");
    }

    public boolean excluir(Long id){
        // TODO AVALIACAO S5: excluir pelo ID somente quando existente; retornar sucesso boolean.
        throw new UnsupportedOperationException("Implementar S5: excluir");
    }

}
