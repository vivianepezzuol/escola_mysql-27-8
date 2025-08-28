package com.senai.escola.Interface;

import com.senai.escola.Models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Professorrepository extends JpaRepository<Aluno, Long> {
}
