/* Modified by isaacdarcilla 7-21-16*/
import java.io.*;
import java.util.*;

public class decimal_to_hex{
    Scanner scan;
    int _num;

void get_value(){
    scan = new Scanner(System.in);
    
    System.out.print("[INP]:[  DECIMAL  ]: ");
    _num = Integer.parseInt(scan.nextLine());
}

void convert(){
    String hexa = Integer.toHexString(_num);
    System.out.print("[OUT]:[HEXADECIMAL]: "+hexa+"\n\n");
}        
}
class decimal_to_hexa{
    public static void main(String[] args)throws Exception {
    decimal_to_hex obj = new decimal_to_hex();
    
    obj.get_value();
    obj.convert();
    }
}
