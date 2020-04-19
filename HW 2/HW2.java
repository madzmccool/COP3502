/*
 * Madeleine Godette
 * Section: 11053
 * Assignment:  HW #2
 * Due: Feb 11, 2019
*/

public class HW2
{
    // private variables 
        private char logicSelection;
        private int total;
    
    // default Constructor for objects of class HW2
    public HW2()
    {
        logicSelection = 'a';
        total = 0;
    }
    
    //initialize constructor
    public HW2(char logicSelection, int total){
        this.logicSelection = logicSelection;
        this.total = total;
    }
    
    //get and set methods for all private values
    public char getLogicSelection(){
        return logicSelection;
    }
    
    public void setLogicSelection(char logicSelection){
        this.logicSelection = logicSelection;
    }
    
    public int getTotal(){
        return total;
    }
    
    public void setTotal(int total){
        this.total = total;
    }
    
    //toString method
    public String toString(){
        String s = "Opperation Information..." + "\n" + "Logic Selection = " + logicSelection + "\n" +"Total Operations = " + total +"\n";
        return s;
    }
    
    //printInfo method
    public void printInfo(){
        System.out.println(toString());
    }
    
    //print menu method
    public void printMenu(){
        System.out.println("Logic Selections:");
        System.out.println("(a) Logical AND (&&)");
        System.out.println("(b) Logical OR (||)"+"\n");
        
        System.out.println("Methods:");
        System.out.println("Make Logic Selectio");
        System.out.println("Modulo Range");
        System.out.println("Perform Logic");
        System.out.println("Print Truth Table" + "\n");
    }
    
    //logic selection w/ error message
    public void makeLogicSelection(char logicSelection){
        System.out.println("Operation #1"+"\n");
        if(logicSelection =='a'|| logicSelection =='A'){
            logicSelection = 'a';
        }
        else if(logicSelection == 'b'|| logicSelection == 'B'){
            logicSelection = 'b';
        }
        else{
            System.out.println("ERROR: INVALID SELECTION");
        }
        total+=1;//counter
       
    }
    
    
    //preform logic comparing operands
    public void preformLogic(boolean operand1, boolean operand2, boolean negation){
        System.out.println("Operation #2" +"\n");
        //prints curent data within method
        System.out.println("Logic Selection:  " + logicSelection);
        System.out.println("Operand #1:       "+ operand1);
        System.out.println("Operand #2:       " + operand2);
        System.out.println("Negation:         " + negation + "\n");
        
        if(negation == true){ //prints negation if present
            System.out.print("!");
        }
        //logical and results
        if(logicSelection =='a'&& (operand1==true && operand2 ==true)){ 
            System.out.println("(" + operand1 +"&&" + operand2 + ")  yealds true");
        }
        else if(logicSelection =='a'){
            System.out.println("(" + operand1 +"&&" + operand2 + ")  yealds false");
        }
        //logical or results
        if(logicSelection == 'b'&& (operand1 ==false && operand2 ==false)){
            System.out.println("(" + operand1 +"||" + operand2 + ")  yealds false");
        }
        else if(logicSelection =='b'){
            System.out.println("(" + operand1 +"||" + operand2 + ")  yealds true");
        }
        
        total+=1; //counter
    }
    
    // logical truth tables && and ||
    public void printTruthTable(char logicSelection){
        System.out.println("Operation #3"+"\n");
        if(logicSelection =='a'){
        
            System.out.println("A   B   (A && B)");
            System.out.println("----------------");
            System.out.println("T   T      T");
            System.out.println("T   F      F");
            System.out.println("F   T      F");
            System.out.println("F   F      F" + "/n");
        }
        else if(logicSelection == 'b'){
            System.out.println("A   B   (A || B)");
            System.out.println("----------------");
            System.out.println("T   T      T");
            System.out.println("T   F      T");
            System.out.println("F   T      T");
            System.out.println("F   F      F"+ "\n");
        }
        total+= 1;//counter
        }
     
    // range calculation
    public void moduloRange(int modValue){
        System.out.println("Operation #4");
        
        System.out.println("Mod Value:       " + modValue );
        System.out.println("Start of Range:  " + 0);
        System.out.println("End of Range:    " + (modValue - 1) + "\n");
        
        total +=1;
    }
}
