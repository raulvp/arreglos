
package edd72021;

import java.util.Scanner;


public class EDD72021 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresando Valores...");
        
        int arreglo[]=new int[5];
        //ingresar lo valores
        for(int i=0;i<arreglo.length;i++){
            System.out.print((i+1)+" Digite el valor: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //ordenamiento por insercion
        int pos,aux;
        for(int i=0;i<arreglo.length;i++){
            pos=i;
            aux=arreglo[i];
            while((pos>0)&&(arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        
        //mostremos por pantalla
        System.out.println("");
        System.out.println("Arreglo ordenado metodo por insercion");
        for(int in:arreglo){
            System.out.print(in+"-"); 
        }
        
    }
    
}
