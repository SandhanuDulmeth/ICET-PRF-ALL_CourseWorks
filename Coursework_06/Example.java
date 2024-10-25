import java.util.*;
class Example{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		char again='Y';

		do{
			icetMain();

		System.out.print("\n\nEnter an option to continue -> ");
		int MainOption=scanner.nextInt();
		clearConsole();
		
		switch (MainOption)
		{
			case 1:{
				WithHoldingTax();
				break;
			}
			case 2:{
				payableTax();
			break;
			}
			case 3:{
				 IncomeTax();
				break;
			}
			case 4:{
				SSCLTax();			
				break;
			}
			case 5:{
				LeasingPayment();		
				break;
			}
			case 6:
				clearConsole();
				return;
				
				
			default:{
			System.out.print("\n\nWrong option ");
			System.out.print("\n\nDo you want to try again (Y/N)  :  ");
			again=scanner.next().charAt(0);
			clearConsole();
		}
	
				
		}
		

		
		} while (again=='Y' || again=='y');


	}
	


public static double leasingMath(double CalculateLeaseAmount,double interestRate,double NumberOfYear){
						double i=(interestRate/1200.0);
						double math1=CalculateLeaseAmount*i;
						double month=NumberOfYear*12;
						double math2=Math.pow((1+i),month);
						double math3=(1-(1/math2));
						return math1/math3;
	
	}

public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
			e.printStackTrace();
			// Handle any exceptions.
		}
	}

public static void icetMain(){
		System.out.println("\r\n                                                 __   ______   ________  ________ \r\n                                                |  \\ /      \\ |        \\|        \\\r\n                                                 \\$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$\r\n                                                |  \\| $$   \\$$| $$__       | $$   \r\n                                                | $$| $$      | $$  \\      | $$   \r\n                                                | $$| $$   __ | $$$$$      | $$   \r\n                                                | $$| $$__/  \\| $$_____    | $$   \r\n                                                | $$ \\$$    $$| $$     \\   | $$   \r\n                                                 \\$$  \\$$$$$$  \\$$$$$$$$    \\$$   \r\n                                                                                  \r\n                                  \r\n                                  \r\n")	;
		System.out.println(" _______             __   __   _____              _         _____   _    _   _                   _______    ____    _____  ");
		System.out.println("|__   __|     /\\     \\ \\ / /  / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ ");
		System.out.println("   | |       /  \\     \\ V /  | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |");
		System.out.println("   | |      / /\\ \\     > <   | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  / ");
		System.out.println("   | |     / ____ \\   / . \\  | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ ");
		System.out.println("   |_|    /_/    \\_\\ /_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\ ");
		
		System.out.println("\n==============================================================================================================================");
		
		System.out.println("\n\n\t[1] Withholding Tax");
		System.out.println("\n\t[2] Payable Tax");
		System.out.println("\n\t[3] IncomeTax");
		System.out.println("\n\t[4] Social Security  Contribution Levy (SSCL) Tax");
		System.out.println("\n\t[5] Leasing Payment Tax");
		System.out.println("\n\t[6] Exit Tax");
				}
	
 public static void WithHoldingTax(){
					Scanner scanner=new Scanner(System.in);
					 System.out.println("+----------------------------------------------------------------+");
				System.out.println("|                       WITHHOLDING TAX                          |");
				System.out.println("+----------------------------------------------------------------+");
				
				System.out.println("\n\n\t[1] Rent Tax");
				System.out.println("\n\t[2] Bank Interest Tax");
				System.out.println("\n\t[3] Dividend Tax");
				System.out.println("\n\t[4] Exit");
				
				System.out.print("\n\nEnter an option to continue -> ");
				int WithHoldingOption=scanner.nextInt();
				 clearConsole();        
				 switch (WithHoldingOption)
				 {
					 case 1:
					 rentTax();

						 break;
					case 2:
					 bankInterestTax();

						 break;
					case 3:
						 dividendTax();

						 break;
					case 4:
						 
						return;

					 default:
					 System.out.print("Wrong option ");
					System.out.print("Do you want to try again (Y/N)");
					char again=scanner.next().charAt(0);
					clearConsole();
					if(again=='Y' || again=='y') {
						WithHoldingTax();
						};
						 
				 }
				clearConsole();
				
					 }	
				
public static void rentTax(){
	Scanner scanner=new Scanner(System.in);
						  System.out.println("+----------------------------------------------------+");
						 System.out.println("|                       RENT TAX                     |");
						 System.out.println("+----------------------------------------------------+");
						 
						 System.out.print("\n   Enter your rent                   : ");
						 double rentTax=scanner.nextDouble();
						 if (rentTax>100000){
							 double PayRentTax=(rentTax-100000)*0.1;
							System.out.printf("%s%.2f","\n   You have to pay Rent Tax          :",PayRentTax);
							System.out.print("\n\n\nDo you want to caclulate another Rent Tax (Y/N) :  ");
							 
							 
						 }else if(rentTax<100000 && rentTax>0){
							 System.out.print("\n			You dont have to pay rent tax......");
							 System.out.print("\n\nDo you want to caclulate another Rent Tax (Y/N) :  ");
							 
							 
							 }else{
								 System.out.print("\n			Invaild input...");
								 System.out.print("\n\nDo you want to enter the correct value again(Y/N) :  ");
								 
							 }
							 char rentTaxOption=scanner.next().charAt(0);
							 clearConsole();
							 if (rentTaxOption=='Y' || rentTaxOption=='y') {
								 rentTax();
							 }
						 
						 
						 }	
									
public static void bankInterestTax(){
	Scanner scanner=new Scanner(System.in);
						System.out.println("+--------------------------------------------------------------------+");
						 System.out.println("|                       BANK INTEREST TAX                            |");
						 System.out.println("+--------------------------------------------------------------------+");
						 
						 System.out.print("\n   Enter your bank insterest per year               :  ");
						 double bankInterest=scanner.nextDouble();
						 System.out.printf("%s%.2f","\n   You have to pay Bank Interest Tax per year       : ",(bankInterest*0.05));
						 
						 System.out.print("\n\n\nDo you want to calculate another Bank Interest Tax(Y/N) : ");
						 char BankInterestOption=scanner.next().charAt(0);
						 clearConsole();
						 if (BankInterestOption=='y' ||BankInterestOption=='Y' )
						 {
							 bankInterestTax();
						 }
							}
											 				
 public static void dividendTax(){
	 Scanner scanner=new Scanner(System.in);
							 System.out.println("+--------------------------------------------------------------------+");
						 System.out.println("|                             DIVIDEND TAX                           |");
						 System.out.println("+--------------------------------------------------------------------+");
						 
						 System.out.print("\n   Enter your total dividend per year              :  ");
						 double dividendPerYear=scanner.nextDouble();
						
						
						 if (dividendPerYear>100000)
						 {
							  double afterDividendPerYear=(dividendPerYear-100000)*0.14;
							   System.out.printf("%s%.2f","\n   You have to pay Dividend Tax per year           : ",afterDividendPerYear);
						 }else {
							 System.out.print("\n			You dont have to pay Dividend Tax.......");
							 }
						
						 
						 System.out.print("\n\nDo you want to calculate another Dividend Tax(Y/N) : ");
						 char BankInterestOption=scanner.next().charAt(0);
						 clearConsole();
						 if(BankInterestOption=='y' ||BankInterestOption=='Y'){
							 dividendTax();
							 }
						 }
					
public static void payableTax(){
				Scanner scanner=new Scanner(System.in);
				 System.out.println("+----------------------------------------------------+");
				System.out.println("|                       PAYABLE TAX                  |");
				System.out.println("+----------------------------------------------------+");
				
				
				System.out.print("\n   Enter you employee payment per month :  ");
			double  monthSalary = scanner.nextDouble();
  
			double tax=0;
			double taxSalary=monthSalary;
			double math=0;


	if (monthSalary<=100000 ){
		tax=0;
	}else if(monthSalary>100000 && monthSalary <=141667){
		tax=0.06;
		taxSalary-=100000;
	}else if(monthSalary>141667 && monthSalary <=183333){
		math=(41667*0.06);
		tax=0.12;
		taxSalary-=141667;
	}else if(monthSalary>183333 && monthSalary <=225000){
		math=(41667*0.06)+(41667*0.12);
		tax=0.18;
		taxSalary-=183333;
	}else if(monthSalary>225000 && monthSalary <=266667){
		math=(41667*0.06)+(41667*0.12)+(41667*0.18);
		tax=0.24;
		taxSalary-=225000;
	}else if(monthSalary>266667 && monthSalary <=308333){
		math=(41667*0.06)+(41667*0.12)+(41667*0.18)+(41667*0.24);
		tax=0.30;
		taxSalary-=266667;
	}else if(monthSalary >308333 ){
		math=(41667*0.06)+(41667*0.12)+(41667*0.18)+(41667*0.24)+(41667*0.30);
		tax=0.36;
		taxSalary-=308333;
	}	

	if(tax!=0){
		double math1=(taxSalary*tax)+math;
		System.out.print("\n   You have to pay Payable Tax per month : "+Math.round(math1));
	}else{
		System.out.print("\n   You dont't have to pay Payable Tax..... ");
	}
	
				System.out.print("\n\n\nDo you want to calculate another Payable Tax : (Y/N) : ") ;
				char payableTaxOption=scanner.next().charAt(0);
				clearConsole();
				if (payableTaxOption=='Y' || payableTaxOption=='y')
				{
					payableTax();
				}
				
				}
			
public static void IncomeTax(){
				Scanner scanner=new Scanner(System.in);
				 System.out.println("+----------------------------------------------------+");
				System.out.println("|                       INCOME TAX                   |");
				System.out.println("+----------------------------------------------------+");
				
				
				System.out.print("\n   Enter your total income per year :  ");
        double  perYearSalary = scanner.nextDouble();
  
		double tax=0;
		double taxSalary=perYearSalary;
		double math=0;


	if (perYearSalary<=1200000 ){
		tax=0;
	}else if(perYearSalary>1200000 && perYearSalary <=1700000){
		tax=0.06;
		taxSalary-=1200000;
	}else if(perYearSalary>1700000 && perYearSalary <=2200000){
		math=(500000*0.06);
		tax=0.12;
		taxSalary-=1700000;
	}else if(perYearSalary>2200000 && perYearSalary <=2700000){
		math=(500000*0.06)+(500000*0.12);
		tax=0.18;
		taxSalary-=2200000;
	}else if(perYearSalary>2700000 && perYearSalary <=3200000){
		math=(500000*0.06)+(500000*0.12)+(500000*0.18);
		tax=0.24;
		taxSalary-=2700000;
	}else if(perYearSalary>3200000 && perYearSalary <=3700000){
		math=(500000*0.06)+(500000*0.12)+(500000*0.18)+(500000*0.24);
		tax=0.30;
		taxSalary-=3200000;
	}else if(perYearSalary >3700000 ){
		math=(500000*0.06)+(500000*0.12)+(500000*0.18)+(500000*0.24)+(500000*0.30);
		tax=0.36;
		taxSalary-=3700000;
	}	

	if(tax!=0){
		double math1=(taxSalary*tax)+math;
		System.out.print("\n   You have to pay Income Tax per Year : "+Math.round(math1));
	}else{
		System.out.print("\n   You dont't have to Income Tax..... ");
	}
	
	
				
				System.out.print("\n\n\nDo you want to calculate another Income tax : (Y/N) : ") ;
				char IncomeTaxOption=scanner.next().charAt(0);
				clearConsole();
				if (IncomeTaxOption=='Y' || IncomeTaxOption=='y')
				{
					IncomeTax();
				}
				}	
							 
public static void SSCLTax(){
	Scanner scanner=new Scanner(System.in);
				System.out.println("\n+---------------------------------------------------------------------------------------------+");
				System.out.println("|                       SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX                          |");
				System.out.println("+---------------------------------------------------------------------------------------------+");
					System.out.print("\n   Enter value of Good or service : ");
					double ValueOfGoods=scanner.nextDouble();
					double saleTaxAdded=ValueOfGoods*1.025;
					System.out.printf("%s%.2f","\n   You have to pay SSC Tax        : ",(saleTaxAdded*0.15+ValueOfGoods*0.025));
					
					
					
				System.out.print("\n\nDo you want to calculate another SSCL tax : (Y/N) : ") ;
				char SSClOption=scanner.next().charAt(0);
				clearConsole();
				if (SSClOption=='Y' || SSClOption=='y'){
					SSCLTax();
				}
				
				}

public static void CalculateLeasing(){
							Scanner scanner=new Scanner(System.in);
							System.out.println("+-------------------------------------------------------------------------+");
						System.out.println("|                       Calculate Leasing Payment                         |");
						System.out.println("+-------------------------------------------------------------------------+");
						
						CalculateLeasingLeaseAmount();

							
							}
							
public static void CalculateLeasingLeaseAmount(){
							Scanner scanner=new Scanner(System.in);
							System.out.print("\n   Enter leasing amount              : ");
						double CalculateLeaseAmount=scanner.nextDouble();
						if (CalculateLeaseAmount>0)
						{
						
						CalculateLeasingInterestRate(CalculateLeaseAmount);
						
						}else{
							
							System.out.print("\n   lease Amount is wrong.... Enter the correct value again...\n\n   ");
							 CalculateLeasingLeaseAmount();
							}
							
							}
							
public static void CalculateLeasingInterestRate(double CalculateLeaseAmount){
	Scanner scanner=new Scanner(System.in);
							System.out.print("\n   Enter annual interest rate        : ");
						double interestRate=scanner.nextDouble();
						if (interestRate>5)
						{
								
						CalculateLeasingNumberOfYear(CalculateLeaseAmount,interestRate);
					
						
						}else {
							System.out.print("\n   Wrong Interest Rate.. Enter the correct value again..\n\n. ");
							CalculateLeasingInterestRate(CalculateLeaseAmount);
							}
						}
												
public static void CalculateLeasingNumberOfYear(double lateLeaseAmount,double interestRate){
							Scanner scanner=new Scanner(System.in);
							System.out.print("\n   Enter number of year              : ");
						double NumberOfYear=scanner.nextDouble();
							if (NumberOfYear<=5 && NumberOfYear>0 )
						{
							
							double MonthlyInstallment=leasingMath(lateLeaseAmount, interestRate, NumberOfYear);
							
						System.out.printf("%s%.2f","\n   Your monthly instalment	     : ",MonthlyInstallment);

						
						System.out.print("\n\n\nDo you want to calculate another monthly instalment : (Y/N) : ") ;	
						char CalculateLeasing=scanner.next().charAt(0);
						clearConsole();
						if (CalculateLeasing=='Y' || CalculateLeasing=='y' ){
							
							 CalculateLeasing();
						}
						}else
						{
							System.out.print("\n			Invalid number of year...Enter  the correct value again... \n\n  ");
							CalculateLeasingNumberOfYear(lateLeaseAmount,interestRate);
							
						}
							}
	
public static void SearchLeasingOption(){
	Scanner scanner=new Scanner(System.in);
					System.out.println("+-------------------------------------------------------------------------+");
						System.out.println("|                       Search Leasing Category                           |");
						System.out.println("+-------------------------------------------------------------------------+");
						
						SearchLeasingOptionSearchLeasing();
						

					}	
		
public static void SearchLeasingOptionSearchLeasing(){
					Scanner scanner=new Scanner(System.in);
							System.out.print("\n   Enter lease amount             : ");
						double SearchLeasing=scanner.nextDouble();
						if (SearchLeasing>0 )
						{
							
							
							SearchLeasingInterestRate(SearchLeasing);
							
							 
						
						}else {
							System.out.print("\n			Wrong lease amount..Enter the correct value again...\n\n");
							SearchLeasingOptionSearchLeasing();
							
							}
							}		
		
public static void SearchLeasingInterestRate(double SearchLeasing){
								Scanner scanner=new Scanner(System.in);
								System.out.print("\n   Enter annual interest rate%    : ");
							double InterestRateSearch=scanner.nextDouble();
							if (InterestRateSearch>0)
							{
								
								 System.out.printf("%s%.2f%s","\n   Your monthly instalment for 3 year leasing plan - ",leasingMath(SearchLeasing,InterestRateSearch,3),"\n");
								 System.out.printf("%s%.2f%s","   Your monthly instalment for 3 year leasing plan - ",leasingMath(SearchLeasing,InterestRateSearch,4),"\n");
								 System.out.printf("%s%.2f%s","   Your monthly instalment for 3 year leasing plan - ",leasingMath(SearchLeasing,InterestRateSearch,5),"\n");
								
									
							System.out.print("\nDo you want to search another Leasing Category : (Y/N):  ") ;
						char SearchLeasingOption=scanner.next().charAt(0);
						clearConsole();
						if (SearchLeasingOption=='Y' || SearchLeasingOption=='y'){
							SearchLeasingOption();
						}
						
						}else{
								System.out.print("\n			Wrong Interest Rate... Enter the correct value again...\n\n");
								SearchLeasingInterestRate(SearchLeasing);
							}
								}
	
public static void  LeasingPayment(){
	Scanner scanner=new Scanner(System.in);
						System.out.println("+-----------------------------------------------------------+");
				System.out.println("|                       Leasing Payment                     |");
				System.out.println("+-----------------------------------------------------------+");
				
				System.out.println("\n   [1] Calculate Monthly Installment ");
				System.out.println("\n   [2] Search Leasing Category ");
				System.out.println("\n   [3] Find Leasing Amount ");
				System.out.println("\n   [4] Exit ");
				
				System.out.print("\n\nEnter an option to continue -> ");
				int LeasingPaymentOption=scanner.nextInt();
				 clearConsole();
				switch ( LeasingPaymentOption  )
				{
					case 1:{
						 CalculateLeasing();
						break;
					}
					case 2:{
					SearchLeasingOption();
						break;
					}
					case 3:{
						
						 FindLeasingAmount();
					
						break;
					}
					case 4:
						
						break;
						
					default:
						System.out.print("\n\nWrong option \n");
						System.out.print("\n\nDo you want to try again Leasing Payment  (Y/N)  :  ");
						char again2=scanner.next().charAt(0);
						clearConsole();
						if (again2=='Y' ||  again2=='y')
						{
							LeasingPayment();
						}
						
				}
						}	
								
public static void FindLeasingAmount(){
							Scanner scanner=new Scanner(System.in);
						System.out.println("+-------------------------------------------------------------------------+");
						System.out.println("|                          Find Leasing Amount                            |");
						System.out.println("+-------------------------------------------------------------------------+");
						
						System.out.print("\n\n   Enter the monthly lease payment amount you can afford : ");
						double afford=scanner.nextDouble();
						
						FindLeasingAmountfindYear(afford);
						
						
						System.out.print("\n\n\nDo you want to calculate another monthly instalment (Y/N) : ") ;
						char FindLeasing=scanner.next().charAt(0);
						clearConsole();
						if (FindLeasing=='Y' || FindLeasing=='y' )
						{
							FindLeasingAmount();
						}
							}							
								
public static void FindLeasingAmountfindYear(double afford){
	Scanner scanner=new Scanner(System.in);
						System.out.print("\n   Enter number of year		        		 : ");
						double findYear=scanner.nextDouble();
							if (findYear<=5 && findYear>0)
						{
							FindLeasingAmountfindRate(afford,findYear);
						
							
							
						}else{
							System.out.print("\nWrong year.. Enter the correct year again...\n\n ");
							FindLeasingAmountfindYear(afford);
							}
							}
							
	public static void FindLeasingAmountfindRate(double afford,double findYear){
		Scanner scanner=new Scanner(System.in);
								System.out.print("\n   Enter annual interest rate 			  	  : ");
							double findRate=scanner.nextDouble();
							if (findRate>0)
							{
								double i2=findRate/1200.0;
								double month2=findYear*12;
								double math4=Math.pow((1+i2),month2);
								double amounthFind=afford*(1-(1/math4));
								System.out.printf("%s%.2f%s","\n   You can get Lease Amount    				: ",(amounthFind/i2),"\n");
							}else {
								System.out.print("\n			Wrong Interest Rate... Enter the correct value again...\n\n");
								FindLeasingAmountfindRate(afford,findYear);
								}
								}																
}







