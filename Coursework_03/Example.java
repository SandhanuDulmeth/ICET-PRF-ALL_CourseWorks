import java.util.*;
class Example{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);

	System.out.print("\r\n                   _____                      _     ______        _     _                          \r\n                  / ____|                    | |   |  ____|      | |   (_)                         \r\n                 | (___  _ __ ___   __ _ _ __| |_  | |__ __ _ ___| |__  _  ___  _ __               \r\n                  \\___ \\| \'_ ` _ \\ / _` | \'__| __| |  __/ _` / __| \'_ \\| |/ _ \\| \'_ \\              \r\n                  ____) | | | | | | (_| | |  | |_  | | | (_| \\__ \\ | | | | (_) | | | |             \r\n                 |_____/|_| |_| |_|\\__,_|_|   \\__| |_|  \\__,_|___/_| |_|_|\\___/|_| |_|             \r\n                                                                                                   \r\n                                                                                                   \r\n");

	System.out.print("                  Date : ");
	String Date=input.next();

	System.out.print("                  Customer Name : ");
	String Name=input.next();

	System.out.print("                ______________________________________________________________________");

	System.out.println("\r\n                                _______     _____ _     _      _                    \r\n                               |__   __|   / ____| |   (_)    | |                   \r\n                                  | |_____| (___ | |__  _ _ __| |_ ___              \r\n                                  | |______\\___ \\| \'_ \\| | \'__| __/ __|             \r\n                                  | |      ____) | | | | | |  | |_\\__ \\             \r\n                                  |_|     |_____/|_| |_|_|_|   \\__|___/             \r\n                                                                               \r\n                                                                              \r\n");







	System.out.print("                  Number of T-Shirts : ");
	int Tshirts=input.nextInt();

	System.out.print("                  Unit Price of T-Shirts : ");
	double UnitPriceTshirts=input.nextDouble();

	System.out.print("                  Discount Rate (%) : ");
	double DiscountRateTshirts=input.nextDouble();
	
	double DiscountTshirts =(100-DiscountRateTshirts)/100;
	double AmountTshirts=(double)Tshirts*UnitPriceTshirts*DiscountTshirts;

	System.out.println("                 +-----------------+-------------+--------------------+---------------+");
	System.out.println("                 | Description     |     QTY     |     Unit Price     |     Amount    |");
	System.out.println("                 +-----------------+-------------+--------------------+---------------+");	

	System.out.printf("%18s%-17s%1s%-7d%1s%-12.2f%1s%-9.2f%1s\n", "|", " T-Shirt", "|      ", Tshirts, "|        ", UnitPriceTshirts, "|      ", AmountTshirts, "|");

	 
	
	System.out.println("                 +-----------------+-------------+--------------------+---------------+");	 




	System.out.println("\r\n                               \r\n                             _______                                               \r\n                            |__   __|                                              \r\n                               | |_ __ _____      _____  ___ _ __ ___              \r\n                               | | \'__/ _ \\ \\ /\\ / / __|/ _ \\ \'__/ __|             \r\n                               | | | | (_) \\ V  V /\\__ \\  __/ |  \\__ \\             \r\n                               |_|_|  \\___/ \\_/\\_/ |___/\\___|_|  |___/             \r\n                                                                                 \r\n                                                                                \r\n       \r\n                                                                              \r\n");




	System.out.print("                  Number of Trousers : ");
	int Trousers=input.nextInt();

	System.out.print("                  Unit Price of Trousers : ");
	double UnitPriceTrousers=input.nextDouble();

	System.out.print("                  Discount Rate (%) : ");
	double DiscountRateTrousers=input.nextDouble();


	double DiscountTrousers =(100-DiscountRateTrousers)/100;
	double AmountTrousers=(double)Trousers*UnitPriceTrousers*DiscountTrousers;

	System.out.println("                 +-----------------+-------------+--------------------+---------------+");
	System.out.println("                 | Description     |     QTY     |     Unit Price     |     Amount    |");
	System.out.println("                 +-----------------+-------------+--------------------+---------------+");	
	System.out.printf("%18s%-17s%1s%-7d%1s%-12.2f%1s%-9.2f%1s\n", "|", " Trousers", "|      ", Trousers, "|        ", UnitPriceTrousers, "|      ", AmountTrousers, "|");
	System.out.println("                 +-----------------+-------------+--------------------+---------------+");	 



	System.out.println("\r\n                                _____ _     _      _                     \r\n                               / ____| |   (_)    | |                    \r\n                              | (___ | |__  _ _ __| |_ ___               \r\n                               \\___ \\| \'_ \\| | \'__| __/ __|              \r\n                               ____) | | | | | |  | |_\\__ \\              \r\n                              |_____/|_| |_|_|_|   \\__|___/              \r\n                                                                    \r\n                                                                    \r\n");


	System.out.print("                  Number of Shirts : ");
	int Shirts=input.nextInt();

	System.out.print("                  Unit Price of Shirts : ");
	double UnitPriceShirts=input.nextDouble();

	System.out.print("                  Discount Rate (%) : ");
	double DiscountRateShirts=input.nextDouble();


	double DiscountShirts =(100-DiscountRateShirts)/100;
	double AmountShirts=(double)Shirts*UnitPriceShirts*DiscountShirts;

	System.out.println("                 +-----------------+-------------+--------------------+---------------+");
	System.out.println("                 | Description     |     QTY     |     Unit Price     |     Amount    |");
	System.out.println("                 +-----------------+-------------+--------------------+---------------+");	
	System.out.printf("%18s%-17s%1s%-7d%1s%-12.2f%1s%-9.2f%1s\n", "|", " T-Shirt", "|      ", Tshirts, "|        ", UnitPriceTshirts, "|      ", AmountTshirts, "|");
	System.out.println("                 +-----------------+-------------+--------------------+---------------+");	 



	System.out.println("\r\n                               _____ _                _                     \r\n                              / ____| |              | |                    \r\n                             | (___ | |__   ___  _ __| |_ ___               \r\n                              \\___ \\| \'_ \\ / _ \\| \'__| __/ __|              \r\n                              ____) | | | | (_) | |  | |_\\__ \\              \r\n                             |_____/|_| |_|\\___/|_|   \\__|___/              \r\n                                                                        \r\n                                                                        \r\n");



	System.out.print("                  Number of Shorts : ");
	int Shorts=input.nextInt();

	System.out.print("                  Unit Price of Shorts : ");
	double UnitPriceShorts=input.nextDouble();

	System.out.print("                  Discount Rate (%) : ");
	double DiscountRateShorts=input.nextDouble();

	double DiscountShorts =(100-DiscountRateShorts)/100;
	double AmountShorts=(double)Shorts*UnitPriceShorts*DiscountShorts;

	System.out.println("                 +-----------------+-------------+--------------------+---------------+");
	System.out.println("                 | Description     |     QTY     |     Unit Price     |     Amount    |");
	System.out.println("                 +-----------------+-------------+--------------------+---------------+");	
	
	
	System.out.printf("%18s%-17s%1s%-7d%1s%-12.2f%1s%-9.2f%1s\n", "|", " Shorts", "|      ", Shorts, "|        ", UnitPriceShorts, "|      ", AmountShorts, "|"); 
	
	
	
	System.out.println("                 +-----------------+-------------+--------------------+---------------+");	 

	System.out.println("                 =======================================================================");

	System.out.println("                 +--------------------------------------------------------------------------------------------------------------------+\r\n                 |                               ____  _ _ _    _____                                                                 |\r\n                 |                              |  _ \\(_) | |  / ____|                                                                |\r\n                 |                              | |_) |_| | | | (___  _   _ _ __ ___  _ __ ___   __ _ _ __ _   _                      |\r\n                 |                              |  _ <| | | |  \\___ \\| | | | \'_ ` _ \\| \'_ ` _ \\ / _` | \'__| | | |                     |\r\n                 |                              | |_) | | | |  ____) | |_| | | | | | | | | | | | (_| | |  | |_| |                     |\r\n                 |                              |____/|_|_|_| |_____/ \\__,_|_| |_| |_|_| |_| |_|\\__,_|_|   \\__, |                     |\r\n                 |                                                                                        __/ |                       |\r\n                 |                                                                                       |___/                        |\r\n                 |                                                                                                                    |\r\n");


	
	System.out.printf("%18s%-15s%-50s%-8s%-43s%1s\n","|","  Coustomer : ",Name,"Date : ",Date,"|");
	System.out.println("                 +-----------------------------+-------------------------+--------------------------------+---------------------------+");
	System.out.println("                 | Description                 |            QTY          |           Unit Price           |          Amount           |");
	System.out.println("                 +-----------------------------+-------------------------+--------------------------------+---------------------------+");
System.out.printf("%18s%-29s%1s%-12d%1s%-17.2f%1s%-16.2f%1s\n", "|", " T-Shirt ", "|             ",Tshirts , "|               ", UnitPriceTshirts, "|           ", AmountTshirts, "|");      
	System.out.println("                 +-----------------------------+-------------------------+--------------------------------+---------------------------+"); 
System.out.printf("%18s%-29s%1s%-12d%1s%-17.2f%1s%-16.2f%1s\n", "|", " Trousers ", "|             ",Trousers , "|               ", UnitPriceTrousers, "|           ", UnitPriceTrousers, "|");
	System.out.println("                 +-----------------------------+-------------------------+--------------------------------+---------------------------+");
System.out.printf("%18s%-29s%1s%-12d%1s%-17.2f%1s%-16.2f%1s\n", "|", " Shirt ", "|             ",Shirts , "|               ", UnitPriceShirts, "|           ", AmountShirts, "|"); 
	System.out.println("                 +-----------------------------+-------------------------+--------------------------------+---------------------------+");
System.out.printf("%18s%-29s%1s%-12d%1s%-17.2f%1s%-16.2f%1s\n", "|", " Shorts ", "|             ",Shorts , "|               ", UnitPriceShorts, "|           ", AmountShorts, "|");
	System.out.println("                 +-----------------------------+-------------------------+--------------------------------+---------------------------+"); 
	double Tot=(AmountTshirts+AmountTrousers+AmountTshirts+AmountTshirts);
	System.out.printf("%18s%-88S%1s%-16.2f%1s\n","|"," Total","|           ",Tot,"|");
	System.out.println("                 +----------------------------------------------------------------------------------------+---------------------------+"); 




	


		}
}






