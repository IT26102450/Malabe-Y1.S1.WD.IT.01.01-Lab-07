import java.util.Scanner;
	public class IT26102450Lab7Q3{
		public static void main(String[] args){
			
			final double discountrate = 0.05;
			final int numberofcustomers = 5;
			double discount =0;
			double totalAmountBeforeDiscount , totalAmountAfterDiscount;
			char modeOfPayement;
			
			Scanner input = new Scanner(System.in);
			
			for(int customercount =1;customercount<=numberofcustomers;customercount++){
				System.out.println("customer "+customercount);
				
				System.out.println("Enter total bill amount:" );
				totalAmountBeforeDiscount = input.nextDouble();
				
				System.out.println("Enter mode of payement (C for cash, O for other):" );
				modeOfPayement = input.next().toUpperCase().charAt(0);
				
				if(modeOfPayement == 'C'){
					
					discount = totalAmountBeforeDiscount*discountrate;
					System.out.println("Discount is : "+discount);
					
					totalAmountAfterDiscount = totalAmountBeforeDiscount-discount;
					System.out.println("Amount to be paid: "+totalAmountAfterDiscount);
				}	
				else if(modeOfPayement == 'O'){
					System.out.println("No discount applicable");
					System.out.println("Amount to be paid: "+totalAmountBeforeDiscount);
				}
				else{
					System.out.println("Payement Mode is Not Valid");
					System.out.println("");
						
				}	
			}		
		}			
	}				
					
					
				
					
			