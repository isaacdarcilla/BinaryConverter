/* Modified by isaacdarcilla 7-21-16*/

import java.io.*;
import java.util.*;

public class decimal_to_oct{
    Scanner scan;
    int _num;

void get_value(){
    scan = new Scanner(System.in);
    
    System.out.print("[INP]:[DECIMAL]: ");
    _num = Integer.parseInt(scan.nextLine());
}

void convert() {
    String decimal = Integer.toOctalString(_num);
    System.out.print("[OUT]:[ OCTAL ]: "+decimal+"\n\n");
    }
}
class decimal_to_octal{
    public static void main(String[] args) throws Exception{
    decimal_to_oct obj = new decimal_to_oct();
    
    obj.get_value();
    obj.convert();
    }
}//While loop
