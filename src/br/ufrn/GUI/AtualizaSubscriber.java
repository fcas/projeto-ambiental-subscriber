/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

import br.ufrn.GUI.SecretariaMeioAmbiente;
import br.ufrn.subscriber.Subscriber;
 
public class AtualizaSubscriber extends Subscriber{

    
    SecretariaMeioAmbiente secretariaMeioAmbiente;
   
    
    public AtualizaSubscriber(String topic, SecretariaMeioAmbiente secretariaMeioAmbiente) {
        super(topic);
        this.secretariaMeioAmbiente = secretariaMeioAmbiente;
    }
    
    
    @Override
    public void tratarMensagem(String mensagem) {
        secretariaMeioAmbiente.exibirInformacao(mensagem);
    }
    
}
