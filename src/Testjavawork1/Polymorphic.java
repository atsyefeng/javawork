package Testjavawork1;

public class Polymorphic {
	public static void main(String[] args) {
	      show(new apple());  // 以 apple 对象调用 show 方法
	      show(new lemon());  // 以 lemon 对象调用 show 方法
	                
	      fruit a = new apple();  // 向上转型  
	      a.tastes();              
	      apple c = (apple)a;        // 向下转型  
	      c.color();        
	  }  
	            
	    public static void show(fruit a)  {
	      a.tastes();  
	        // 类型判断
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
