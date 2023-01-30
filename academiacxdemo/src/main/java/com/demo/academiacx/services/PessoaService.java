package com.demo.academiacx.services;

import com.demo.academiacx.model.PessoaModel;
import com.demo.academiacx.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll() {
        List<PessoaModel> pessoaModels = pessoaRepository.findAll();

        return pessoaModels;
    }


    public PessoaModel findById(Long id) {

        PessoaModel pessoa = pessoaRepository.findById(id).get();
        return pessoa;
    }

    public PessoaModel insert(PessoaModel pessoaModel) {

        PessoaModel result = pessoaRepository.save(pessoaModel);

        return result;
    }

    public PessoaModel update(PessoaModel pessoaModel) {

        PessoaModel result = pessoaRepository.save(pessoaModel);

        return result;
    }

    public boolean delete(Long id) {

        findById(id);

        pessoaRepository.deleteById(id);

        return true;
    }
}