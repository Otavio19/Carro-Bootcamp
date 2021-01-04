
package exerciciogft;

import java.util.Scanner;

public class Carro {    
        
    public void quantidadeDePessoas(int quantidadeDePessoas){
            System.out.println("Tem: " + quantidadeDePessoas + " pessoa(s) no carro");
            System.out.println("#############################");
    }
    public void removerAlguem(int a){
           System.out.println("Agora tem " +(a-1)+" no carro");
    }
    public void adicionarAlguem(int a){
           System.out.println("Agora tem " +(a+1)+" no carro");
    }
    
}
