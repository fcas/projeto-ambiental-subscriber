/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

import br.ufrn.subscriber.Subscriber;
 
public class AtualizaSubscriber extends Subscriber{

    public static final String POLLUTION = "pollutionMonitor";
    public static final String WILL_RAIN = "willRainMonitor";
    public static final String ACID_RAIN = "acidRainMonitor";
    public static final String NOISE = "noiseMonitor";
    public static final String TEMPERATURE = "temperatureMonitor";
    public static final String BEATIFUL_WEATHER = "beautifulWeatherMonitor";
    public static final String IS_FIRE = "isFireMonitor";
    public static final String HOT_DRY = "hotDryMonitor";
    public static final String TRASH = "trashMonitor";
    public static final String GATHERING = "trashGathering";
    
    
    SecretariaMeioAmbiente subscriber;
   
    
    public AtualizaSubscriber(String topic, SecretariaMeioAmbiente secretariaMeioAmbiente) {
        super(topic);
        this.subscriber = secretariaMeioAmbiente;
    }
    
    
    @Override
    public void tratarMensagem(String mensagem) {
        subscriber.exibirInformacao(mensagem);
    }
    
}
