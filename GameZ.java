// ----- MARK ANTHONY S. GOROY ------------//

import java.util.Scanner;

public class GameZ
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        Board play = new Board();
		play.initializeBoard();
    	System.out.println("Tic-Tac-Toe!");

		do
        {
            System.out.println("Current board layout:");
            play.printBoard();
            int row;
            int col;
            

            do
            {
                System.out.println("Player " + play.getCurrentPlayerMark() + ", enter Row and Column:");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
            }
            while (!play.placeMark(row, col));
            play.changePlayer();
        }

        
        while(!play.checkForWin() && !play.isBoardFull());
        if (play.isBoardFull() && !play.checkForWin())
        {
            System.out.println("The game was a tie!");
        }
        else
        {
            System.out.println("Current board layout:");
            play.printBoard();
            play.changePlayer();
            System.out.println(Character.toUpperCase(play.getCurrentPlayerMark()) + " Wins!");
        }
    }
}






 
