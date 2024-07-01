package Project;

import java.util.Scanner;

//Guesser class guess the number from user and Return
class Guesser{
    int guesserNum;

    int takeGuesserNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guesser Guess a Number");
        guesserNum=sc.nextInt();

        return guesserNum;
    }

}

//Player class guess the number from user and Return
class Player{
    int player1Num;
    int player2Num;
    int player3Num;

    Scanner sc=new Scanner(System.in);  //Use for get input from user
    int takePlayer1Num()
    {
        System.out.println("Player-1 Guess a Number");
        player1Num=sc.nextInt();

        return player1Num;
    }

    int takePlayer2Num()
    {
        System.out.println("Player-2 Guess a Number");
        player2Num=sc.nextInt();

        return player2Num;
    }

    int takePlayer3Num()
    {
        System.out.println("Player-3 Guess a Number");
        player3Num=sc.nextInt();

        return player3Num;
    }

}

//Umpire class get the number from Guesser and Player and check same number
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    //Collect number from Guesser
    void collectFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.takeGuesserNum();
    }

    //Collect number from Player
    void collectFromPlayer()
    {
        Player p1=new Player();
        numFromPlayer1=p1.takePlayer1Num();
        numFromPlayer2=p1.takePlayer2Num();
        numFromPlayer3=p1.takePlayer3Num();

    }

    //Compare the number and check same number guess the player or not
    void compare(){
        if(numFromGuesser==numFromPlayer1)  //if guesser number and player-1 number is same then enter in block
        {
            if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser)    //if guesser number and player-2  and player-3 number is same then enter in block
            {
                System.out.println("All Player Won the Game..!");
            }
            else if (numFromPlayer2==numFromGuesser)    //if guesser number and player-2 number is same then enter in block
            {
                System.out.println("Player-1 and Player-2 Won the Game..!");
            }
            else if (numFromPlayer3==numFromGuesser)    //if guesser number and player-3 number is same then enter in block
            {
                System.out.println("Player-1 and Player-3 Won the Game..!");
            }
            else {                                       //if guesser number and player-1 number is same then enter in block
                System.out.println("Player-1 Won the Game..!");
            }
        }

        else if (numFromPlayer2==numFromGuesser)    //if guesser number and player-2 number is same then enter in block
        {
            if(numFromPlayer3==numFromGuesser)  //if guesser number and player-3 number is same then enter in block
            {
                System.out.println("Player-2 and Player-3 Won the Game..!\"");
            }
            else{                               //if guesser number and player-2 number is same then enter in block
                System.out.println("Player-2 Won the Game..!\"");
            }
        }

        else if (numFromPlayer3==numFromGuesser)   //if guesser number and player-3 number is same then enter in block
        {
            System.out.println("Player-3 Won the Game..!");
        }

        else{                                       //if guesser number are not same player-1 player-2 player-3 number then enter in block
            System.out.println("No Player Won the Game try again..");
        }
    }
}

public class GuesserGameProject {
    public static void main(String[] args)
    {
        Umpire u=new Umpire();
        u.collectFromGuesser();
        u.collectFromPlayer();
        u.compare();

    }
}
