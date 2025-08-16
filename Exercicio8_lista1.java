package exercicio8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Para vários tributos, a base de cálculo é o salário mínimo. Fazer um programa em
Linguagem Java que leia o valor do salário mínimo e o valor do salário de uma pessoa.
Calcular e imprimir quantos salários mínimos essa pessoa ganha.
*/
public class Exercicio8 {

    public static void main(String[] args) throws IOException {
        double salario_min = 1518.00, salario_pessoa, quant_salarios_res;
        BufferedReader dado;
        String s;
        
        //Entrada de dados
        System.out.println("Insira o valor do seu salário: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        salario_pessoa = Double.parseDouble(s);
        
        //Cálculo
        quant_salarios_res = salario_pessoa / salario_min;
        
        //Saída
        System.out.println("Você recebe: " + quant_salarios_res + " salários mínimos!");
    }
    
}
