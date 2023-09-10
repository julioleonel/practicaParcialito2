# practicaParcialito2
    ejercicios de practica para el parcialito

# Enunciado

    2. Calcular Promedio:
    Crea un programa que tome una serie de números enteros como argumentos de línea de comandos y calcule su promedio. 
    Luego, muestra el promedio en la consola. 
    Asegúrate de manejar adecuadamente el caso en el que no se proporcionen números.

# Codigo

    int cantidad = 0;
            int suma = 0;
            
            for (String argumento : args){
                int numero = Integer.parseInt(argumento);
                    cantidad++;
                    suma += numero;
            }
    
            float promedio = (float) suma / cantidad;
    
            System.out.println("El promedio de los numeros ingresados fue de: " + promedio);

# Teoria

    float promedio = (float) suma / cantidad;
    Si utilizo tipo float con una variable declarada como int colocar el resultado entre '(float)'

# Consola
    prueba 1
    Ingreso los siguientes argumentos: 
    4 
    10 
    4 
    El promedio de los numeros ingresados fue de: 6.0

    prueba 2
    Ingreso los siguientes argumentos: 
    4 
    10 
    4 
    3 
    El promedio de los numeros ingresados fue de: 5.25

