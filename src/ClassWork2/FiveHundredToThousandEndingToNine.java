package ClassWork2;

public class FiveHundredToThousandEndingToNine {
    public static void main(String[] args){
        for(int i = 500; i <  1000; i++){
            if(i%10 == 9){
                System.out.println("Ends in 9: " + i);
            }
        }
    }
}
