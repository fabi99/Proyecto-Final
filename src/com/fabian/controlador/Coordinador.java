/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabian.controlador;

import com.fabian.modelo.Book;
import com.fabian.vista.Magazine;
import com.fabian.vista.Movie;
import com.fabian.vista.Serie;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Coordinador {
    public static void showMenu(){
        int exit=0;
        do { 
            System.out.println("Bienvenidos a Netflix viewer");
            System.out.println("Selecciona una opción:  \n"
                    + "1.- Books\n"
                    + "2.- Magasin \n"
                    + "3.- Movie \n"
                    + "4.- Series \n"
                    + "\n-------------------\n"
                    + "5.- Report\n"
                    + "6.- Report today"
                    + "7.- salir");
            //leer la respuesta del usuario
            Scanner input= new Scanner(System.in);
            int response= input.nextInt();
                    switch(response){
                        case 0:
                            //salir
                            break;
                            case 1:
                            showBook();
                            break;
                            case 2:
                            showMagazine();
                            break;
                            case 3:
                            showMovies();
                            break;
                            case 4:
                            showSeries();
                            break;
                            case 5:
                            makeReport();
                            break;
                            case 6:
                                makeReport(new Date());
                            break;
                            default:
                                System.out.println("");
                                System.out.println("....¡Selecciona una opcion");
                                System.out.println("");
                    }
    //Deber subir al git como ployecto final 
            
        } while (exit !=0);
    }
    private static void showMovies(){
        int exit =0;
        do {   
            new Movie().setVisible(true);
            System.err.println("");
            System.err.println(":: Movies ::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void showSeries(){
        int exit =0;
        do {     
            new Serie().setVisible(true);
            System.err.println("");
            System.err.println(":: Series ::");
            System.out.println("");
        } while (exit !=0);
    }
    private  static void showMagazine(){
        int exit =0;
        do { 
           new Magazine().setVisible(true);
            System.err.println("");
            System.err.println(":: Magazine::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void showChapter(){
        int exit =0;
        do {            
            System.err.println("");
            System.err.println(":: Chapters ::");
            System.out.println("");
        } while (exit !=0);
    }
    private  static void showBook(){
        int exit =0;
        do {   
            new Book().setVisible(true);
            System.err.println("");
            System.err.println(":: Book ::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void makeReport(){
        
    }
     private static void makeReport(Date date){
        
    }
     
}
