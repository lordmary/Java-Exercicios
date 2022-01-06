
package exercicio_poo;


public class Tempo(int hora, int minuto,int segundo) {
    hora = java.lang.Math.abs(hora);
    minuto = java.lang.Math.abs(minuto);
    segundo = java.lang.Math.abs(segundo);
    //tô colocando só numeros positivos, pq o tempo não pode ser negativo

    if (segundo < 60 && minuto < 60 && hora < 24){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }else{
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

}
public String getTempo(){
    return this.hora + ":" + this.minuto + ":" + segundo;
}
public void showTempo(){
     System.out.println(this.getTempo());
}
/*nesse daqui tentei fazer a lógica da hora ser válida, de 59 para 00
        e assim por diante */
public void Tempovalido(){
    segundo++;
    if (segundo > 59){
        segundo = 0;
        minuto++;
    }
    if (minuto > 59){
        minuto = 0;
        hora++;
    }
    if (hora > 23){
        hora = 0;
    }
}
}