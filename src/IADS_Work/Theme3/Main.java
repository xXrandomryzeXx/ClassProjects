/* Current file: Main.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme3;

public class Main {

    static int boat = 1;
    static int wolf = 1;
    static int goat = 1;
    static int cabbage = 1;

    static boolean err = false;

    public static void main(String[] args){

        while(wolf == 1 || goat == 1 || cabbage == 1){
            for(int i = 1; i <= 3; i++){
                //If the boat is on the left, move to the right and take an object with it
                if(boat == 1) {
                    //Move the boat to the right
                    boat *= 10;
                    System.out.println("Boat moves to the right");

                    if (i == 1 && wolf == 1) {
                        wolf *= 10;
                        System.out.println("Wolf moves to the right");
                    }
                    if (i == 2 && goat == 1) {
                        goat *= 10;
                        System.out.println("Goat moves to the right");
                    }
                    if (i == 3 && cabbage == 1) {
                        cabbage *= 10;
                        System.out.println("Cabbage moves to the right");
                    }


                }

                //If there is a single object on the left side
                if(OnlyOneObject(1)){
                    if(boat == 10) {boat /= 10; System.out.println("Boat moves to the left");}
                }

                //If there is a single object on one side with the boat, just move the boat back
                if(OnlyOneObject(10)){
                    if(boat == 10) {boat /= 10; System.out.println("Boat moves to the left");}
                }

                //Left side conflict
                if((wolf == 1 && goat == 1 && boat == 10) || (goat == 1 && cabbage == 1 && boat == 10)) {
                    System.out.println("!xxxxxxx-Left side conflict-xxxxxxx!");

                    boat /= 10;
                    System.out.println("Boat returns to the left");
                    // Check the conflicting objects and move one of them
                    MoveObject(i, 1);


                    //Move last moved object back to its original place
                    if (i == 1 && wolf == 10) {
                        wolf /= 10;
                        System.out.println("Wolf returns to the Left");
                    }
                    if (i == 2 && goat == 10) {
                        goat /= 10;
                        System.out.println("Goat returns to the Left");
                    }
                    if (i == 3 && cabbage == 10) {
                        cabbage /= 10;
                        System.out.println("Cabbage returns to the Left");
                    }

                }else{
                    if((wolf == 10 && goat == 10 && boat == 1) || (goat == 10 && cabbage == 10 && boat == 1)){
                        System.out.println("!xxxxxxx-Right side conflict-xxxxxxx!");

                        boat *= 10;
                        System.out.println("Boat returns to the Right");
                        // Check the conflicting objects and move one of them
                        MoveObject(i, 10);


                        //Move last moved object back to its original place
                        if (i == 1 && wolf == 1) {
                            wolf *= 10;
                            System.out.println("Wolf returns to the Right");
                        }
                        if (i == 2 && goat == 1) {
                            goat *= 10;
                            System.out.println("Goat returns to the Right");
                        }
                        if (i == 3 && cabbage == 1) {
                            cabbage *= 10;
                            System.out.println("Cabbage returns to the Right");
                        }
                    }else{
                        System.out.println();
                        System.out.println("------------Correct move------------");
                        System.out.println("        Boat is on the: " + ((boat == 1)? "left" : "right"));
                        System.out.println("   Wolf is on the: " + ((wolf == 1)? "left" : "right"));
                        System.out.println("   Goat is on the: " + ((goat == 1)? "left" : "right"));
                        System.out.println("Cabbage is on the: " + ((cabbage == 1)? "left" : "right"));
                        System.out.println();
                    }
                }

            }
        }

    }

    // index (1, 2, 3) side (1 - left, 10 - right)
    // Check if there are 2 objects on the given side of the river
    // If so, move the one that is not on the same index
    public static void MoveObject(int index, int side){
        //Which of these objects is on the given side
        boolean w = wolf == side, g = goat == side, c = cabbage == side;

        if(!(w && g && c)) {
            if (index == 1) {
                if (w && g) {
                    goat = (side == 10) ? goat / 10 : goat * 10;
                    System.out.println("Moving the goat instead of the wolf");
                }
            } else if (index == 2) {
                if (w && g) {
                    wolf = (side == 10) ? wolf / 10 : wolf * 10;
                    System.out.println("Moving the wolf instead of the goat");
                } else if (g && c) {
                    cabbage = (side == 10) ? cabbage / 10 : cabbage * 10;
                    System.out.println("Moving the cabbage instead of the goat");
                }
            } else if (index == 3) {
                if (c && g) {
                    goat = (side == 10) ? goat / 10 : goat * 10;
                    System.out.println("Moving the goat instead of the cabbage");
                }
            }
        }
    }

    public static boolean OnlyOneObject(int side){
        boolean bools[] = new boolean[3];
        bools[0] = wolf == side;
        bools[1] = goat == side;
        bools[2] = cabbage == side;

        int trueBools = 0;

        for(boolean b : bools){
            trueBools += (b)? 1 : 0;
        }

        if(trueBools == 1){
            return true;
        }
        return false;
    }
}
