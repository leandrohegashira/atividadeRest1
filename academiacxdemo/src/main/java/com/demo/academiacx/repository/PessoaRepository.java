package com.demo.academiacx.repository;

import com.demo.academiacx.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

}
