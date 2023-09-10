package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No se proporcionaron argumentos");
            return;
        }

        System.out.println("Ingreso los siguientes argumentos: ");
        for (String argumento : args){
            System.out.println(argumento + " ");
        }

        int cantidad = 0;
        int suma = 0;

        for (String argumento : args){
            int numero = Integer.parseInt(argumento);
                cantidad++;
                suma += numero;
        }

        float promedio = (float) suma / cantidad;

        System.out.println("El promedio de los numeros ingresados fue de: " + promedio);



    }
}







