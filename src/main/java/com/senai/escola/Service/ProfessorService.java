package com.senai.escola.Service;

import com.senai.escola.Interface.Professorrepository;
import com.senai.escola.Models.Aluno;
import com.senai.escola.Models.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    private final Professorrepository repository;

    public ProfessorService(Professorrepository professorrepository) {
        this.repository = repository;
    }


    public List<Professor> buscarTodosProfessor(){
        return repository.findAll();
    }

    public Professor salvarNovoprofessor(Professor professor){
        return repository.save(Professor);
    }

    public Professor buscarprofessorid(Long id){
        return repository.findById(id).orElse(null);
    }

    public void deleteProfessor(Long id){
        repository.deleteById(id);
    }

}
