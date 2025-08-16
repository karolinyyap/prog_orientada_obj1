package exercicio10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte
a quantidade de cigarros fumados por dia e quantos anos ele já fumou. Considere que um
fumante perde 10 minutos de vida a cada cigarro, calcule quantos dias de vida um fumante
perderá. Exiba o total de dias. 
*/
public class Exercicio10 {

    public static void main(String[] args) throws IOException {
        int cigarros_dia, anos_fumando, res_final, ano;
        BufferedReader dado;
        String s;
        
        //Entrada de dados
        System.out.println("Insira a quantidade de cigarros você fuma por dia: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        cigarros_dia = Integer.parseInt(s);
        
        System.out.println("Insira a quantidade de anos que você fuma: ");
        dado = new BufferedReader(new InputStreamReader(System.in));
        s = dado.readLine();
        anos_fumando = Integer.parseInt(s);
        
        //Cáluculo
        //Quantidade de cigarros fumados ao passar dos anos
        ano = anos_fumando * (cigarros_dia * 365);
        //Dias perdidos
        res_final = (ano * 10) / 1440;
        
        //Saída
        System.out.println("Você perdeu " + res_final + " dias de vida por causa do cigarro");
    }
    
}
