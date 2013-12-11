/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ufrn.GUI.AtualizaSubscriber;
import br.ufrn.GUI.SecretariaMeioAmbiente;
import br.ufrn.subscriber.SubscribeBean;
import br.ufrn.subscriber.Subscriber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipe
 */
public class SubscriberTest {

//    SubscribeBean sb = new SubscribeBean();
    SecretariaMeioAmbiente sec;
//    Subscriber s;

    public SubscriberTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        
        sec = new SecretariaMeioAmbiente();
//        s = new AtualizaSubscriber("topico", sec);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSubscribeBean() {
//        sb.setPort(11);
//        assertEquals(11, sb.getPort());
//        sb.setAndress("endereco");
//        assertEquals("endereco", sb.getAndress());
//        sb.setTopic("topico");
//        assertEquals("topico", sb.getTopic());

    }

    @Test
    public void testGui() {
        boolean passou = true;
        try {
            sec.exibirInformacao("1;pollutionMonitor;TRAFEGO_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("2;pollutionMonitor;TRAFEGO_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("3;pollutionMonitor;TRAFEGO_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("4;pollutionMonitor;TRAFEGO_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("1;pollutionMonitor;TRAFEGO_OFF");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("2;pollutionMonitor;TRAFEGO_OFF");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("3;pollutionMonitor;TRAFEGO_OFF");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("4;pollutionMonitor;TRAFEGO_OFF");
            assertTrue(sec.pegarTexto()!="");

            sec.exibirInformacao("1;willRainMonitor;RAIN_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("2;willRainMonitor;RAIN_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("3;willRainMonitor;RAIN_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("4;willRainMonitor;RAIN_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("1;willRainMonitor;RAIN_OFF");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("2;willRainMonitor;RAIN_OFF");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("3;willRainMonitor;RAIN_OFF");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("4;willRainMonitor;RAIN_OFF");
            assertTrue(sec.pegarTexto()!="");


            sec.exibirInformacao("1;acidRainMonitor;AQUI;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("2;acidRainMonitor;AQUI;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("3;acidRainMonitor;AQUI;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("4;acidRainMonitor;AQUI;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("1;acidRainMonitor;OUTRO;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("2;acidRainMonitor;OUTRO;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("3;acidRainMonitor;OUTRO;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("4;acidRainMonitor;OUTRO;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("1;acidRainMonitor;ACID_OFF;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("2;acidRainMonitor;ACID_OFF;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("3;acidRainMonitor;ACID_OFF;teste");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("4;acidRainMonitor;ACID_OFF;teste");
            assertTrue(sec.pegarTexto()!="");


            sec.exibirInformacao("1;noiseMonitor;NOISE_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("2;noiseMonitor;NOISE_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("3;noiseMonitor;NOISE_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("4;noiseMonitor;NOISE_ON");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("1;noiseMonitor;NOISE_OFF");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("2;noiseMonitor;NOISE_OFF");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("3;noiseMonitor;NOISE_OFF");
            assertTrue(sec.pegarTexto()!="");
            sec.exibirInformacao("4;noiseMonitor;NOISE_OFF");
            assertTrue(sec.pegarTexto()!="");
        } catch (NullPointerException e) {
            passou = false;
        }

        assertTrue(passou);

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}