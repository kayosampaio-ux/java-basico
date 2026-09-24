package com.exemplo.crudprodutos.service;

import com.exemplo.crudprodutos.entity.Produto;
import com.exemplo.crudprodutos.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Produto não encontrado"));
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

        public Produto atualizar(Long id, Produto dados) {
            Produto produto = buscarPorId(id);
            produto.setNome(dados.getNome());
            produto.setDescricao(dados.getDescricao());
            produto.setPreco(dados.getPreco());
            return repository.save(produto);
        }

    public void excluir(Long id) {
        Produto produto = buscarPorId(id);
        repository.delete(produto);
    }
}
