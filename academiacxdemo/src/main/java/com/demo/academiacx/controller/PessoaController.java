package com.demo.academiacx.controller;

import java.util.List;
import com.demo.academiacx.model.PessoaModel;
import com.demo.academiacx.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pessoa")

public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<PessoaModel> response = pessoaService.findAll();
        return response == null ? ResponseEntity.unprocessableEntity().build() : ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public PessoaModel findById(@PathVariable Long id){
        return pessoaService.findById(id);

    }

    @PostMapping("/save")
    public PessoaModel insert(@RequestBody PessoaModel pessoaModel) {

        return pessoaService.insert(pessoaModel);
    }

    @PutMapping("/update")
    public PessoaModel update(@RequestBody PessoaModel pessoaModel){

        return pessoaService.update(pessoaModel);
    }

    @DeleteMapping("/delete")
    public boolean deleteById(@RequestParam(value = "id", required = false) Long id){

        return pessoaService.delete(id);
    }
}
