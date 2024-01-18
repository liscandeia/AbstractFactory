package AbstractFactory;

/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project padroes_de_projeto
 * @since 18/01/2024 - 10:32
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
public class Cliente {
    private String opcao;
    private boolean temContrato;

    public Cliente(String opcao, boolean temContrato) {
        this.opcao = opcao;
        this.temContrato = temContrato;
    }

    public String getOpcao() {
        return opcao;
    }

    public boolean isTemContrato() {
        return temContrato;
    }
}
