package AbstractFactory.fabrica;

import AbstractFactory.carro.Carro;
import AbstractFactory.carro.CarroHB20;
import AbstractFactory.carro.CarroMercedes;

/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project padroes_de_projeto
 * @since 18/01/2024 - 10:53
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
public class ContratosFabrica extends Fabrica{
    @Override
    Carro buscarCarro(String opcao) {
        if ("A".equals(opcao)){
            return new CarroMercedes("cheio", "preto",2023);
        }else if("B".equals(opcao)){
            return new CarroHB20("cheio", "marrom", 2022);
        }else {
            return null;
        }
    }
}
