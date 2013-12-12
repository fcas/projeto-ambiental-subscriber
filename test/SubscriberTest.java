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

    SubscribeBean sb;
    SecretariaMeioAmbiente sec;

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
        sb = new SubscribeBean();
        sec = new SecretariaMeioAmbiente();
    }

    @After
    public void tearDown() {
    }
//    
//
//    @Test
//    public void testSubscribeBean() {
//        sb.setPort(11);
//        assertEquals(11, sb.getPort());
//        sb.setAndress("endereco");
//        assertEquals("endereco", sb.getAndress());
//        sb.setTopic("topico");
//        assertEquals("topico", sb.getTopic());
//
//    }

    @Test
    public void testGuiChuva() {
        sec.limpaTexto();
        sec.exibirInformacao("1;willRainMonitor;RAIN_ON");
        assertEquals(sec.pegarTexto(), "Chuva na área 1\n");
        sec.limpaTexto();
        sec.exibirInformacao("2;willRainMonitor;RAIN_ON");
        assertEquals(sec.pegarTexto(), "Chuva na área 2\n");
        sec.limpaTexto();
        sec.exibirInformacao("3;willRainMonitor;RAIN_ON");
        assertEquals(sec.pegarTexto(), "Chuva na área 3\n");
        sec.limpaTexto();
        sec.exibirInformacao("4;willRainMonitor;RAIN_ON");
        assertEquals(sec.pegarTexto(), "Chuva na área 4\n");
        sec.limpaTexto();
        sec.exibirInformacao("1;willRainMonitor;RAIN_OFF");
        assertEquals(sec.pegarTexto(), "");
        sec.limpaTexto();
        sec.exibirInformacao("2;willRainMonitor;RAIN_OFF");
        assertEquals(sec.pegarTexto(), "");
        sec.limpaTexto();
        sec.exibirInformacao("3;willRainMonitor;RAIN_OFF");
        assertEquals(sec.pegarTexto(), "");
        sec.limpaTexto();
        sec.exibirInformacao("4;willRainMonitor;RAIN_OFF");
        assertEquals(sec.pegarTexto(), "");
        sec.limpaTexto();
    }

    @Test
    public void testGuiChuvaAcida() {
        sec.limpaTexto();
        sec.exibirInformacao("1;acidRainMonitor;AQUI;teste");
        assertEquals(sec.pegarTexto(), "Chuva Ácida na área 1\n");
        sec.limpaTexto();
        sec.exibirInformacao("2;acidRainMonitor;AQUI;teste");
        assertEquals(sec.pegarTexto(), "Chuva Ácida na área 2\n");
        sec.limpaTexto();
        sec.exibirInformacao("3;acidRainMonitor;AQUI;teste");
        assertEquals(sec.pegarTexto(), "Chuva Ácida na área 3\n");
        sec.limpaTexto();
        sec.exibirInformacao("4;acidRainMonitor;AQUI;teste");
        assertEquals(sec.pegarTexto(), "Chuva Ácida na área 4\n");
        sec.limpaTexto();
        sec.exibirInformacao("1;acidRainMonitor;OUTRO;teste");
        assertEquals(sec.pegarTexto(), "Chuva Ácida se movendo para a direção teste\n");
        sec.limpaTexto();
        sec.exibirInformacao("2;acidRainMonitor;OUTRO;teste");
        assertEquals(sec.pegarTexto(), "Chuva Ácida se movendo para a direção teste\n");
        sec.limpaTexto();
        sec.exibirInformacao("3;acidRainMonitor;OUTRO;teste");
        assertEquals(sec.pegarTexto(), "Chuva Ácida se movendo para a direção teste\n");
        sec.limpaTexto();
        sec.exibirInformacao("4;acidRainMonitor;OUTRO;teste");
        assertEquals(sec.pegarTexto(), "Chuva Ácida se movendo para a direção teste\n");
        sec.limpaTexto();
        sec.exibirInformacao("1;acidRainMonitor;ACID_OFF;teste");
        assertEquals(sec.pegarTexto(), "");
        sec.limpaTexto();
        sec.exibirInformacao("2;acidRainMonitor;ACID_OFF;teste");
        assertEquals(sec.pegarTexto(), "");
        sec.limpaTexto();
        sec.exibirInformacao("3;acidRainMonitor;ACID_OFF;teste");
        assertEquals(sec.pegarTexto(), "");
        sec.limpaTexto();
        sec.exibirInformacao("4;acidRainMonitor;ACID_OFF;teste");
        assertEquals(sec.pegarTexto(), "");
        sec.limpaTexto();
    }

//    @Test
//    public void testGuiBarulho() {
//        sec.exibirInformacao("1;noiseMonitor;NOISE_ON");
//        assertTrue(!sec.pegarTexto().equals(""));
//        sec.exibirInformacao("2;noiseMonitor;NOISE_ON");
//        assertTrue(!sec.pegarTexto().equals(""));
//        sec.exibirInformacao("3;noiseMonitor;NOISE_ON");
//        assertTrue(!sec.pegarTexto().equals(""));
//        sec.exibirInformacao("4;noiseMonitor;NOISE_ON");
//        assertTrue(!sec.pegarTexto().equals(""));
//        sec.exibirInformacao("1;noiseMonitor;NOISE_OFF");
//        assertTrue(!sec.pegarTexto().equals(""));
//        sec.exibirInformacao("2;noiseMonitor;NOISE_OFF");
//        assertTrue(!sec.pegarTexto().equals(""));
//        sec.exibirInformacao("3;noiseMonitor;NOISE_OFF");
//        assertTrue(!sec.pegarTexto().equals(""));
//        sec.exibirInformacao("4;noiseMonitor;NOISE_OFF");
//        assertTrue(!sec.pegarTexto().equals(""));
//    }
//
//    @Test
//    public void testGuiPoluicao() {
//        boolean passou = true;
//        try {
//            sec.exibirInformacao("1;pollutionMonitor;TRAFEGO_ON");
//            assertTrue(!sec.pegarTexto().equals(""));
//            sec.exibirInformacao("2;pollutionMonitor;TRAFEGO_ON");
//            assertTrue(!sec.pegarTexto().equals(""));
//            sec.exibirInformacao("3;pollutionMonitor;TRAFEGO_ON");
//            assertTrue(!sec.pegarTexto().equals(""));
//            sec.exibirInformacao("4;pollutionMonitor;TRAFEGO_ON");
//            assertTrue(!sec.pegarTexto().equals(""));
//            sec.exibirInformacao("1;pollutionMonitor;TRAFEGO_OFF");
//            assertTrue(!sec.pegarTexto().equals(""));
//            sec.exibirInformacao("2;pollutionMonitor;TRAFEGO_OFF");
//            assertTrue(!sec.pegarTexto().equals(""));
//            sec.exibirInformacao("3;pollutionMonitor;TRAFEGO_OFF");
//            assertTrue(!sec.pegarTexto().equals(""));
//            sec.exibirInformacao("4;pollutionMonitor;TRAFEGO_OFF");
//            assertTrue(!sec.pegarTexto().equals(""));
//
//
//        } catch (NullPointerException e) {
//            passou = false;
//        }
//
//        assertTrue(passou);
//
//    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}