package principal;
import dominio.*;
import java.io.*;
import java.util.*;

public class Principal {
    
        
        /** 
         * @param args
         */
        public static void main(String[] args) {
            // Leemos la matriz desde el archivo
            int[][] matriz = leerMatrizDesdeArchivo("C:/Users/Usuario/Desktop/Programacion_2/Practica2_Progra2/src/principal/matriz.txt");
            
            // Creamos la aplicación y mostramos la matriz
            Aplicacion app = new Aplicacion();
            app.crearMatrizyMostrar();
            
            // Pasamos la matriz a la siguiente fase
            for(int i = 1; i < 15; i++){
                System.out.println("Fase " + i);
                app.siguienteFase(matriz);
        }
        }
        
        
        /** 
         * @param nombreArchivo
         * @return int[][]
         */
        public static int[][] leerMatrizDesdeArchivo(String nombreArchivo){
            try (FileReader fr = new FileReader(nombreArchivo);
                         BufferedReader br = new BufferedReader(fr)) {    
                        ArrayList<String> lineas = new ArrayList<>();
                        String lineaActual;
                        while ((lineaActual = br.readLine()) != null) {
                            lineas.add(lineaActual);
                        }    
                        int[][] matrizLeida = new int[lineas.size()][lineas.get(0).split(" ").length];
                        for (int i = 0; i < lineas.size(); i++) {
                            String[] elementos = lineas.get(i).split(" ");
                            for (int j = 0; j < elementos.length; j++) {
                                matrizLeida[i][j] = Integer.parseInt(elementos[j]);
                            }
                        }    
                        return matrizLeida; // Agrega esta línea
                    } catch (IOException e){ 
                        System.err.println("Error al leer el archivo: " + e.getMessage());
                    }
            return null; // Agrega esta línea
        }
    }
            
            
        
    
