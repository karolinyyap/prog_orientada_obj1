package exercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio1 {

    public static void main(String[] args) {
        String s;
        int razao, pTermo, qtdeTermos;
        int calc;
        BufferedReader dado;
        
        try {
            System.out.println("Insira a razão: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            razao = Integer.parseInt(s);
            
            System.out.println("Insira o primeiro termo: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            pTermo = Integer.parseInt(s);
            
            System.out.println("Insira a quantidade de termos: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            qtdeTermos = Integer.parseInt(s);
            
            calc = pTermo + (qtdeTermos - 1) * razao;
            
            System.out.println("O termo é: " + calc);
        } catch (IOException erro){
            System.out.println("Erro ao ler dados.");
        }
    }
    
}
