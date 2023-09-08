import java.util.*;


package tollefson.lab2;

/**
 *
 * @author jakobtollefson
 */
public class TollefsonLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random rand= new Random();
    Scanner keyboard=new Scanner(System.in);
    int counter=1;
    int esp=0;
    while (counter <=10){
        
    
    int rand_int1 = rand.nextInt(4);
          
    String compFish="";
        
        
        
        if (rand_int1==0){
            compFish="Ahi";
        }
        else if (rand_int1==1){
            compFish="Opah";
        }
        else if (rand_int1==2){
            compFish="Uku";
        }
        else if (rand_int1==3){
            compFish="Ono";
        }
        System.out.println("I'm thinking of a fish. Is it an Ahi, Opah, Uku, Ono?");
        String fish = keyboard.nextLine();
        System.out.println("your answer was "+fish+". I was thinking "+compFish);
        
        if (compFish.equals(fish)) {
            esp+=1;
        }
        System.out.println("You guessed "+esp+" correctly.");
        counter=counter+1; //or counter +1 either adds one to the counter. this will stop loop
        
         
    }
       
    
}
}