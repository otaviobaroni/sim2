/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aq3029298_sim2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author aluno
 */
public class AtendimentoBanco {
    public static void main(String[] args) {
        FilaDeEspera fila = new FilaDeEspera();
        
           List<Integer> buffer = Collections.synchronizedList( new ArrayList<>() ); 
        
            Thread entrada = new Thread( new Runnable() {
                public void run() {
                    try {
                        
                        fila.adicionar(new Pessoa("Joao", "111.111.111-11"));
                        Thread.sleep(500);
                                
                        fila.adicionar(new Pessoa("Maria", "222.222.222-22"));
                        Thread.sleep(500);
                                
                        fila.adicionar(new Pessoa("José", "333.333.333-33"));
                        Thread.sleep(500);
                        
                        fila.adicionar(new Pessoa("Matheus", "444.444.444-44"));
                        Thread.sleep(500);
                        
                        fila.adicionar(new Pessoa("Ana", "555.555.555-55"));
                        Thread.sleep(500);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            
            Thread caixa1 = new Thread( () -> {
                while(true){
                    try{
                        Thread.sleep(1500);
                        fila.remover();
                        System.out.println("CX2: " + fila);
                        
                    }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
                }
               
            });
            Thread caixa2 = new Thread( () -> {
                while(true){
                    try{
                         Thread.sleep(1500);
                        fila.remover();
                        System.out.println("CX2: " + fila);
                       
                    }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
                }
               
            });
            Thread caixa3 = new Thread( () -> {
                while(true){
                    try{
                         Thread.sleep(1500);
                        fila.remover();
                        System.out.println("CX2: " + fila);
                       
                    }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
                }
               
            });
            
            entrada.start();
            caixa1.start();
            // caixa2.start();
            // caixa3.start();
    }
}
