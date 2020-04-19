/*
 * Madeleine Godette
 * Section: 11053
 * Assignment:  HW #4
 * Due: March 3,2019
 */

public class HW4
{
    public static void main(String args[]){
        
        boolean testFail = false; 
        //matching table dimensions
        // default
        MultiplicationTable defaultTest = new MultiplicationTable();
       
        System.out.println("default table test:");
        defaultTest.printTable();
        System.out.println();
        
        //if-else statements for analysis
        if(defaultTest.getColumns() == 5 && defaultTest.getRows() == 5){
            System.out.println("Test passed! :)" + "\n");
        }else{
            System.out.println("Test failed :(" + "\n");
            testFail = true;
        }
        
        //square table
        MultiplicationTable squareTest = new MultiplicationTable(4,4);
        
        System.out.println("4x4 square table test:");
        squareTest.printTable();
        System.out.println();
        
        if(squareTest.getColumns() == 4 && squareTest.getRows() == 4){
            System.out.println("Test passed! :)" + "\n");
        }else{
            System.out.println("Test failed :(" + "\n");
            testFail = true;
        }
        
        //rectangle with columns>rows
        MultiplicationTable rectangleTest = new MultiplicationTable(8,4);
        
        System.out.println("4x8 rectangle table test:");
        rectangleTest.printTable();
        System.out.println();
        
        if(rectangleTest.getColumns() == 8 && rectangleTest.getRows() == 4){
            System.out.println("Test passed! :)" + "\n");
        }else{
            System.out.println("Test failed :(" + "\n");
            testFail = true;
        }
    }
}
