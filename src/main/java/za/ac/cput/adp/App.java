package za.ac.cput.adp;

/* author Liam Stewart
 *219084394
 */
import java.util.Scanner;

// A class holding a simple method filled with values to use for test cases
public class App {
    public String pleaseCallMe(int code){
        if(code == 121)
            return "MTN";
        else if(code == 140)
            return "Vodacom";
        else if(code == 111)
            return "Cell C";
        else if(code == 125)
            return "Virgin mobile";
        else return "cell provider not recognized";
    }
}




