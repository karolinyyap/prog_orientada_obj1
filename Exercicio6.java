package exercicio6;
/*
Faça agora o contrário, de Fahrenheit para Celsius.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio6 {

    
    public static void main(String[] args) throws IOException {
       int temp_C, temp_F;
        String s;
        BufferedReader dado;
        
        //Lendo os dados
        System.out.println("Insira a temperatura em °F: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        temp_F = Integer.parseInt(s);
       
        //Cálculo
        temp_C = (temp_F - 32) * 5/9;
        
        //Saída
        System.out.println("A temperatura em °C é: " + temp_C);
    }
    
}
