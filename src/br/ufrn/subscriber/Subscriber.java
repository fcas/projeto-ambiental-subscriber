/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.subscriber;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Subscriber extends TratarMensagem {

    protected SubscribeBean subscribe = new SubscribeBean();
    private Client client = Client.create();
    private EsperarAtualizacao esperarAtualizacao;
    private static String URL_BASE_HUB = "http://localhost:8080/hub/";

    public Subscriber(String topic) {
        subscribe.setTopic(topic);
        subscribe.setPort(new Random().nextInt(60000) + 1024);
        try {
            subscribe.setAndress(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Subscriber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void subscribe() {
        WebResource resource = client.resource(URL_BASE_HUB + "subscribe");
        resource.put(subscribe);
        esperarAtualizacoes();
    }

    public void unsubscribe() {
        WebResource resource = client.resource(URL_BASE_HUB + "unsubscribe");
        resource.post(subscribe);
        //destroi a thread que aguarda as atualizações
        esperarAtualizacao.destroy();
    }

    private void esperarAtualizacoes() {
        esperarAtualizacao = new EsperarAtualizacao(subscribe.getPort(), this);

        esperarAtualizacao.start();
    }
}