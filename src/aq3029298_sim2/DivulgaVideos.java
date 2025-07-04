/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aq3029298_sim2;

import java.util.Comparator;

/**
 *
 * @author aluno
 */
public class DivulgaVideos {
    public static void main(String[] args) {
        Catalogo youtube = new Catalogo();
        
        Video v1 = new Video ("Java Parte 1", 15, Genero.EDUCACAO);
        Video v2 = new Video ("Meu verao parte 1", 18, Genero.ENTRETENIMENTO);
        Video v3 = new Video ("Java Parte 2", 0, Genero.EDUCACAO);
        Video v4 = new Video ("Meu verao Parte 2", 18, Genero.EDUCACAO);
        
        try{ 
                 youtube.adicionar(v1);
                 youtube.adicionar(v2);
                 youtube.adicionar(v3);
                 youtube.adicionar(v4);
                 // youtube.adicionar(v4);
                 
            } catch (ErroCritico ex){
                ex.printStackTrace();
            }
        
       
        
         System.out.println("#1");
        
        youtube.getStream()
                .sorted( )
                .forEach((v) -> System.out.println(v));
        
        
        System.out.println("\n###\n");
       
           System.out.println("#2");
        
        youtube.getStream()
                .filter((v) -> v.getClassificacao() < 18)
                .forEach((v) -> System.out.println(v));
                
        System.out.println("\n###\n");
        
               System.out.println("#3");
        
        youtube.getStream()
                .filter((v) -> v.getTitulo().contains("Parte 1"))
                .forEach((v) -> System.out.println(v));
                
        System.out.println("\n###\n");
        
        
        
        
        
        
         System.out.println("#4");
        
        youtube.getStream()
                .sorted(Comparator.comparing ((v) -> v.getTitulo() ) )
                .forEach((v) -> System.out.println(v));
        
        
        System.out.println("\n###\n");
    }
    
}
