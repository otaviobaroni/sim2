/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aq3029298_sim2;

/**
 *
 * @author aluno
 */
public class ErroCritico extends  Exception{
    private final String mensagem;
    
    public ErroCritico (String mensagem){
        super(mensagem);
        this.mensagem = mensagem;
    
    }
    
    public String getMensagem(){
        return mensagem;
    }
    
    @Override
    public String toString(){
        return getMensagem();
    }
}
