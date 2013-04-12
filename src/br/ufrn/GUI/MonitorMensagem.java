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
public class MonitorMensagem extends Subscriber{

    
    SecretariaMeioAmbiente secretaria = new SecretariaMeioAmbiente();
    
    public MonitorMensagem(String topic) {
        super(topic);
    }

    @Override
    public void tratarMensagem(String mensagem) {
        secretaria.exibirInformacao(mensagem);
    }
    

    
    
}
