/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aq3029298_sim2;

/**
 *
 * @author aluno
 */
public enum Genero {
    
    ENTRETENIMENTO ("ENTRETENIMENTO"), 
    EDUCACAO ("EDUCACAO"),
    NOTICIAS ("NOTICIAS");
    
    private Genero (String genero){
        setGenero(genero);
    }
    
    private String genero;
    
    public void setGenero(String genero) {
        if(genero.matches("[A-Z]+")){
            this.genero = genero;
        } 
    }
    
    public String getGenero(){
        return genero;
    }
    
    @Override
    public String toString() {
        return getGenero();
    }
    
}
