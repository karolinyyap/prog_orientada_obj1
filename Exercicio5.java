package exercicio5;
/*
Desenvolva um programa em Java que leia uma temperatura em graus centígrados e
apresente a temperatura convertida em graus Fahrenheit. A fórmula de conversão é:
F = (9 x C + 160) / 5
Onde F é a temperatura em Fahrenheit e C é a temperatura em centígrados
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio5 {
   
    public static void main(String[] args) throws IOException {
        int temp_C, temp_F;
        String s;
        BufferedReader dado;
        
        //Lendo os dados
        System.out.println("Insira a temperatura em °C: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        temp_C = Integer.parseInt(s);
       
        //Cálculo
        temp_F = (9 * temp_C + 160) / 5;
        
        //Saída
        System.out.println("A temperatura em °F é: " + temp_F);
    }
    
}
