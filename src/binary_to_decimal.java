/* Modified by isaacdarcilla 7-21-16*/

import java.util.*;

public class binary_to_decimal{
    Scanner scan;
    int _num;

void get_value(){
    scan = new Scanner(System.in);
    
    System.out.print("[INP]:[BINARY ]: ");
    _num = Integer.parseInt(scan.nextLine(), 2);
}

void convert() {
    String decimal = Integer.toString(_num);
    System.out.print("[OUT]:[DECIMAL]: "+decimal+"\n\n");
    }
}
class binary_to_decimal_convert{
    public static void main(String[] args){
    binary_to_decimal obj = new binary_to_decimal();
    
    obj.get_value();
    obj.convert();

}
}//While loop
