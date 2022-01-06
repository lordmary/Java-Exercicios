
package exercicio_poo2;

import java.util.Random; //implementar valores aleatórios

public class NaveEspacial {
    String nome;
    int velocidade;
    
    public NaveEspacial(String s){
        nome = s;
        Random random = new Random();
        velocidade = random.nextInt(5)+5;
}

public void mostrarNave(){
        System.out.println(nome);
        System.out.println(velocidade);
    }
    
}