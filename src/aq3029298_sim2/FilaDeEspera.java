/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aq3029298_sim2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author aluno
 */
public class FilaDeEspera {
    
     Queue<Pessoa> fila;
     
     public FilaDeEspera(){
         fila = new LinkedList<>();
     }
     
     
     @Override
     public String toString(){
         return fila.toString();
     }
     
     public boolean adicionar(Pessoa pessoa) {
         if(fila.contains(pessoa) ){
             return false;
         } else {
             fila.offer(pessoa);
             return true;
         }
     }
     public synchronized boolean remover(){
         if(fila.isEmpty() == false){
             Pessoa aux = fila.poll();
             System.out.println(aux);
             return true;
             
         } else{
             return false;
         }
     }
     
    
}
