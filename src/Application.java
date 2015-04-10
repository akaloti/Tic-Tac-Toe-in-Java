/**
 * @(#)Application.java
 *
 * TicTacToe application
 *
 * @author Aaron Singh
 * @version 1.00 2014/12/30
 */
 
import java.util.Scanner;

 
public class Application 
{
  // *******************  Static constants  *******************
  
  private static final char markX = 'x';
  private static final char markO = 'o';
  private static final char markBlank = ' ';
  
  // game board row coordinates
  private static final int rowA = 0;
  private static final int rowB = 1;
  private static final int rowC = 2;
  
  // game board column coordinates
  private static final int column1 = 0;
  private static final int column2 = 1;
  private static final int column3 = 2;
  
  // ******************  Instance variables  ******************
  
  private char mCurrentTurn;
  private Scanner mScanner; // for input
  
  private Square[][] mBoard;
  
  // *********************  Constructors  *********************
  
  public Application()
  {
    mCurrentTurn = x;
    mScanner = new Scanner(System.in);
    
    mBoard = new Square[3][3];
    for (Square[] row : mBoard)
      for (Square square : row)
        square.setMark(blank);
  }
  
  // ********************  Public methods  ********************
  
  public void run()
  {
    doTurn();
    doTurn();
    doTurn();
  }
  
  // ********************  Private methods ********************
  
  private void displayBoard()
  {
    String row1 = "   " + mBoard[a][0].getMark() + "| " + 
      mBoard[a][1].getMark() + "| " + mBoard[a][2].getMark();
    String row2 = "   " + mBoard[b][0].getMark() + "| " + 
      mBoard[b][1].getMark() + "| " + mBoard[b][2].getMark();
    String row3 = "   " + mBoard[c][0].getMark() + "| " + 
      mBoard[c][1].getMark() + "| " + mBoard[c][2].getMark();
    
    System.out.println(row1);
    System.out.println("a __|__|__");
    System.out.println(row2);
    System.out.println("b __|__|__");
    System.out.println(row3);
    System.out.println("c   |  |  ");
    System.out.println("  1  2  3 ");
  }
  
  private void doTurn()
  {
    displayBoard();
    updateBoard(getInput());
    switchTurn();
  }
  
  private String getInput()
  {
    // Show prompt
    System.out.println("Current turn: " + mCurrentTurn);
    System.out.println("Enter the address of the square in which you");
    System.out.println("would like your shape (ex: b2).");
    
    // Asks for input until given valid input
    String input = mScanner.nextLine();
    if (badInput(input))
      input = mScanner.nextLine();
    
    return input;
  }
  
  private boolean badInput(String square)
  {
    return false;
  }
  
  // Uses the parameter to find the appropriate square
  private Square getCorrespondingSquare(String name)
  {
    if (a1.getName().equals(name))
      return a1;
    else if (a2.getName().equals(name))
      return a2;
    else if (a3.getName().equals(name))
      return a3;
    else if (b1.getName().equals(name))
      return b1;
    else if (b2.getName().equals(name))
      return b2;
    else if (b3.getName().equals(name))
      return b3;
    else if (c1.getName().equals(name))
      return c1;
    else if (c2.getName().equals(name))
      return c2;
    else if (c3.getName().equals(name))
      return c3;
    else
      throw new AssertionError(
        "getCorrespondingSquare() called with invalid argument: " + name);
  }
  
  // Uses parameter name to find the coordinates of the corresponding square
  private Coordinates getCoordinates(String name)
  {
    int row = 0;
    int column = 0;
    
    if (name.equals("a1"))
    {
      row = rowA;
      column = column1;
    }
    else if (name.equals("a2"))
    {
      row = rowA;
      column = column2;
    }
    else if (name.equals("a3"))
    {
      row = rowA;
      column = column3;
    }
    else if (name.equals("b1"))
    {
      row = rowB;
      column = column1;
    }
    else if (name.equals("b2"))
    {
      row = rowB;
      column = column2;
    }
    else if (name.equals("b3"))
    {
      row = rowB;
      column = column3;
    }
    else if (name.equals("c1"))
    {
      row = rowC;
      column = column1;
    }
    else if (name.equals("c2"))
    {
      row = rowC;
      column = column2;
    }
    else if (name.equals("c3"))
    {
      row = rowC;
      column = column3;
    }
    else
      throw new AssertionError(
        "getCoordinates() called with invalid argument: " + name);
    
    return new Coordinates(row, column);
  }
  
  // Uses parameter name to find the correct square in the matrix
  private Square getCorrespondingSquare(Square[][] squares, String name)
  {
    
  }
  
  // Changes the approriate square's mark to match the active player's mark
  private void updateBoard(String square)
  {
    getCorrespondingSquare(square).setMark(mCurrentTurn);
  }
  
  private void switchTurn()
  {
    if (mCurrentTurn == x)
      mCurrentTurn = o;
    else if (mCurrentTurn == o)
      mCurrentTurn = x;
    else
      throw new AssertionError(
        "mCurrentTurn should be 'x' or 'o', but is: " + mCurrentTurn);
  }
  
}
