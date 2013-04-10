/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.subscriber;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class EsperarAtualizacao extends Thread{
    
    private ServerSocket ServerSocket; 
    private TratarMensagem tratarMensagem;

    public EsperarAtualizacao(int porta, TratarMensagem tratarMensagem) {
        try {
            ServerSocket = new ServerSocket(porta);
        } catch (IOException ex) {
            Logger.getLogger(EsperarAtualizacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.tratarMensagem = tratarMensagem;
    }
    
    public void extrairMensagem(Socket socket){
        ObjectInputStream input = null;
        try {
            
            input = new ObjectInputStream(socket.getInputStream());
            String mensagem = (String) input.readObject();
            tratarMensagem.tratarMensagem(mensagem);
 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EsperarAtualizacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EsperarAtualizacao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                input.close();
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(EsperarAtualizacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           
       
    }
    
    @Override
    public void run(){
        
        for(;;){
            try { 
                //fica bloqueado até receber um pacote, ao receber invoca o metodo extrairMensagem
                extrairMensagem(ServerSocket.accept());
            } catch (IOException ex) {
                Logger.getLogger(EsperarAtualizacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
      
    
    
    
    
}
