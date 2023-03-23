# Pr-ctica2-Progra2
Este proyecto trata sobre el llamado juego de la vida, una matriz/tablero compuesto por células vivas y células muertas.Este juego tiene ciertas reglas: 
a) Si una célula está viva y dos o tres de sus vecinas también lo están, entonces continúa viva en el estado siguiente.
b) Si una célula está muerta y tres de sus vecinas están vivas, entonces pasa a estar viva en el estado siguiente.
c) El resto de células pasan a estar muertas en el estado siguiente.
El programa cuenta con dos métodos que se encuentran en el paquete dominio en la clase Aplicación: 
El método crearMatrizyMostra crear una matriz compuesta de 1s y 0s de forma aleatoria en un fichero llamado matriz.txt y después la lee y la muetra por la terminal.
El método siguienteFase comienza leyendo la matriz.txt y escribiendo con las reglas del Juego, esto es posible mediante bucles for y Ifs que escriben una nueva matriz basandose en su estado anterior que se escribe en el fichero siguientefasematriz.txt.
El programa cuenta también con un metodo leerMatrizDesdeArchivo que se encuentra en la clase Principal y que tiene como función leer la matriz que ha pasado al estado siguiente y pasarsela al método siguienteFase.
En la clase Principal también podemos encontrar un bucle for que hace que el método siguienteFase se aplique 15 veces e imprima la matriz siguientefasematriz.txt.
