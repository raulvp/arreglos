
package edd62021;

import java.util.Scanner;

public class EDD62021 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresando Valores...");
        int [] numeros = new int[5];
        //ingresar lo valores
        for(int i=0;i<numeros.length;i++){
            System.out.print((i+1)+" Digite el valor: ");
            numeros[i] = entrada.nextInt();
        }
        int aux;
        //metodo ordenacion burbuja
        for(int i=0;i<(numeros.length-1);i++){
            for(int j=0;j<(numeros.length-1);j++){
                if(numeros[j]>numeros[j+1]){
                    aux = numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        
        //mostremos por pantalla
        System.out.println("");
        System.out.println("Arreglo ordenado metodo burbuja");
        for(int in:numeros){
            System.out.print(in+"-"); 
        }
    }
    
}
