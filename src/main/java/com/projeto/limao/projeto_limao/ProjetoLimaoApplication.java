package com.projeto.limao.projeto_limao;

import com.projeto.limao.projeto_limao.resource.Filial;
import com.projeto.limao.projeto_limao.resource.Produtos;
import com.projeto.limao.projeto_limao.resource.Venda;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ProjetoLimaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoLimaoApplication.class, args);
    }

    final Filial filial;
    final Produtos produtos;
    final Venda venda;

}
