package javawork4;

public class book_7_24{
	public static void main(String[] args){
		boolean[] huase = new boolean[4]; 
		boolean flag = false;
		int count = 0;
		while(flag == false){		
			if(huase[0]&&huase[1]&&huase[2]&&huase[3]) 
				break;
			else{
				switch(choosePai(huase)){
					case "Spades":
						huase[0] = true;
						break;
					case "Hearts":
						huase[1] = true;
						break;
					case "Diammonds":
						huase[2] = true;
						break;
					case "Clubs":
						huase[3] = true;
						break;
				}
			}
			count++;
		}
		System.out.println("Number of picks:"+count); 
	}
	
	public static String choosePai(boolean[] huase){
		int[] deck = new int[52];	
		String[] Huases = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		for(int i = 0;i < deck.length;i++){
			deck[i] = i;
		} 
		
		for(int i = 0;i < deck.length;i++){
			int Index = (int)(Math.random()*deck.length);
			int temp = deck[i];
			deck[i] = deck[Index];
			deck[Index] = temp;
		}
		
		int i = (int)(Math.random()*deck.length);
		String Huase = Huases[deck[i] / 13];
		String rank = ranks[deck[i]%13];
		switch(Huase){
		case "Spades":  
            if(!huase[0])  
                {System.out.println(rank+" of "+Huase);huase[0] = true;}  
            break;  
        case "Hearts":  
            if(!huase[1])  
                {System.out.println(rank+" of "+Huase);huase[1] = true;}  
            break;  
        case "Diamonds":  
            if(!huase[2])  
                {System.out.println(rank+" of "+Huase);huase[2] = true;}  
            break;  
        case "Clubs":  
            if(!huase[3])  
                {System.out.println(rank+" of "+Huase);huase[3] = true;}  
            break;  
        } 
		return Huase;
	}
}
