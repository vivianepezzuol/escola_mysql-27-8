package com.senai.escola.Interface;

import com.senai.escola.Models.Aluno;
import com.senai.escola.Models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Professorrepository extends JpaRepository<Professor, Long> {
}
