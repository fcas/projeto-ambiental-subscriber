
import br.ufrn.subscriber.EsperarAtualizacao;
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
    
    public TratarMensagem msg;
    public EsperarAtualizacao ea; 
    public Socket socket;
    
    
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
        msg = new TratarMensagem() {

            @Override
            public void tratarMensagem(String mensagem) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        ea = new EsperarAtualizacao(9001, msg);
        try {
          socket = new Socket("localhost", 8080);
        } catch (Exception e) {
        } 

    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testExtrairMsgFail() throws IOException{
      boolean thrown = false;
      
        try {
                ea.extrairMensagem(socket); 
        } catch (NullPointerException e) {
            thrown = true;
         }
        
        assertTrue(thrown);
    }
    
    @Test
    public void testRunFail() throws IOException{
      boolean thrown = false;
      
        try {
                ea.run(); 
        } catch (NullPointerException e) {
            thrown = true;
         }
        
        assertTrue(thrown);
    }
}
 
