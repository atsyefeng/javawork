package Testjavawork1;

public class Polymorphic {
	public static void main(String[] args) {
	      show(new apple());  // �� apple ������� show ����
	      show(new lemon());  // �� lemon ������� show ����
	                
	      fruit a = new apple();  // ����ת��  
	      a.tastes();              
	      apple c = (apple)a;        // ����ת��  
	      c.color();        
	  }  
	            
	    public static void show(fruit a)  {
	      a.tastes();  
	        // �����ж�
	        if (a instanceof apple)  {  
	            apple c = (apple)a;  
	            c.color();  
	        } else if (a instanceof lemon) { 
	            lemon c = (lemon)a;  
	            c.color();  
	        }  
	    }  
	}
	 
	abstract class fruit {  
	    abstract void tastes();  
	    abstract void color();
	}  
	  
	class apple extends fruit {  
	    public void tastes() {  
	        System.out.println("sweet");  
	    }  
	    public void color() {  
	        System.out.println("red");  
	    }  
	}  
	  
	class lemon extends fruit {  
	    public void tastes() {  
	        System.out.println("ACID");  
	    }  
	    public void color() {  
	        System.out.println("yellow");  
	    }  
	}
