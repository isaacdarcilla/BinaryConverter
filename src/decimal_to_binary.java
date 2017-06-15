/* Modified by isaacdarcilla 7-21-16*/

import java.util.*;

public class decimal_to_binary{
    public String toBinary(int _num){
    if ( _num == 0 ){
        return "0";
    }
    String binary = "";
    while (_num > 0){
        int rem = _num % 2;
        binary = rem + binary;
        _num = _num/2;
    }
        return binary;
    }
public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("[INP]:[DECIMAL]: ");
        int decimal = scan.nextInt();
        
        decimal_to_binary dtb = new decimal_to_binary();
        String binary = dtb.toBinary(decimal);
        System.out.print("[OUT]:[BINARY ]: "+binary+"\n\n");
        
    }    
}
