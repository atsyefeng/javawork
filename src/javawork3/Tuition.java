package javawork3;

public class Tuition {
    public static void main(String[] args) {
    	double rate = 0.05;
    	double tuition10 = 10000 * Math.pow((1 + rate),10);
    	System.out.println("The tuition in 10 years is $" + tuition10);
    	
    	double tuition10_4 = tuition10;
    	for(int i=1 ; i<=4 ;i++) {
    		tuition10_4 += tuition10_4*(1+rate);
    	}
    	System.out.println("In 10 years'time, four years'time, the total tuition is $" + tuition10_4);
    		
    }
}
