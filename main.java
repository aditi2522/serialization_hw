import java.util.*;
class main{
	public static void main(String args[]){
    	double principle, rate, time, sim,com;
    	Scanner sc=new Scanner (System. in);
    	System.out.println("Enter the amount:");
    	principle=sc.nextDouble();
    	System. out. println("Enter the No.of years:");
    	time=sc.nextDouble();
    	System. out. println("Enter the Rate of  interest");
    	rate=sc.nextDouble();
	SIandCI obj=new SIandCI();
	double si_int=obj.simpleInterest(principle,time,rate);
	double ci_int=obj.compoundInterest(principle,time,rate);
	System.out.println("Simple interest is "+si_int);
	System.out.println("Compound interest is "+ci_int);
	
}
}