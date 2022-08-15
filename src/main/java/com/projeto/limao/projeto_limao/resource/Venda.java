package com.projeto.limao.projeto_limao.resource;

import lombok.Data;

import java.util.Date;

@Data
public class Venda {

    private int codigovenda;
    private Filial filialVenda;
    private Date dataVenda;
    private Produtos produtoVenda;
    private int qtdVenda;
    private float valorVenda;
}
