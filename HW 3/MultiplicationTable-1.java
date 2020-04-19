/*
* Madeleine Godette
* Section: 11053
* Assignment:  HW #3
* Due: March 1,2019
*/

/**
 * This code generates a multiplication table in a grid format,
 * the default size is 5x5 but any size can be created.
 * 
 * @author Madeleine Godette
 * @version 1.0
 * 
 */
public class MultiplicationTable {
  private int columns; //The value of the columns to be multiplied
  private int rows;   // The value of the rows to be multiplied
  
  /**
   * Default constructor
   * this initializes both values to 5 so create a 5x5 table
   */
  public MultiplicationTable() {
      
    // initialization of the variables
    columns = 5;
    rows = 5;
  }
  
  /**
   * Initialization constructor
   * @param columns holds the determined value of the columns
   * @param rows holds the user determined value of the rows
   * 
   * these two parameters are being passed to this method as to 
   * determine what numbers will be multiplied in order to create the table
   */
  public MultiplicationTable( int columns, int rows ) {  
    this.columns = columns;
    this.rows = rows;
  }
  
  /**
   * Both methods getColumns and getRows return int values that will be used
   * to create the table
   * 
   * @return columns, return the int value specfied
   * @return rows, return the int value specified
   */
  public int getColumns() {
    return columns;
  }
  public int getRows() {
    return rows;
  }
  
  /** 
   * This method is used to determine the spacing of numbers once it exceeds the 
   * single digit format 
   * 
   * for example:
   * 1x1 table returns a size 1
   * 10x10 table returns a size 2
   * 100x100 table returns a size 3
   * 
   * @param cellValue is the value held at a given point within the table(the max value) 
   * 
   * @return size determines the spacing of numbers
   */
  public int cellSize( int cellValue ) {
     int size = 0;

     while ( cellValue > 0 ) {
         cellValue = cellValue / 10;
         size++;
        }

     return size; //determines size for each cell value
  }
  
  /**
   * Method to print the multiplication table of the given row and column size
   * 
   * 
   * @return cellCount refers to the current cells filled
   */
  public int printTable() {

      int cellSpacing, cellValue, col, entry, row, space; //variables used within this method
      int maxCellValue = columns * rows; //determines largest value
      int maxCellSpacing = cellSize( maxCellValue ); //determines spacing of current table
      int cellCount = 0; //initializes to 0 

      for ( row = 1; row <= rows; row++ ) { //outer loop determines the rows
          for ( col = 1; col <= columns; col++ ) { // inner loop determines the columns

              cellValue = col * row; //determines value within current cell
              cellSpacing = maxCellSpacing - cellSize( cellValue ); //determines spacing for current cell
              //determines spacing for current cell

            for ( space = 0; space < cellSpacing; space++ ) { 
                System.out.print( " " ); //prints extra space between certian numbers to ensure clean look
            }
        
            System.out.print( cellValue + " " ); //prints space between numbers
            cellCount++;
      }
      System.out.println();//creates breakline for each of the rows
    }

     return cellCount; //counts the cells filled
  }

}
