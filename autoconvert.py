#!/usr/bin/python
#coded by  isaacdarcilla 7-20-16

import os
import sys
from time import *
from colored import *

print fore.RED+"\nAutomated Conversion for Assembly by Isaac Arcilla"+style.RESET
def help():
    print fore.LIGHT_BLUE+"\nSELECT CONVERSION TYPE\n "+fore.RED+"1"+style.RESET+" - Binary to Decimal\t "+fore.RED+"3"+style.RESET+" - Binary to Hexadecimal\t "+fore.RED+"5"+style.RESET+" - Hexadecimal to Decimal\n "+fore.RED+"2"+style.RESET+" - Decimal to Binary\t "+fore.RED+"4"+style.RESET+" - Decimal to Hexadecimal\t "+fore.RED+"6"+style.RESET+" - Decimal to Octal\n"+style.RESET

def main():
    try:
        choosen = str(raw_input(fore.YELLOW+'[CONVERT]:[TYPE]: '+style.RESET))

        if choosen == '1' :
            print fore.LIGHT_BLUE+'\nBINARY TO DECIMAL CONVERSION SELECTED\n'+style.RESET
            os.system('java binary_to_decimal_convert')
            main()
        elif choosen == '2':
            print fore.LIGHT_BLUE+'\nDECIMAL TO BINARY CONVERSION SELECTED\n'+style.RESET

            os.system('java decimal_to_binary')
            main()
        elif choosen == '3':
            print fore.LIGHT_BLUE+'\nBINARY TO HEXA CONVERSION SELECTED\n'+style.RESET

            os.system('./binary_to_hex')
            main()
        elif choosen == '4':
            print fore.LIGHT_BLUE+'\nDECIMAL TO HEXADECIMAL SELECTED\n'+style.RESET

            os.system('java decimal_to_hexa')
            main()
        elif choosen == '5':
            print fore.LIGHT_BLUE+'\nHEXADECIMAL TO DECIMAL SELECTED\n'+style.RESET

            os.system('java hexa_to_decimal')
            main()
        elif choosen == '6':
            print fore.LIGHT_BLUE+'\nDECIMAL TO OCTAL SELECTED\n'+style.RESET

            os.system('java decimal_to_octal')
            main()
        elif choosen == 'help':
            help()
            main()
        elif choosen == 'exit':
            print fore.LIGHT_BLUE+'[+] Clearing session. Please wait.'+style.RESET

            os.system('clear')
            exit()
        elif choosen == 'clear':
            os.system('clear')
            main()
        else:
            print fore.BLUE+"[-] No such conversion: "+style.RESET+choosen
            main()
    except KeyboardInterrupt:
		print  ('\n\n'+fore.BLUE+'[-] Operation canceled by user. Done.\n'+style.RESET)

if __name__=='__main__':
    help()
    main()



