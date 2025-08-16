package exercicio4;
/*
Refaça a questão anterior agora com o desconto sendo informado como entrada para o
algoritmo.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio4 {

    public static void main(String[] args) throws IOException {
        String s;
        double valor, calc, valor_desc, desc;
        BufferedReader dado;
        
        //Lendo valor da compa
        System.out.println("Insira o valor da compra: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        valor = Double.parseDouble(s);
        
        //Lendo valor do desconto
        System.out.println("Insira o valor do desconto: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        desc = Double.parseDouble(s);
        
        //Calculando
        valor_desc = (valor * (desc / 100));
        calc = valor - valor_desc;
       
        //Saída
        System.out.println("O valor do desconto é: " + valor_desc);
        System.out.println("A porcentagem do desconto é: " + desc);
        System.out.println("O valor final é: " + calc);
        
    }
    
}
