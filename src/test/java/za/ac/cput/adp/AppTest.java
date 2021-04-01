package za.ac.cput.adp;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    /*Testing for Equality by matching pleaseCallMe code to the provider.
     *The expected value is matched with its expected result..See App class.
     */
    @Test
    void testEquality(){
        App providers = new App();
        String result = providers.pleaseCallMe(121);
        assertEquals("MTN",result);
    }

    /*Testing for Identity
     *String Telkom set to Vodacom code value. Identity test checks whether Telkom and vodacom share the same values
     */
    @Test
     void testId(){
        App providers = new App();
        String Telkom = "Vodacom";
        String result = providers.pleaseCallMe(140);
        assertSame(Telkom,result);
    }

    //Fail test Disabled
    @Disabled
    //Testing for failure
    @Test
     void testFail(){
        App providers = new App();
        String result = providers.pleaseCallMe(111);
        assertEquals("MTN","Cell C");
    }

    //TimeOut test Disabled
    @Disabled
    //Testing timeOut
    @Test
    void testTimeOut(){
        assertTimeout(Duration.ofMillis(100), () ->{
            Thread.sleep(5000);
            System.out.println("Timed out");
        });

    }


}