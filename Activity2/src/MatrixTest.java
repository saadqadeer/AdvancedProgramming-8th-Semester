// UNIT TESTS

//show green in case of success and red in case of failure
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {
    
   
    
    //Tests Addition 3 matrices
    @SuppressWarnings("deprecation")
	@Test
    public void testmultiplication() throws IOException {
    	
    	NaturalNumbers object=new NaturalNumbers();
    	int[] set2 =new int[5];
    	for(int i=0; i<set2.length;i++){
    		set2[i]=i+1;
    	}
    	
    	
    
        int result1=object.addition(set2);
        int s=15;
        
        assertEquals(result1,s );
        
    }   
    
    @Test
    public void testdivide() throws IOException {
    	
    	NaturalNumbers object=new NaturalNumbers();
    	int[] set2 =new int[5];
    	for(int i=0; i<set2.length;i++){
    		set2[i]=0;
    	}
    	
    	
    
        int result1=object.divide(set2);
        int s=0;
        
        assertEquals(result1,s );
        
    }  
    

    
}