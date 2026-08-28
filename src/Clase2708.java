import java.util.Scanner;

public class Clase2708 { public static void main(String[] args)  {
     Scanner sc = new Scanner(System.in);
    /*  int[] notas = new int[5];
    notas[0] = 85;
    notas[1] = 90;
    notas[2] = 78;
    notas[3] = 92;
    notas[4] = 88;

    int[] edades = { 18,20,22,19,21};

    System.out.println(notas[0]);

    for (int i = 0; i < notas.length; i++){
        System.out.println("nota"+ (i+1) + ": "+ notas [i]);
        sc.close();
    }

    for (int nota : notas){
        System.out.println(nota);
    }*/
System.out.print("¿Cuantos estudiantes hay?");
int n = sc.nextInt();

double suma = 0;

for ( int i = 0; i < n; i++){
    System.out.print("nota del estudiante" + (i+1) + ":");
    notas[i]= sc.nextDouble();
    suma += notas[i];
}
double promedio = suma / n;
System.out.println("promedio del grupo:"+ promedio);

  }
}
    /* for (int i = 1; i <= 10; i++){
        if (i == 5) break;
        System.out.println(i);
    }


     

     for (int i = 1; <= 10; i++){
        if ( i % 2 == 0) continue;
        System.out.printl(i);
     }*/
       /*  int opcion;

        switch (opcion){

            case 1:
                System.out.println("hola");
        }*/
        
            
            
            
    

        // el while es un ciclo condicionada al inicio, el do while es un ciclo condicionada al final, por lo que se ejecuta al menos una vez//
    
       /* int edad =-1;

        while (edad < 0 || edad > 120){
            System.out.print("ingresa tu edad(0-120):");
            edad = sc.nextInt();
            if (edad < 0 || edad > 120) {
                System.out.println("edad no valida, vuelve a intentarlo");
            }
        }

        System.out.println("edad registrada    "+ edad);
        sc.close();*/
    
    

        //while-mientras//
    /*  int contador = 1;

     while (contador <= 5){
        System.out.println("vuelta numero"+ contador);
        contador++;                      //sin esto el bucle se vuelve infinito//
         } */

    

    


    
    

