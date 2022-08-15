package com.projeto.limao.projeto_limao.resource;


import lombok.Data;

@Data
public class Produtos {


    private int codigoProduto;
    private String nomeProduto;
    private int qtdEstoque;
    private int qtdMinima;

}
