import java.util.*;

class Example {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        
    
        System.out.println("-------------------------------------------------------------------------"); 
		System.out.println("|                       SALARY INFORMATION SYSTEM                       |");
		System.out.println("-------------------------------------------------------------------------\n\n"); 

        System.out.println("        [1] Calculate Income Tax ");
        System.out.println("        [2] Calculate Annual bonus ");
        System.out.println("        [3] Calculate Loan amount \n\n");
	
        
		System.out.print("Enter an option to continue > ");
        int option = input.nextInt();
        System.out.println("\n\n");
        
        switch( option){  // input name ekai salary ekai eka thanaka witharak thiyena one nisa wenas karaddi eka thanai ne wenas karanna one
			case 1: {
			System.out.println("-------------------------------------------------------------------------"); 
			System.out.println("|                       Calulate Income Tax                             |");
			System.out.println("-------------------------------------------------------------------------\n\n"); 
			break;
		} case 2:{
			System.out.println("-------------------------------------------------------------------------"); 
			System.out.println("|                       Calulate Annual Bonus                             |");
			System.out.println("-------------------------------------------------------------------------\n\n"); 
			break;
		}case 3:{
			System.out.println("-------------------------------------------------------------------------"); 
			System.out.println("|                       Calculate Loan Amout                              |");
			System.out.println("-------------------------------------------------------------------------\n\n"); 
			break;
		}
		
      }  
			       
			       
	
        
        if (option==1 || option==2 || option==3){ //naththam wrong option ekeadi run weno 
			
				                   
        System.out.print("Input Employee name   - ");
        String employeeName = input.next();
        
        System.out.print("Input Employee salary - ");
        double salary = input.nextDouble();
        
        if(salary>=0){
        
        switch (option){
			case 1:{
        
		double tax=0;
		double taxSalary=salary;
		double math=0;


	if (salary<=100000 ){
		tax=0;
	}else if(salary>100000 && salary <=141667){
		tax=0.06;
		taxSalary-=100000;
	}else if(salary>141667 && salary <=183333){
		math=(41667*0.06);
		tax=0.12;
		taxSalary-=141667;
	}else if(salary>183333 && salary <=225000){
		math=(41667*0.06)+(41667*0.12);
		tax=0.18;
		taxSalary-=183333;
	}else if(salary>225000 && salary <=266667){
		math=(41667*0.06)+(41667*0.12)+(41667*0.18);
		tax=0.24;
		taxSalary-=225000;
	}else if(salary>266667 && salary <=308333){
		math=(41667*0.06)+(41667*0.12)+(41667*0.18)+(41667*0.24);
		tax=0.30;
		taxSalary-=266667;
	}else if(salary >308333 ){
		math=(41667*0.06)+(41667*0.12)+(41667*0.18)+(41667*0.24)+(41667*0.30);
		tax=0.36;
		taxSalary-=308333;
	}	

	if(tax!=0){
		double math1=(taxSalary*tax)+math;
		System.out.print("You have to pay Income Tax per month : "+Math.round(math1));
	}else{
		System.out.print("you are tax free : "+salary);
	}
	
	break;	
	
		}case 2:{
	
	double annualBonus=5000;

	if (salary<100000){
		annualBonus=5000;
	}else if(salary>=100000 && salary<200000){
		annualBonus=0.10;
	}else if(salary>=200000 && salary<300000){
		annualBonus=0.15;
	}else if(salary>=300000 && salary<400000){
		annualBonus=0.20;
	}else if(salary>=400000){
		annualBonus=0.35;
	}else{
		System.out.print("Invalid salary");
	}

	if(annualBonus!=5000){
		System.out.print("Annual bonus   - "+salary*annualBonus);
	}

        break;
		} case 3:{
			
		System.out.print("Enter number of year : ");
		int year=input.nextInt();
		
		double r=0.15;
		int n=year*12;  //12 gunaka thamai danna puluwan year double karana ba masa 12k thiyana nisa 
		double monthlyInstallment=salary*0.6;
		
		if(salary >50000 && year<=5 && year >0){
			 double loanAmountPreRound=monthlyInstallment * (1-(1/(Math.pow((1+r/12),n))))/(r/12);
			 double loanAmountAfterRound= Math.round(loanAmountPreRound / 1000.0) * 1000;
			 System.out.println("You can get loan Amount : "+loanAmountAfterRound);
		 }else if(salary >50000){
			 System.out.print("year number is wrong")
		 }else {
			 System.out.print("You can not get a loan beacuse your salary lessthan Rs.50 000");
		 }		
		}//case 3 eke 
	
	
	
	} // switch eke      
	    
	}else{
		System.out.print("Wrong salary");
	}
	}else{
		System.out.println("Wrong option");
	}
 
 
 
 
    }
}






