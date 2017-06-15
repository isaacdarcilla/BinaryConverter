/* Modified by isaacdarcilla 7-21-16*/

import java.io.*;
import java.util.*;

public class hex_to_decimal{
    Scanner scan;
    int _num;

void get_value(){
    scan = new Scanner(System.in);
    
    System.out.print("[INP]:[HEXADECIMAL]: ");
    _num = Integer.parseInt(scan.nextLine(), 16);
}

void convert() {
    String decimal = Integer.toString(_num);
    System.out.print("[OUT]:[  DECIMAL  ]: "+decimal+"\n\n");
    }
}
class hexa_to_decimal{
    public static void main(String[] args) throws Exception{
    hex_to_decimal obj = new hex_to_decimal();
    
    obj.get_value();
    obj.convert();
    }
}//While loop
