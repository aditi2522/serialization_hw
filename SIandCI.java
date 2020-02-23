public class SIandCI{
	public static double simpleInterest(double principle,double time,double rate){
		return (principle*time*rate)/100;
}
	public static double compoundInterest(double principle,double time,double rate){
		return pr * Math.pow(1.0+rate/100.0,time) - principle;
}
}
