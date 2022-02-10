package Test;

public class FiftyToTwoHundred {
    public static void main(String[] args){
        for(int i = 50; i <= 200; i++){
            if(i%2 != 0){
                System.out.print(i + ((i != 199)? ", " : ""));
            }
        }
    }
}
