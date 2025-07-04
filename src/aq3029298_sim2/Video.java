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
public class Video implements Comparable<Video>{
    private String titulo;
    private int classificacao;
    private Genero genero;

    public Video(String titulo, int classificacao, Genero genero) {
         setTitulo(titulo);
         setClassificacao(classificacao);
         setGenero(genero);
    }

    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null){
    
              this.titulo = titulo;
        }else{
            throw new ErroPassivo("Não pode ser nulo!");
        
        }
      
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
         if(classificacao >= 0){
    
              this.classificacao = classificacao;
        }else{
            throw new ErroPassivo("Não pode ser negativo!");
        
        }
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return getTitulo() + " (" + getClassificacao() + ", " + getGenero() + ")";
    }

    @Override
    public int compareTo(Video t) {
        if (getClassificacao() == t.getClassificacao()){
            return 0;
        } else {
                if (getClassificacao() == t.getClassificacao()){
                    return 0;
                } else {
                    return -1;
                }
        
        }
    }
    
    
    
    
    
}
