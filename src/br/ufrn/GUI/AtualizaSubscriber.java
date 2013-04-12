/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

import br.ufrn.GUI.SecretariaMeioAmbiente;
import br.ufrn.subscriber.Subscriber;

/**
 *
 * @author Jorge
 */
public class AtualizaSubscriber extends Subscriber{

    
    SecretariaMeioAmbiente subscriber = new SecretariaMeioAmbiente();
    
    public AtualizaSubscriber(String topic) {
        super(topic);
    }

    @Override
    public void tratarMensagem(String mensagem) {
        subscriber.exibirInformacao(mensagem);
    }
    

    
    
}
