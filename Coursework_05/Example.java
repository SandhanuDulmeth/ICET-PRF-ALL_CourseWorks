import java.util.*;

class Example {
    public static void main(String[] args) {
       Scanner input1= new Scanner(System.in);
        Random input2 = new Random();
      
      char homepage ='Y';
  while(homepage=='Y') {
	    
        System.out.print("\r\n                    __                     __                                  \r\n                   |  \\                   |  \\          \r\n                    \\$$  _______  ______  | $$  _______ \r\n                   |  \\ /       \\|      \\ | $$ /       \\\r\n                   | $$|  $$$$$$$ \\$$$$$$\\| $$|  $$$$$$$\r\n                   | $$| $$      /      $$| $$| $$      \r\n                   | $$| $$_____|  $$$$$$$| $$| $$_____ \r\n                   | $$ \\$$     \\\\$$    $$| $$ \\$$     \\\r\n                    \\$$  \\$$$$$$$ \\$$$$$$$ \\$$  \\$$$$$$$\r\n                                                        \r\n                                     \r\n                                     \r\n");

			System.out.print("\r\n  _   _                 _                  _____                          _            \r\n | \\ | |               | |                / ____|                        | |           \r\n |  \\| |_   _ _ __ ___ | |__   ___ _ __  | |     ___  _ ____   _____ _ __| |_ ___ _ __ \r\n | . ` | | | | \'_ ` _ \\| \'_ \\ / _ \\ \'__| | |    / _ \\| \'_ \\ \\ / / _ \\ \'__| __/ _ \\ \'__|\r\n | |\\  | |_| | | | | | | |_) |  __/ |    | |___| (_) | | | \\ V /  __/ |  | ||  __/ |   \r\n |_| \\_|\\__,_|_| |_| |_|_.__/ \\___|_|     \\_____\\___/|_| |_|\\_/ \\___|_|   \\__\\___|_|   \r\n                                                                                       \r\n                                                                                       \r\n");
  
		System.out.println("==========================================================================================");
  
	System.out.println("			[01] Decimal Converter");
	System.out.println("			[02] Binary Converter");
	System.out.println("			[03] Octal Converter");
	System.out.println("			[04] Hexadecimal Converter");
	System.out.println("			[05] Roman Number Converter\n");
	
	System.out.print("Enter Option -> ");
	int option=input1.nextInt();
  	  
	switch (option){
	case 1:
	System.out.println("+-------------------------------------+");
  	System.out.println("|       Decimal Converter             |");
	System.out.println("+-------------------------------------+\n");
	
	System.out.print("Enter an Decimal number : ");
	int DecimalNumber=input1.nextInt();
	
	if(DecimalNumber>0){
	int DecimalNumber1=DecimalNumber,DecimalNumber2=DecimalNumber,DecimalNumber3=DecimalNumber;
	 String binary = "";
        while (DecimalNumber1 > 0) {
            int remainder = DecimalNumber1 % 2;
            binary = remainder + binary;
            DecimalNumber1=DecimalNumber1 / 2;
        }
        
        System.out.println("\n		Binary number  : " + binary);
        
        
        String octal = "";
        while (DecimalNumber2 > 0) {
            int remainder = DecimalNumber2 % 8;
            octal = remainder + octal;
            DecimalNumber2 = DecimalNumber2 / 8;
        }
        
        System.out.println("		Octal number : " + octal);
        
        
        String hexadecimal = "";
        
        while (DecimalNumber3 > 0) {
            int remainder = DecimalNumber3 % 16;
            char hexChar;
            
            if (remainder < 10) {
                hexChar = (char) (remainder + '0'); 
            } else {
                hexChar = (char) (remainder - 10 + 'A'); 
            }
            
            hexadecimal = hexChar + hexadecimal;
            DecimalNumber3 = DecimalNumber3 / 16;
        }
        
        System.out.println("		Hexadecimal  Number : " + hexadecimal);
        
        
        System.out.print("\nDo you want to go to homepage(Y/N) -> ");
		homepage=input1.next().charAt(0);
		
	}else {
		System.out.println("			Invalid input....\n");
		
		System.out.print("Do you want to input number again(Y/N) -> ");
		homepage=input1.next().charAt(0);
		
		
		}
        break;
      case 2:
      
    System.out.println("+-------------------------------------+");
  	System.out.println("|         Binary Converter          |");
	System.out.println("+-------------------------------------+\n");
	
       System.out.print("Enter a binary number: ");
        int BinaryNumber = input1.nextInt();  
        
        boolean check3=true;
        
        int check1=BinaryNumber;
       while(check1!=0){
       int check= check1%10;
       
       if (check!=0 && check!=1){
		  check3=false;
		  }
      
       check1= check1/10;
       }
		
        
        if(check3==true){
       int BinaryNumber1=BinaryNumber,BinaryNumber2=BinaryNumber,BinaryNumber3=BinaryNumber;
      
        int decimal = 0;
        int power = 0;
        
        while (BinaryNumber1 > 0) {
            int remainder = BinaryNumber1 % 10;  
            decimal += remainder * Math.pow(2, power);  
           BinaryNumber1 = BinaryNumber1 / 10; 
            power++;
        }
        
        System.out.println("\n		Decimal: " + decimal);
      
      

      decimal = 0;
       power = 0;
        
        while (BinaryNumber2 > 0) {
            long remainder = BinaryNumber2 % 10;
            decimal += remainder * Math.pow(2, power);
            BinaryNumber2 = BinaryNumber2 / 10;
            power++;
        }
        
        String octal = "";
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal = decimal / 8;
        }
        
        System.out.println("		Octal: " + octal);
        
        
        
        decimal = 0;
        power = 0;
        
        while (BinaryNumber3 > 0) {
            long remainder = BinaryNumber3 % 10;
            decimal += remainder * Math.pow(2, power);
            BinaryNumber3 = BinaryNumber3 / 10;
            power++;
        }
        
       
        String hexadecimal = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexChar;
            
            if (remainder < 10) {
                hexChar = (char) (remainder + '0'); 
            } else {
                hexChar = (char) (remainder - 10 + 'A'); 
            }
            
            hexadecimal = hexChar + hexadecimal;
            decimal = decimal / 16;
        }
        
        System.out.println("		Hexadecimal: " + hexadecimal);
      
       System.out.print("\nDo you want to go to homepage(Y/N) -> ");
		homepage=input1.next().charAt(0);
      
  }else {
	  System.out.println("			Invalid input....\n");
		
		System.out.print("Do you want to input number again(Y/N) -> ");
		homepage=input1.next().charAt(0);
	  }
      
      break;
     case 3:
     
    System.out.println("+-------------------------------------+");
  	System.out.println("|          Octal Converter           |");
	System.out.println("+-------------------------------------+\n");
     
     System.out.print("Enter an octal number: ");
    int octalNumber = input1.nextInt();


		check3=true;
        
        check1=octalNumber;
       while(check1!=0){
       int check= check1%10;
       
       if (check!=0 && check!=1 && check!=2 && check!=3 && check!=4 &&check!=5 && check!=6 && check!=7){
		  check3=false;
		  }
      
       check1= check1/10;
       }
		
        
        if(check3==true){
		int octalNumber1=octalNumber,octalNumber2=octalNumber,octalNumber3=octalNumber;
   
    int decimal = 0;
    int base = 1;  

    while (octalNumber1 > 0) {
        int lastDigit = octalNumber1 % 10; 
        decimal += lastDigit * base;
        base *= 8;  
        octalNumber1 /= 10; 
    }

    
    System.out.println("\n		Decimal value: " + decimal); 
    
    
   
     int decimalNumber = decimal;

   String binary2 = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary2 = remainder + binary2;
            decimalNumber=decimalNumber / 2;
        }
        
        System.out.println("		Binary number   : " + binary2);
      
	int decimalNumber2 = decimal;

   String hexadecimal = "";
        while (decimalNumber2 > 0) {
            int remainder = decimalNumber2 % 16;
            char hexChar;
            
            if (remainder < 10) {
                hexChar = (char) (remainder + '0'); 
            } else {
                hexChar = (char) (remainder - 10 + 'A'); 
            }
            
            hexadecimal = hexChar + hexadecimal;
            decimalNumber2 = decimalNumber2 / 16;
        }
        
        System.out.println("		Hexadecimal: " + hexadecimal);
      
       System.out.print("\nDo you want to go to homepage(Y/N) -> ");
		homepage=input1.next().charAt(0);
      
  }else {
	  System.out.println("			Invalid input....\n");
		
		System.out.print("Do you want to input number again(Y/N) -> ");
		homepage=input1.next().charAt(0);
	  }
	  
	  break;
	  case 4:
	  
	System.out.println("+---------------------------------------+");
  	System.out.println("|      HexaDecimal Converter    |");
	System.out.println("+---------------------------------------+\n");
	
	
	input1.nextLine();
     System.out.print("Enter a hexadecimal number: ");
    String hexNumber = input1.nextLine();  

    
    int decimal = 0;
    int base = 1; 

    for (int i = hexNumber.length() - 1; i >= 0; i--) {
        char hexDigit = hexNumber.charAt(i);
        int value=0;

       
        if (hexDigit >= '0' && hexDigit <= '9') {
            value = hexDigit - '0';  
        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
            value = hexDigit - 'A' + 10;  
        } else if  (hexDigit >= 'a' && hexDigit <= 'f') {
            value = hexDigit - 'a' + 10; 
        } 

        decimal += value * base;  
        base *= 16; 
    }

   
    System.out.println("\n		Decimal value: " + decimal);
    
    int DecimalNumber1=decimal,DecimalNumber2=decimal;
	 String binary = "";
        while (DecimalNumber1 > 0) {
            int remainder = DecimalNumber1 % 2;
            binary = remainder + binary;
            DecimalNumber1=DecimalNumber1 / 2;
        }
        
        System.out.println("		Binary number   : " + binary);
        
        
        String octal = "";
        while (DecimalNumber2 > 0) {
            int remainder = DecimalNumber2 % 8;
            octal = remainder + octal;
            DecimalNumber2 = DecimalNumber2 / 8;
        }
        
        System.out.println("		Octal           : " + octal);
        
        	System.out.print("\nDo you want to input number again(Y/N) -> ");
		homepage=input1.next().charAt(0);
        
        break;
        
        case 5:
        
    System.out.println("+----------------------------------------------------+");
  	System.out.println("|          Roman Number Converter           |");
	System.out.println("+----------------------------------------------------+\n");
        
        System.out.println("		[01] Decimal Number to Roman Number Converter ");
        System.out.println("\n		[02] Roman Number to Decimal Number Converter \n");
        
        System.out.print("Enter an option : ");
        int option2=input1.nextInt();
        
        if(option2==1){
			
	System.out.println("+-----------------------------------------------------------------------------+");
  	System.out.println("|          Decimal Number to Roman Number Converter          |");
	System.out.println("+-----------------------------------------------------------------------------+\n");
			
			System.out.print("Enter an Decimal number : ");
			int DecimalToRoman=input1.nextInt();
			
			System.out.print("\nRoman Number :  ");
			
		while (DecimalToRoman >= 1000) {
           System.out.print("M");
            DecimalToRoman -= 1000;
        }
        if (DecimalToRoman >= 900) {
            System.out.print("CM");
            DecimalToRoman -= 900;
        }
        if (DecimalToRoman >= 500) {
            System.out.print("D");
            DecimalToRoman -= 500;
        }
        if (DecimalToRoman >= 400) {
            System.out.print("CD");
            DecimalToRoman -= 400;
        }
        while (DecimalToRoman >= 100) {
            System.out.print("C");
            DecimalToRoman -= 100;
        }
        if (DecimalToRoman >= 90) {
            System.out.print("XC");
            DecimalToRoman -= 90;
        }
        if (DecimalToRoman >= 50) {
            System.out.print("L");
            DecimalToRoman -= 50;
        }
        if (DecimalToRoman >= 40) {
            System.out.print("XL");
            DecimalToRoman -= 40;
        }
        while (DecimalToRoman >= 10) {
            System.out.print("X");
            DecimalToRoman -= 10;
        }
        if (DecimalToRoman >= 9) {
            System.out.print("IX");
            DecimalToRoman -= 9;
        }
        if (DecimalToRoman >= 5) {
            System.out.print("V");
            DecimalToRoman -= 5;
        }
        if (DecimalToRoman >= 4) {
            System.out.print("IV");
            DecimalToRoman -= 4;
        }
        while (DecimalToRoman >= 1) {
            System.out.print("I");
            DecimalToRoman -= 1;
        }
			
			
			}else{
				
	System.out.println("+-----------------------------------------------------------------------------+");
  	System.out.println("|          Roman Number to Decimal Number Converter          |");
	System.out.println("+-----------------------------------------------------------------------------+\n");
			
				
		System.out.print("Enter a Roman number: ");
        String roman = input1.next();
        int result = 0;
        int length = roman.length();
        int current = 0, next = 0;

        for (int i = 0; i < length; i++) {
            switch (roman.charAt(i)) {
                case 'M':
                    current = 1000;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'I':
                    current = 1;
                    break;
                
            }

            if (i + 1 < length) {
                switch (roman.charAt(i + 1)) {
                    case 'M':
                        next = 1000;
                        break;
                    case 'D':
                        next = 500;
                        break;
                    case 'C':
                        next = 100;
                        break;
                    case 'L':
                        next = 50;
                        break;
                    case 'X':
                        next = 10;
                        break;
                    case 'V':
                        next = 5;
                        break;
                    case 'I':
                        next = 1;
                        break;
                }

                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }

        System.out.println("\n		Decimal number: " + result);		
				
				}
	  	System.out.print("\n\nDo you want to input number again(Y/N) -> ");
		homepage=input1.next().charAt(0);
        
	  break;
	    
  }
      
      
	}

	
	
	}
		}
  	
  		
    

