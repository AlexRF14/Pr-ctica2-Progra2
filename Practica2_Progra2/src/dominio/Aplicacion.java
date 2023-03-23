package dominio;

import java.util.*;
import java.io.*;

public class Aplicacion { 
        
            public void crearMatrizyMostrar() { {
                int[][] matriz = new int[32][32];
        
                try (FileWriter fw = new FileWriter("C:/Users/Usuario/Desktop/Programacion_2/Practica2_Progra2/src/principal/matriz.txt");
                     BufferedWriter bw = new BufferedWriter(fw)) {          
                    Random random = new Random();
                    for (int i = 0; i < matriz.length; i++) {
                        if(i == 0 || i == matriz.length - 1)
                            for (int j = 0; j < matriz[i].length; j++) {
                                matriz[i][j] = 0;
                                bw.write(matriz[i][j] + " ");
                            }
                        else
                            for (int j = 0; j < matriz[i].length; j++) {
                                if(j == 0 || j == matriz[i].length - 1){
                                    matriz[i][j] = 0;
                                    bw.write(matriz[i][j] + " ");
                                }else{
                                    matriz[i][j] = random.nextInt(2);
                                    bw.write(matriz[i][j] + " ");
                                }
                            }
                       /* for (int j = 0; j < matriz[i].length; j++) {
                            matriz[i][j] = random.nextInt(2);
                            bw.write(matriz[i][j] + " ");
                        } */
                        bw.newLine();
                    } 
                    System.out.println("La matriz se ha escrito en el archivo correctamente.");
                } catch (IOException e) {
                    System.err.println("Error al escribir en el archivo: " + e.getMessage());
                }
                try (FileReader fr = new FileReader("C:/Users/Usuario/Desktop/Programacion_2/Practica2_Progra2/src/principal/matriz.txt");
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
                    System.out.println("Matriz leída desde el archivo:");
                    for (int i = 0; i < matrizLeida.length; i++) {
                        for (int j = 0; j < matrizLeida[i].length; j++) {
                            System.out.print(matrizLeida[i][j] + " ");
                        }
                        System.out.println();
                    }
                    
                } catch (IOException e) {
                    System.err.println("Error al leer el archivo: " + e.getMessage());
                }
        }
            }
            
            
        
        /** 
         * @param matrizActual
         */
        public void siguienteFase(int[][] matrizActual) {
                

                try (FileWriter fw2 = new FileWriter("C:/Users/Usuario/Desktop/Programacion_2/Practica2_Progra2/src/principal/siguientefasematriz.txt");
                BufferedWriter bw2 = new BufferedWriter(fw2)){ 
       
                for (int i = 0; i < matrizActual.length; i++) {
                        for (int j = 0; j < matrizActual[0].length; j++) {
                                if(i != 0 && j != 0 && i != matrizActual.length - 1 && j != matrizActual[0].length - 1){
                                        if(matrizActual[i + 1][j + 1] + matrizActual[i + 1][j] + matrizActual[i + 1][j - 1] + matrizActual[i][j + 1] + matrizActual[i][j - 1] + matrizActual[i - 1][j + 1] + matrizActual[i - 1][j] + matrizActual[i - 1][j - 1] == 2){
                                                matrizActual[i][j] = 1;
                                                bw2.write(matrizActual[i][j] + " ");
                                        }else{ 
                                                matrizActual[i][j] = 0;
                                                bw2.write(matrizActual[i][j] + " ");               
                                        }
                                        if(matrizActual[i + 1][j + 1] + matrizActual[i + 1][j] + matrizActual[i + 1][j - 1] + matrizActual[i][j + 1] + matrizActual[i][j - 1] + matrizActual[i - 1][j + 1] + matrizActual[i - 1][j] + matrizActual[i - 1][j - 1] == 3){
                                            matrizActual[i][j] = 1;
                                            bw2.write(matrizActual[i][j] + " ");
                                    }else{ 
                                            matrizActual[i][j] = 0;
                                            bw2.write(matrizActual[i][j] + " ");               
                                    }
                                }else{
                                    bw2.newLine();
                                }
                        }
                        
                }
                for (int i = 0; i < matrizActual.length; i++) {
                    for (int j = 0; j < matrizActual[i].length; j++) {
                        System.out.print(matrizActual[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("Matriz leída desde el archivo:");
       

                }catch (Exception e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
                }
                
     
                }
        }

      
    

        
        
 

 