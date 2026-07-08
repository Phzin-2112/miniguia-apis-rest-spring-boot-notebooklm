package com.projeto.apirest.repository;

import com.projeto.apirest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository 
        extends JpaRepository<Produto, Long> {

}