/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ufrn.GUI.SecretariaMeioAmbiente;
import br.ufrn.subscriber.EsperarAtualizacao;
import br.ufrn.subscriber.SubscribeBean;
import br.ufrn.subscriber.TratarMensagem;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import junit.framework.AssertionFailedError;
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
public class EsperaAtualizacaoTest {
    
//    public TratarMensagem msg;
//    public EsperarAtualizacao ea; 
//    public Socket socket;
    
    //SecretariaMeioAmbiente sec = new SecretariaMeioAmbiente();
    //SubscribeBean sb = new SubscribeBean();
    
    
    public EsperaAtualizacaoTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws UnknownHostException, IOException {
//        msg = new TratarMensagem() {
//
//            @Override
//            public void tratarMensagem(String mensagem) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };
//        ea = new EsperarAtualizacao(9000, msg);
//        try {
//          socket = new Socket("localhost", 8080);
//        } catch (Exception e) {
//        }

    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    /*
    @Test
    public void testExtrairMsgFail() throws IOException{
//      boolean thrown = false;
//      
//        try {
//                ea.extrairMensagem(socket); 
//        } catch (NullPointerException e) {
//            thrown = true;
//         }
//        
//        assertTrue(thrown);
    }
    
    @Test
    public void testRunFail() throws IOException{
//      boolean thrown = false;
//      
//        try {
//                ea.run(); 
//        } catch (NullPointerException e) {
//            thrown = true;
//         }
//        
//        assertTrue(thrown);
    }
    
    @Test
    public void testGui() {
//        boolean passou = true;
//        try {
//            sec.exibirInformacao("1;pollutionMonitor;TRAFEGO_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("2;pollutionMonitor;TRAFEGO_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("3;pollutionMonitor;TRAFEGO_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("4;pollutionMonitor;TRAFEGO_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("1;pollutionMonitor;TRAFEGO_OFF");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("2;pollutionMonitor;TRAFEGO_OFF");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("3;pollutionMonitor;TRAFEGO_OFF");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("4;pollutionMonitor;TRAFEGO_OFF");
//            assertTrue(sec.pegarTexto()!="");
//
//            sec.exibirInformacao("1;willRainMonitor;RAIN_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("2;willRainMonitor;RAIN_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("3;willRainMonitor;RAIN_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("4;willRainMonitor;RAIN_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("1;willRainMonitor;RAIN_OFF");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("2;willRainMonitor;RAIN_OFF");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("3;willRainMonitor;RAIN_OFF");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("4;willRainMonitor;RAIN_OFF");
//            assertTrue(sec.pegarTexto()!="");
//
//
//            sec.exibirInformacao("1;acidRainMonitor;AQUI;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("2;acidRainMonitor;AQUI;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("3;acidRainMonitor;AQUI;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("4;acidRainMonitor;AQUI;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("1;acidRainMonitor;OUTRO;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("2;acidRainMonitor;OUTRO;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("3;acidRainMonitor;OUTRO;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("4;acidRainMonitor;OUTRO;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("1;acidRainMonitor;ACID_OFF;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("2;acidRainMonitor;ACID_OFF;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("3;acidRainMonitor;ACID_OFF;teste");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("4;acidRainMonitor;ACID_OFF;teste");
//            assertTrue(sec.pegarTexto()!="");
//
//
//            sec.exibirInformacao("1;noiseMonitor;NOISE_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("2;noiseMonitor;NOISE_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("3;noiseMonitor;NOISE_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("4;noiseMonitor;NOISE_ON");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("1;noiseMonitor;NOISE_OFF");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("2;noiseMonitor;NOISE_OFF");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("3;noiseMonitor;NOISE_OFF");
//            assertTrue(sec.pegarTexto()!="");
//            sec.exibirInformacao("4;noiseMonitor;NOISE_OFF");
//            assertTrue(sec.pegarTexto()!="");
//        } catch (NullPointerException e) {
//            passou = false;
//        }
//
//        assertTrue(passou);

    }
    
    */
}