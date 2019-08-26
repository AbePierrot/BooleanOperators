import java.util.Scanner;

public class BooleanOperatorsTutorial{
public static void main(String[] args) {
    BooleanOperatorsTutorial tutorial = new BooleanOperatorsTutorial();
    Scanner userInput = new Scanner (System.in);
    
   //[and boolen operator implementation]

    //prompt user for the first number
     System.out.println("Enter the first number");
     int userInputNum1=userInput.nextInt();

    //prompt user for the second input 
    System.out.println("Enter the second number");
    int  userInputNum2=userInput.nextInt();


    // create conditional statement which check if both number are even
    //call checkIfEven method and pass both input
    if(tutorial.isNumEven(userInputNum1) && tutorial.isNumEven(userInputNum2)){
        System.out.println("the number is even");
    }else{
        System.out.println("at least one the number is not even");
    }
   
   
    //[or boolean operator implementation]
    //prompt user for the first name 
    System.out.println("Enter the first name");
    String  userInputName1=userInput.next();

    //prompt user for the second name 
    System.out.println("Enter the second name");
    String  userInputName2=userInput.next();

    if (tutorial.isStringEqualToAbe(userInputName1)|| tutorial.isStringEqualToAbe(userInputName2)){
        System.out.println("one of the name is equal to abe");
    }else{
        System.out.println("both name are not abe");
    }
   
  
    //[not boolean operator implementation]
    // prompt the user for a name 
    System.out.println("Enter the first name");
    String  userInputName4=userInput.next();

    //**** call isStringEqualToAbe method and pass it a name 
  if (!tutorial.isStringEqualToAbe(userInputName4)){
       System.out.println("the name is not abe");
  }else{
      System.out.println("the name is abe ");
  }

   userInput.close();

}

private boolean isNumEven(int num){
    if((num%2)==0){
        return true;
    }
    return false;
}

private boolean isStringEqualToAbe(String userInputName){
     if(userInputName.equals("abe")){
         return true;
     }
     return false;
}

}




