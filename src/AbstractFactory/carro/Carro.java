package AbstractFactory.carro;

/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis de Lima
 * @version 1.0
 * @project padroes_de_projeto
 * @since 18/01/2024 - 10:39
 * <p>
 * Copyright (c) 2023 Lis de Lima. All rights reserved.
 */
public abstract class Carro {
    private String tanqueCombustivel;
    private  String cor;
    private int ano;

    public Carro(String tanqueCombustivel, String cor, int ano) {
        this.tanqueCombustivel = tanqueCombustivel;
        this.cor = cor;
        this.ano = ano;
    }


    public void limpar() {
        System.out.println("Carro limpo e o " + cor + " está brilhando" );
    }

    public void checarMecanica() {
        System.out.println("Carro com mecânica checada o ano dele é " + ano);
    }

    public void combustivel() {
        System.out.println("O carro está com o combustivel " + tanqueCombustivel);
    }

    public void entregarCarro() {
        System.out.println("Seu carro " + getClass().getSimpleName() + " do ano " + ano  + " está pronto!");
    }
}
