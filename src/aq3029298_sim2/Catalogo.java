/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aq3029298_sim2;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author aluno
 */
public class Catalogo {
    private ArrayList<Video> catalogo;
    
    public Catalogo(){
        catalogo = new ArrayList<>();
    }

    public boolean adicionar (Video video) throws ErroCritico {
        if(catalogo.contains((video))){
            throw new ErroCritico("video existente");
        }
        else {
            catalogo.add(video);
            return true;
        }
    }
    
    public boolean remover (Video video){
        if(catalogo.contains((video))){
            catalogo.remove(video);
            return true;
        }
        else {
            return false;
        }
    }
    
    
    @Override
    public String toString() {
        return catalogo.toString();
    }
    
    public Stream<Video> getStream(){
        return catalogo.stream();
    }
    
    
    
}
