package exercicio3;
/*
Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas
vendas oferecendo desconto. Faça um programa em Java que possa entrar com o valor de
um produto e imprima o novo valor tendo em vista que o desconto foi de 9%. Além disso,
imprima o valor do desconto.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio3 {

    public static void main(String[] args) throws IOException {
        String s;
        double valor, calc, valor_desc;
        BufferedReader dado;
        
        System.out.println("Insira o valor da compra: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        valor = Double.parseDouble(s);
        
        valor_desc = (valor * 0.09);
        calc = valor - valor_desc;
        
        System.out.println("O valor final é: " + calc);
        System.out.println("O valor do desconto é: " + valor_desc);
    }
    
}
