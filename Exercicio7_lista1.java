package exercicio7;
/*
Criar um programa em Linguagem Java que leia dois valores para as variáveis A e B, que
efetue a troca dos valores de forma que a variável A passe a ter o valor da variável B e que
a variável B passe a ter o valor da variável A. Apresente os valores trocados.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio7 {

    public static void main(String[] args) throws IOException {
        int var_a, var_b, var_aux;
        String s;
        BufferedReader dado;
        
        //Lendo variável A
        System.out.println("Digite o valor de A: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        var_a = Integer.parseInt(s);
        
        //Lendo variável B
        System.out.println("Digite o valor de B: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        var_b = Integer.parseInt(s);
        
        //Troca de variáveis
        var_aux = var_a;
        var_a = var_b;
        var_b = var_aux;
        
        //Saída
        System.out.println("Novos valores de A: " + var_a + "; B: " + var_b + ".");
    }

    
    
}
