package AbstractFactory.fabrica;

import AbstractFactory.carro.Carro;

/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project padroes_de_projeto
 * @since 18/01/2024 - 10:35
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
public abstract class Fabrica {
    public Carro criarCarro(String opcao){
        Carro carro = buscarCarro(opcao);
        carro = prepararCarro(carro);
        return carro;
    }
    private Carro prepararCarro(Carro carro){
        carro.limpar();
        carro.checarMecanica();
        carro.combustivel();
        return carro;
    }
    abstract Carro buscarCarro(String opcao);
}
