// GuessGame class has three instance variable for the three Player objects
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
// Crate Player Objects assign them to three Player instance variable 	
	public void startGame(){
	p1 = new Player();
	p2 = new Player();
	p3 = new Player();
// Declare three variables to hold the three guesses the player makes	
	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0;
	// Declare three variables to hold player answers	true or false based on their answer
boolean p1isRight = false;
boolean p2isRight = false;
boolean p3isRight = false;
// Makes Target number players has to guess
int targetnumber = (int)(Math.random() * 10);
System.out.println("I'm Thinking of a number between 0 and 9");

while(true){
	System.out.println("Number to guess is " + targetnumber);
	p1.guess();
	p2.guess();
	p3.guess();
	// each player guess the result of their guess method running by accessing the number variable of each player,
	//the number variable is located in the Player Class.
	guessp1 = p1.number;
	System.out.println("PLayer one guessed " + guessp1);
	guessp2 = p2.number;
	System.out.println("PLayer two guessed " + guessp2);
	guessp3 = p3.number;
	System.out.println("PLayer three guessed " + guessp3);
	//Checks each player Guess to see if it matches the targetNumber, if a player is right then set that player variable to be true
	//Which was false at first 
	if(guessp1 == targetnumber){
		p1isRight = true;
	}if(guessp2 == targetnumber){
		p2isRight = true;
	}if(guessp3 == targetnumber){
		p3isRight = true;
	}
	
	if(p1isRight || p2isRight || p3isRight){
		
		System.out.println("We have a winner");
		System.out.println("Player one got it right?" + p1isRight);
		System.out.println("Player two got it right?" + p2isRight);
		System.out.println("Player three got it right?" + p3isRight);
		System.out.println("Game is over.");
		break;
	} else{
		System.out.println("Players will have to try again.");
	}
	}
	
}
	}


