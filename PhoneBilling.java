//importing time stamp

import java.time.Clock;
import java.util.Scanner;
class PhoneBilling{
    static double Amount =0.0;
    static String company;
    static int  Time, Duration;
    static double  VAT,totalcharge;

    //creating a  constructor
    static void InputValues(){
        Scanner SIMcompany =new Scanner(System.in);
         System.out.println("Enter network Company for the call receiver");
         company =SIMcompany.nextLine();
         Scanner TimeofCall = new Scanner(System.in);
         System.out.println("Enter Time of call");
         Time=TimeofCall.nextInt();
         Scanner callDuration =new Scanner(System.in);
         System.out.println("Enter call Duration");
         Duration =callDuration.nextInt();

    }

    //Computing Call Charge

    static void ComputeCharges (){
     //Charges for calls made to another network
    if (company =="Safaricom"){
        Amount =5* Duration;
        if(Duration >2){
            VAT =0.16*Amount;
        }
        totalcharge=Amount+VAT;
    }

   else if(Time >= 0600 && Time <=1800){
        Amount =4* Duration;
        if(Duration >2){
            VAT =0.16 * Amount;
        }   
        totalcharge =Amount+VAT;
       }
    else if (Time >=1800 && Time <=0600){
        Amount = 3*Duration;
        if(Duration>2){
            VAT =0.16* Amount;
        }
        totalcharge=Amount+VAT;
        }
      }
   
      

    public static void main(String args[]){
        InputValues();
        ComputeCharges();
        System.out.println("Total call expenses are  ksh. " +   totalcharge); 


      }
}


        
    
    
 
  


