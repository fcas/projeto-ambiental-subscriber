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
public class NewEmptyJUnitTest {
    SubscribeBean sb = new SubscribeBean();
    SecretariaMeioAmbiente sec = new SecretariaMeioAmbiente();
    Subscriber s = new AtualizaSubscriber("tópico", sec);
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSubscribeBean(){
        sb.setPort(11);
        assertEquals(11, sb.getPort());
        sb.setAndress("endereço");
        assertEquals("endereço", sb.getAndress());
        sb.setTopic("tópico");
        assertEquals("tópico", sb.getTopic());
    }
    
    @Test
    public void testSubscriber(){
//        s.subscribe();
//        s.unsubscribe();
//        s.tratarMensagem("tópico");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}