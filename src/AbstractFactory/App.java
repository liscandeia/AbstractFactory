package AbstractFactory;

import AbstractFactory.carro.Carro;
import AbstractFactory.fabrica.ContratosFabrica;
import AbstractFactory.fabrica.Fabrica;
import AbstractFactory.fabrica.SemContratosFabrica;
import com.sun.jdi.connect.Connector;

/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project padroes_de_projeto
 * @since 18/01/2024 - 11:21
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("A",true);
        Fabrica fabrica = isFabrica(cliente);
        Carro carro = fabrica.criarCarro(cliente.getOpcao());
        carro.entregarCarro();
        }

    private static Fabrica isFabrica(Cliente cliente) {
        if (cliente.isTemContrato()){
            return new ContratosFabrica();
        }else {
            return new SemContratosFabrica();
        }
    }
}
