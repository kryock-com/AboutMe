import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class textBasedAdventureR1 {
    
    public static void main(String[] args) {
        //Grabbing object
        int flower = 0;
        int flashlight = 0;
        String combo = "";

        String requiredABC = ("\nUse only A, B, or C\n");//print when you enter a differnt letter the a, b, c
        String requiredYN = ("\nUse only Y, y, yes, N, n, or no\n");//print when you enter something else then a form of yes or no
        
        //The story is broken into sections, starting with "intro"
        
        intro();
    }



    private static void intro(){

        //Figuring out how users might respond
        List answerA = new ArrayList();
        answerA.add("A");
        answerA.add("a");

        List answerB = new ArrayList();
        answerB.add("B");
        answerB.add("b");

        List answerC = new ArrayList();
        answerC.add("C");
        answerC.add("c");

        String requiredABC = ("\nUse only A, B, or C\n");//print when you enter a differnt letter the a, b, c

        Scanner ui = new Scanner(System.in);
        System.out.println("\nYou wake up in the middle of the night to feel livelier than ever, even tho\nyou just went to bed an hour prior, you look over your shoulder to see your computer\nopen, the screen illuminating the room, the sound of medieval theme music flooding the room\neager to find out what on the computer is making the sound, but also hesitant at the same time.");
        System.out.println("A. Get up too see what is making that sound\nB. Stay, and try to go to bed");
        String choice =  ui.nextLine();//Here is your first choice.

        if(answerA.contains(choice)){
            option_computer(); //option_---() find the function that has the same name and calls it
        }
        else if(answerB.contains(choice)){
            System.out.println("\nYou decided to go back to bed\n\nThe forces of night has taken you once again");
        }
        else{
            System.out.println(requiredABC);
            intro();               //so the user dont break the games this requires them to put in a usable answer
        }
        ui.close();
    }
    //__________________________________________________________________________________________________________________________
    private static void option_computer(){

        List answerA = new ArrayList();
        answerA.add("A");
        answerA.add("a");

        List answerB = new ArrayList();
        answerB.add("B");
        answerB.add("b");

        List answerC = new ArrayList();
        answerC.add("C");
        answerC.add("c");

        String requiredABC = ("\nUse only A, B, or C\n");//print when you enter a differnt letter the a, b, c

        Scanner ui = new Scanner(System.in);
        System.out.println("\nYou walk over to your desk, sit down in front of the computer, and open it\nto see a game title screen confused not recalling the last time you ever downloaded that game.\nyou try and exit out of the game, you try turning off the computer holding the power button\nbut nothing, nothing happen. A text message pop up 'play the game', you try and message back\nand even close the window, it doesn't work the mouse pointer is stuck a the play button");
        System.out.println("\nA. Press play\nB. Go back to bed");
        String choice =  ui.nextLine();
        if(answerA.contains(choice)){
            option_play();
        }
        else if(answerB.contains(choice)){                                  // the answer you choose determinds on the out come
            System.out.println("\nYou decided to go back to bed\n\nThe forces of night has taken you once again");
        }
        else{
            System.out.println(requiredABC);
            option_computer();       //if you dont answer with an A, B, C, yes or no it reasked the qusetion
        }
        ui.close();
    }
    //__________________________________________________________________________________________________________________________
    private static void option_play(){

        List answerA = new ArrayList();
        answerA.add("A");
        answerA.add("a");

        List answerB = new ArrayList();
        answerB.add("B");
        answerB.add("b");

        List answerC = new ArrayList();
        answerC.add("C");
        answerC.add("c");

        String requiredABC = ("\nUse only A, B, or C\n");//print when you enter a differnt letter the a, b, c

        Scanner ui = new Scanner(System.in);
        System.out.println ("\nYou press play, the screen fades to black, you see your face on the screen, you see the\nscared expression on your face, the screen then opens up on a scene with a character standing in\nfront of two tunnels. another message pops up 'pick a path left or right");
        System.out.println("\nA. Go left\nB. Go right\nC. Go back to bed");
        String choice =  ui.nextLine();

        if(answerA.contains(choice)){
            option_left();
        }
        else if(answerB.contains(choice)){
            option_right();
        }
        else if(answerC.contains(choice)){
            System.out.println("\nYou decided to go back to bed\n\nThe forces of night has taken you once again");
        }
        else{
            System.out.println(requiredABC);
            option_play();
        }
        ui.close();
    }
    //__________________________________________________________________________________________________________________________
    private static void option_left(){

        //Figuring out how users might respond
        List answerA = new ArrayList();
        answerA.add("A");
        answerA.add("a");

        List answerB = new ArrayList();
        answerB.add("B");
        answerB.add("b");

        List answerC = new ArrayList();
        answerC.add("C");
        answerC.add("c");

        List yes = new ArrayList();
        yes.add("Y");
        yes.add("y");
        yes.add("yes");

        List no = new ArrayList();
        no.add("N");
        no.add("n");
        no.add("no");

        //Grabbing object
        int flower = 0;
        int flashlight = 0;
        String combo = "";

        String requiredABC = ("\nUse only A, B, or C\n");//print when you enter a differnt letter the a, b, c
        String requiredYN = ("\nUse only Y, y, yes, N, n, or no\n");//print when you enter something else then a form of yes or no

        Scanner ui = new Scanner(System.in);
        System.out.println("\nYou were able to move your mouse to the message window, you typed 'left' to screen\nfaded to black once again, then lights back up. the character is in a room, but the only thing\nin it was a flashlight. The message window dings 'are you going to take the flashlight? Y/N'");
        String choice =  ui.nextLine();
        if(yes.contains(choice)){
            flashlight = 1; //adds a flashlight
        }
        else{
            flashlight = 0;
        }
        System.out.println("\nDing 'What do you do next?'");

        System.out.println("\nA. Go to the next room\nB. go back and go through the right tunnel");
        String choice2 =  ui.nextLine();
        if(answerA.contains(choice2)){
            if (flashlight > 0){
                option_next();                //if the flashlight is greater then 0 youll live:
            }
            else if (flashlight == 0){        // if the flashlight equals 0 youll disapper forever
                System.out.println("\nYou should have picked up that flashlight. You\nfell down the abyss. \n\nThe forces of night has taken you once again");
            }            
        }
        else if(answerB.contains(choice2)){
            option_right();
        }
        else{
            System.out.println(required);
            option_left();
        }
        ui.close();
    }
    //__________________________________________________________________________________________________________________________
    private static void option_next(){

        //Figuring out how users might respond
        List answerA = new ArrayList();
        answerA.add("A");
        answerA.add("a");

        List answerB = new ArrayList();
        answerB.add("B");
        answerB.add("b");

        List answerC = new ArrayList();
        answerC.add("C");
        answerC.add("c");

        Scanner ui = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("You went to the next room you used a flashlight to look\naround, you shinded the light on the floor and nocited that their\nwas a abyss with a piller in the middle, you looked around some\nmore and found a stable looking plank");
        System.out.println ("A. use the plank\nB. Jump acrossed");
        String choice =  ui.nextLine();
        
        int plankbr = rand.nextInt(4);
        if(answerA.contains(choice)){
            if (plankbr ==1){        //picks a number between 1 and 2 at random then if it equals 1 then you live if not you die
                System.out.println("You made it acrossed the abyss, and went through the\ndoor which led to a hallway with another door, you go through\n\nYou got out");
            }
            else if (plankbr ==2){
                System.out.println("\nThe Brige Broke. You fell down the abyss.\nThe forces of night has taken you once again");
            }
        }
        else if(answerB.contains(choice)){
            System.out.println("\nYou should have picked up that flashlight. You\nfell down the abyss.\n\nThe forces of night has taken you once again");
        }
        else{
            System.out.println (required);
            option_next();
        }
        ui.close();
    }    
    //__________________________________________________________________________________________________________________________
    private static void option_right(){

        //Figuring out how users might respond
        List answerA = new ArrayList();
        answerA.add("A");
        answerA.add("a");

        List answerB = new ArrayList();
        answerB.add("B");
        answerB.add("b");

        List answerC = new ArrayList();
        answerC.add("C");
        answerC.add("c");

        List yes = new ArrayList();
        yes.add("Y");
        yes.add("y");
        yes.add("yes");

        List no = new ArrayList();
        no.add("N");
        no.add("n");
        no.add("no");

        //Grabbing object
        int flashlight = 0;
        String combo = "";

        String requiredABC = ("\nUse only A, B, or C\n");//print when you enter a differnt letter the a, b, c

        Scanner ui = new Scanner(System.in);
        
        System.out.println("You walk down the tunnle to the right to end up in a room\nit very dark, you continue walk, untill you run into a door, looking\nfor a handle you find a padlock on it that you guess need a combination");
        System.out.println("A. Guess the combination\nB. Look around");
        String choice =  ui.nextLine();

        if(answerA.contains(choice)){
            if (combo=="8976"){

            }
            else{
              System.out.println("You start trying to guess the combination, you hear\na ticking sound coming form the lock you don't pay attensh\nto it, after a few mintues the floor opens up and you fall");
              System.out.println("\n\nThe forces of night has taken you once again");
            }
            
        }
        else if (answerB.contains(choice)){
            System.out.println("A. Look in the other rooms\nB. Look around in this room");
            String choice2 =  ui.nextLine();
            if(answerA.contains(choice2)){
                option_play();
            }
            else if(answerB.contains(choice2)){
                if (flashlight == 1){
                    System.out.println("you shine the flashlight on the wall to see number on the wall -8976-");
                    combo = "8976";
                }
                else if (flashlight == 0){
                    System.out.println("you find nothing becuase it is to darkand you deside to stop looking");
                    option_right();
                }
            }
        }
        else{
            System.out.println(requiredABC);
            option_right();
        } 
        ui.close();  
    }
}
