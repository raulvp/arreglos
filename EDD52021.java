
package edd52021;

public class EDD52021 {

    public static void main(String[] args) {
       String [] meses = new String[12];
       
       String [] meses2 = {"enero","febrero","marzo","abril","mayo"};
       //asigancion de valores por posicion
       //insertar
       meses[0]="enero";
       meses[1]="febrero";
       meses[2]="marzo";
       meses[3]="abril";
       meses[4]="mayo";
       meses[5]="junio";
       meses[6]="julio";
       meses[7]="agosto";
       meses[8]="septiembre";
       meses[9]="octubre";
       meses[10]="noviembre";
       meses[11]="diciembre";
       
       System.out.println("Este mes es el mes de mama: " +meses2[4]);
       
       //actualizar
       
       meses2[4] = "mayos";
       System.out.println("Este mes es el mes de mama: " +meses2[4]);
       
       //Eliminar
       meses2[4] = "";
       System.out.println("Este mes es el mes de mama: " +meses2[4]);
       
       //Tamaño del arreglo
       int tamanio = meses2.length;
        System.out.println("El tamanio del arreglo meses2 es: "
                +tamanio);
        
        //busqueda
        String buscar = "febrero";
        /*for(int i=0;i<meses.length;i++){
            if(meses[i]==buscar){
                System.out.println("El elemento fue encontrado en la posicion "
                        +i);
            }
            else{
                System.out.println("El elemento no fue encontrado");
            }
        }*/
        
        //Insertar objetos
        
        Estudiante est1 = new Estudiante("SIS-001", "Alicia Rojas", 21);
        
        Estudiante [] estudiantes = new Estudiante[10];
        estudiantes[0] = est1;
        estudiantes[1] = new Estudiante("SIS-002", "Pedro Peredo", 20);
        estudiantes[2] = new Estudiante("SIS-003", "Olga Rudes", 22);
        
        System.out.println("El estudiante de la posicion 1 tiene los datos siguientes "
                +"\nCodigo Est.: "+estudiantes[1].getCodEst()
                +"\nNombre: "+estudiantes[1].getNombreEst()
                +"\nEdad: "+estudiantes[1].getEdad());
        
        
    }
    
}
