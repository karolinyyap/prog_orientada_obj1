package exercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado
pelo usuário, assim como a quantidade de dias pelos quais o carro foi alugado. Calcule o
preço a pagar, sabendo que o carro custa R$ 60,00 por dia e R$ 0,15 por km rodado. 
*/
public class Exercicio9 {

    public static void main(String[] args) throws IOException {
        double km_perc, valor_pagar, calc_km;
        int dias, calc_dias;
        BufferedReader dado;
        String s;
        
        //Entrada de dados
        System.out.println("Insira a quantidade de kms percorridos: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        km_perc = Double.parseDouble(s);
        
        System.out.println("Insira a quantidade de dias: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        dias = Integer.parseInt(s);
        
        //Cálculo
        calc_dias = 60 * dias;
        calc_km = 0.15 * km_perc;
        valor_pagar = calc_dias + calc_km;
        
        //Saída
        System.out.println("O valor a pagar é de: R$" + valor_pagar);
        
    }
    
}
