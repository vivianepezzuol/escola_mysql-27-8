package com.senai.escola.Controller;

import com.senai.escola.Models.Aluno;
import com.senai.escola.Models.Professor;
import com.senai.escola.Service.AlunoService;
import com.senai.escola.Service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }


    @GetMapping
    public List<Professor> buscarProfessor(){
        return professorService.buscarTodosProfessor();
    }

    @PostMapping
    public Professor salvar(@RequestBody Professor professor){
        return professorService.salvarNovoprofessor(professor);
    }


    @DeleteMapping("/{id}")
    public void excluirProfessor( @PathVariable Long id){
        professorService.deleteProfessor (id);
    }


    @GetMapping("/{id}")
    public Professor buscarProfessorid(@PathVariable Long id){
        return professorService.buscarprofessorid(id);
    }



}
