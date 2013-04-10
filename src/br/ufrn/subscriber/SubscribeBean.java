/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.subscriber;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge
 */
@XmlRootElement
public class SubscribeBean {

    private String andress;
    private String topic;
    private int port;

    public String getAndress() {
        return andress;
    }

    public void setAndress(String andress) {
        this.andress = andress;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    
}
