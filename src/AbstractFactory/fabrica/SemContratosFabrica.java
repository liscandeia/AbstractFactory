package AbstractFactory.fabrica;

import AbstractFactory.carro.Carro;
import AbstractFactory.carro.CarroCelta;
import AbstractFactory.carro.CarroUno;

/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project padroes_de_projeto
 * @since 18/01/2024 - 10:54
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
public class SemContratosFabrica extends Fabrica{
    @Override
    Carro buscarCarro(String opcao) {
        if("A".equals(opcao)){
            return new CarroUno("meio cheio", "Cinza", 2019);
        }else if("B".equals(opcao)){
            return new CarroCelta("meio cheio", "branco", 2015);
        }else{
            return null;
        }
    }
}
