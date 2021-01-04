
package exerciciogft;

import java.io.PrintStream;
import java.util.Scanner;

public class ExercicioGft {

    public static void main(String[] args) {
        
        Carro gol = new Carro();
        Scanner ler = new Scanner(System.in);
        int quantidade;
        int resp, resp1;
        
        System.out.println("Quantas pessoas tem no carro?");
        
        quantidade = ler.nextInt();       
        
        if(quantidade <= 5){
            gol.quantidadeDePessoas(quantidade);
        }else {
            System.out.println("Apenas menos de 5 pessoas.");
            System.exit(0);
        }
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Deseja Tirar ou Remover uma pessoa? \n 1- Adicionar \n 2- Remover \n 3- Não");
        resp = ler.nextInt();
        
        System.out.println("#############################");
        
        switch(resp){
            case 1:
                if(quantidade <= 4){
                    gol.adicionarAlguem(quantidade);
                    quantidade =quantidade +1;
            }else{
                    System.out.println("Máximo 5 pessoas!");
                }
                System.out.println("Deseja continuar? \n 1- Sim \n 2- Não");
             resp1 = ler.nextInt();
             
            switch(resp1){
                case 1:
                    i=1;
                break;
                        
                case 2:
                    System.out.println("Obrigado por usar meu ódigo!");
                    i=5;
                break;
            }
                break;
                
            case 2:
                if(quantidade >=1){
                    gol.removerAlguem(quantidade);
                    quantidade =quantidade -1;
                }else{
                    System.out.println("O carro está vázio!");
                }
                
                System.out.println("Deseja continuar? \n 1- Sim \n 2- Não");
             resp1 = ler.nextInt();
             
            switch(resp1){
                case 1:
                    i=1;
                break;
                        
                case 2:
                    System.out.println("Obrigado por usar meu ódigo!");
                    i=5;
                break;
            }
            break;
            
            case 3:
                System.out.println("Ok! Continua com "+ quantidade+ " no carro!");
                
                System.out.println("Deseja continuar? \n 1- Sim \n 2- Não");
             resp1 = ler.nextInt();
             
            switch(resp1){
                case 1:
                    i=1;
                break;
                        
                case 2:
                    System.out.println("Obrigado por usar meu ódigo!");
                    i=5;
                break;
            }
                break;
        }
            
        }

        

    }   
}
