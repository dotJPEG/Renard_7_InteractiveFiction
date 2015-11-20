/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renard_7_tbagame;
import java.util.*;
import java.math.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
/**
 * @author Bob Renard
 * @author dotJPEG
 */
public class Renard_7_TBAGame {
static int TimesPlayed;
static String name;
static Scanner string = new Scanner(System.in);
//static Scanner action = new Scanner(System.in);
static String command;
static String command2;
static String command3;
static boolean general;
static boolean room1;
static boolean key1;
static boolean room2;
static boolean key2;
static boolean sword;
static boolean field;
static boolean town;
static boolean inn;
static boolean quest1;
static boolean quest1c;
static boolean quest2;
static boolean quest3;
static boolean blacksmith;
static boolean buy;
static boolean sell;
static boolean morgue;
static boolean mroom1;
static boolean mroom2;
static boolean mroom3;
static boolean well;
static boolean play;
static boolean castle;
static boolean gate;
static boolean tower;
static boolean alter;
static boolean aroom1;
static boolean aroom1c;
static boolean aroom2;
static boolean aroom2c;
static boolean aroom3;
static boolean aroom3c;
static boolean broom;
static boolean person;
static boolean orelse;
    public static void main(String[] args) {  
        general = true;
        TimesPlayed = 0;
        while(general){
         System.out.println("Would you like to play?");
         command = string.nextLine();
            if(command.contains("Y") || command.contains("y")){
                if(TimesPlayed == 0){
                 INTRO();
                 ROOM1();
                 ROOM2();
                 FIELD();
                 CASTLE();
                 BOSS();
                }else{
                 ROOM1();
                 ROOM2();
                 FIELD();
                 CASTLE();
                 BOSS();
               //PART1THEADVENTURECOMMENCESCHAPTER1KITCHEN();
                }
            }else if(command.contains("N") || command.contains("n")){
             System.out.println("Okay, Bye!");
             general = false;
            }else{
             System.out.println("this isnt working");
            }
        }
    }
    static void INTRO(){        
        System.out.println("Hello, welcome to Bob's very first text based adventure game, or TBAG for short.");       
        System.out.println("To play the game enter commands into the console, when reading you will see words in all capital letters");
        System.out.println("This means that that word is a command for the currect situation");
        System.out.println("To begin playing the game, please enter your name");
         name = string.nextLine();
        System.out.println("Hello " + name + ", Welcome to the world of Gomeria.");
        System.out.println("You wake up in a small and dark room that smells of rotting flesh.");
        System.out.println("You look around your dimly lit surroundings to see that in the room is a PILE of dead bodies wearing clothes that are ");
        System.out.println("similar to those that you have on, next to the pile you see a table with a KEY and a note attached to the key, and accross");
        System.out.println("the room you see a large metal DOOR.");
    }
    static void ROOM1(){
        room1 = true;
        while(room1){
         System.out.println("What do you decide to do?");
         command = string.nextLine();
            if(command.equalsIgnoreCase("key")){
                if(!key1){
                 System.out.println("You walk over to the table and pick up the key");
                 System.out.println("the note reads 'From a friend'");
                 key1 = true;
                }else{
                 System.out.println("You already have the key");
                }
            }else
            if(command.equalsIgnoreCase("door")){
                if(key1){
                 System.out.println("You unlock the door with the key and proceed to the next room, press enter to continue");
                 room1 = false;
            }else{
             System.out.println("The door is locked, try using the key on the table");
            }
            }else
            if(command.equalsIgnoreCase("pile")){
             System.out.println("You approach the pile of death to see that other than the pile of bodies, there is nothing out of the ordinary");
            }else{
             System.out.println("Not a valid command");
            }
        }
    }
    static void ROOM2(){
        room2 = true;          
        System.out.println("You leave the room you awoke in to find another room of similar theme.");
        System.out.println("Across the room you see a MONSTER holding a key, on a table you see a rusty SWORD, and to your right there is a locked DOOR");
        while(room2){ 
         command2 = string.nextLine();
            if(command2.equalsIgnoreCase("monster")){
                if(sword){
                 System.out.println("You take a swing at the monster");
                 System.out.println("It shutters in pain when you hit it, and then turns to face you.");
                 System.out.println("'OUCH!' It proclaims, 'Why on earth did you do that?!'");
                 System.out.println("You feel sudden remorse");
                 System.out.println("Because you're a moster and you have a key. honestly it's what I've vome to expect at this point");
                 System.out.println("If you wanted the key you could have atleast asked, next time don't be so rude!");
                 System.out.println("The friendly monster gives you the key");
                 key2 = true;
                }else{
             System.out.println("You'd better not try anything until you're armed");
                }
            }
            if(command2.equalsIgnoreCase("sword")){
             System.out.println("You walk over to the table and pick up the sword, you are confident that you will be able to crush the monster.");
             sword = true;
            }
            if(command2.equalsIgnoreCase("door")){
                if(key2){
                 System.out.println("You use the key to unlock the room and proceed into a large open field full of life and wonder.");
                 System.out.println("Far in the distance you see a large TOWN, down a road towards the TOWN you see a WELL, and in the");
                 System.out.println("other direction you see an evil looking CASTLE, or atleast you would assume It's evil, but the lack");
                 System.out.println("of lore so far isn't helping.");
                 room2 = false;
                }else{
                 System.out.println("You try to open the door but it wont budge, maybe try gettin a key before trying to open a locked door.");
                }
            }
        }
    }
    static void FIELD(){
        field = true;     
        while(field){
         command3 = string.nextLine();
        System.out.println("You can travel to the WELL, the TOWN, or the CASTLE.");
            if(command3.equalsIgnoreCase("town")){
            town = true;
            while(town){
             command3 = string.nextLine();
             System.out.println("You approach the town to find a wonderfull bustling medievil town, around the town you see a BLACKSMITH, an INN,");
             System.out.println("and a MORGUE. On the other hand you could return to the feild if you would like.");
                if(command3.equalsIgnoreCase("INN")){
                 System.out.println("You walk into the inn to find a cheerful display of poeple enjoying themselves, nothing out of the ordinary");
                 System.out.println("exept for the story teller across the room. You walk up to him and decide to ask him about either QUEST1,");
                 System.out.println("QUEST2, QUEST3, or LORE");
                 command3 = string.nextLine();
                    if(command3.equalsIgnoreCase("QUEST1")){
                        if(quest1c){
                            System.out.println("Ayy maybe you're not the pleb I thought you were. Thanks for that.");   
                        }else{
                         System.out.println("You walk up to the man telling stories while he is taking a break from his tales and ask him about");
                         System.out.println("quest one, the man proceeds to tell you or the town's MORGUE, and how it has had a recent infestation.");
                         System.out.println("You offer to help and the man gladdly accepts, and gives you a key to the MORGUE. You exit the Morgue ");
                         System.out.println("and head back to the feild for the day.");
                         quest1 = true;
                         town = false;
                        }
                    }
                    if(command3.equalsIgnoreCase("QUEST2")){
                     System.out.println("You walk up to the man telling stories while he is taking a break from his tales and ask him about");
                     System.out.println("quest two, the man proceeds to tell you of a well outside of town that is told to be magical.");
                     System.out.println("He then says you should give it a try sometime. You exit the inn and head back to the feild for the day.");
                     quest2 = true;
                     town = false;
                    }
                    if(command3.equalsIgnoreCase("QUEST3")){
                     System.out.println("You walk up to the man telling stories while he is taking a break from his tales and ask him about");
                     System.out.println("quest three, the man proceeds to tell you of the large keep you saw when you left the strange rooms you");
                     System.out.println("started in. He says that a great evil lives there and needs to be rid of, but no one dares to try.");
                     System.out.println("When you offer your help the man looks you with a bewildering look, but is greatful for the help.");
                     System.out.println("He says that what you are doing, if you suceed, will be a great help to all the land, and that");
                     System.out.println("all who live in this realm would be greatful of your good deeds. He gives you a key to the keep and wishes you luck");
                     System.out.println("You head back to the feild for the day.");
                     quest3 = true;
                     town = false;
                    }
                    //if(command3.equalsIgnoreCase("LORE")){
                    //    System.out.println("Dont kid yourslef, do you actually think our overlord would take time out of his day to write any lore?");
                    // town = false;
                    //}
                }
        //        if(command3.equalsIgnoreCase("BLACKSMITH")){
        //         town = false;   
        //        }
                if(command3.equalsIgnoreCase("MORGUE")){
                    if(quest1){
                     System.out.println("You walk up to the locked morgue door and use the key that the storyteller gave you and unlock the door, you");
                     System.out.println("walk inside the newly unlocked morgue to find that the so-called 'infestation' was actually just a few rats");
                     RAT();
                     //System.out.println("You stomp a few rats and feel accomplished in your actions, though you also feel remorse for killing rats for no good reason.");
                     quest1c=true;
                    }else{
                     System.out.println("You walk up to the morgue, the only thing out of the ordinary that you see is a locked door. You get bored");
                     System.out.println("and decide to walk back to the town for the night.");
                    }
                 town = false;   
                }
                if(command3.equalsIgnoreCase("FIELD")){
                 town = false;
                }//else{
                 //   System.out.println("not a valid command");
                 //town = false;   
                }//}
            }
            if(command3.equalsIgnoreCase("well")){
                if(quest3){
                 System.out.println("You approach the well to find that like the loreteller said, it seems pretty ordinary, will you try");
                 System.out.println("throwing a coin in?");
                    if(command3.equalsIgnoreCase("yes")){
                        System.out.println("you walk up to the well when suddenly you are taken aback where all you can imagine is a simple");
                        System.out.println("Java based guessing game made by a very handsome sophmore");
                        GuessGameClass.gamecode();
                    }else{
                        System.out.println("You walk back to the feild, good for you not gambling and all");
                    }
                }else if(!quest3){
                 System.out.println("Just seems like an ordinary well, better head back to the FEILD");
                }                            
            }
            if(command3.equalsIgnoreCase("castle")){
                if(quest3){
                 System.out.println("Are you sure you want enter? There will be no turning back.");
                    command3 = string.nextLine();
                    if(command3.equalsIgnoreCase("yes")){
                     System.out.println("You enter the castle, the gate closes behind you.");
                     field = false;
                    }else{
                     System.out.println("You turn around and head back to the feild.");
                    }
                }
            }
    }
    }
    static void RAT(){
     boolean RatLife = true;
     int RatHealth = 20;
     int PlayerHealth = 50;
        while(RatLife){
         command3 = string.nextLine();
         
      // System.out.println("You hear a familiar toon ring out suddenly, and you are greeted by the mental image of a list of options.");
         System.out.println("You have " + PlayerHealth + " health left.");
         System.out.println("Will you [Punch][Kick][Fireball]");
            if(command3.contains("unch")){
             System.out.println("You punch the small rodent, the rodent shrieks in pain and cracks under your fist.");
             RatHealth = RatHealth-20;
             PlayerHealth = PlayerHealth-10;
             System.out.println("The smashing of your fist on the ground causes you to go down to " + PlayerHealth + " health left.");
             System.out.println("After closer examination you noticed that you crushed the life out of the innocent creature.");
             RatLife = false;
            }
            if(command3.contains("ick")){
             System.out.println("You stomp the rat in its place, when you lift up your foot all that is left of the rat is a pile of mush, uncalled for really.");
             RatLife = false;
            }
            if(command3.contains("ire")){
             System.out.println("You suddenly become overwhelmed by the feeling of a thousand suns, and release energy at a level you though humanly impossible.");
             System.out.println("With a great rush of power, a small spark falls from between your hands and lands on the rat, causing it to catch on fire.");
             System.out.println("The rat runs around and slowly burs away, going through a great deal of pain and suffering, I hope you're proud of yourself.");
             RatLife = false;
            }
        }
         System.out.println("With the infestation being cleared, you feel satisfied with the quest, and haed back to the feild for the night.");
    }
    static void CASTLE(){
     castle = true;
     System.out.println("You see another door in the castle feild, around you there is nothing else, you walk through the door.");
     System.out.println("Through the door you are greeted by a long hallway, at the end of the hallway there is a room with an alter in the");
     System.out.println("center of it, around it there are three doors, each with a strange marking. ");
     
        while(castle){
         System.out.println("You can investigate the ALTER, go through DOOR1, go through DOOR2, and go through DOOR3.");
         command3 = string.nextLine();
            if(command3.equalsIgnoreCase("alter")){
                if(aroom1c && aroom2c && aroom3c){
                 System.out.println("The Alter begins to shake violently soon after you place each of the three artifcats in their respective");
                 System.out.println("pedistals. After a short while the alter crumbles and reveals a spiral staircase leading deeper into the castle.");
                 castle=false;
                }else{
                    System.out.println("The alter has three spots on it, each one coresponds with a spot on each of the doors.");
                }
            }
            if(command3.equalsIgnoreCase("door1")){
                if(!aroom1c){
                 System.out.println("You walk through the leftmost door, In the center of the room there is an awkwardly placed metalic but veiny pedistal");
                 System.out.println("with a glowing mist around in. On the pedistal there is a cell like object in the shape of a cylinder with a strange");
                 System.out.println("green liquid contained within.");
                 System.out.println("You grab the object from the pedistal and bring it back to the alter, and then slot it into its intended place.");
                 aroom1c=true;
                }else{
                 System.out.println("The door seems to have locked once you left the room.");
                }
            }
            if(command3.equalsIgnoreCase("door2")){
                if(aroom1c){
                 System.out.println("You enter the room to see a similar scene, in the cell this time though there is a blue liquid. You take the cell and place ");
                 System.out.println("it into it's intended slot on the alter.");
                 aroom2c=true;
                }else if(aroom2c && aroom1c && !aroom3c){
                 System.out.println("The door is locked, There seems to be only one door left though.");
                }else if(aroom2c && aroom1c && aroom3c){
                 System.out.println("All the rooms seem to be locked.");
                }else{
                 System.out.println("The door is locked, maybe another door will be unlocked?");
                }
            }
            if(command3.equalsIgnoreCase("door3")){
                if(aroom1c && aroom2c){
                 System.out.println("Once again you enter the unexplored room to find that it is another carbon copy of what you had seen before, but yet again the");
                 System.out.println("ooze contained within the cell is different from the rest, this ooze is a bright red color.");
                 aroom3c=true;
                }else if(aroom1c && aroom2c && aroom3c){
                    System.out.println("All the rooms seem to be locked.");    
                }else{
                 System.out.println("The door is locked, maybe another door will be unlocked?");
                }
            }
        }
    }
    static void BOSS(){
     broom = true;
     System.out.println("You travel further and further down the seamingly endless staricase until you finaly reach the bottom to find a strange door.");
     System.out.println("The door has a strange and futeristic style about it, you can make out a handful of strange outcroppings from it, one of these however");
     System.out.println("looks like a door knob so you decide to try it.");
     System.out.println("You enter the room to see a strange seen, what you expected to be a great evil, actually turned out to be just a simple teenager");
     System.out.println("Sitting infront of some strange box that emits light from it. The room is filled with the sound of clacking, you can see that the sound");
     System.out.println("is coming from a strange rectangle with letters imprinted on it.");
         while(broom){
          System.out.println(";You can investigate PERSON, LEAVE, or ATTACK the person.");
         command3 = string.nextLine();
            if(command3.equalsIgnoreCase("PERSON")){
             person = true;
             System.out.println("You approach the person and reach out to touch them, when your hand collides with your shoulder the person gets startled and grabs you.");
             System.out.println("'Who are you?!'");
             System.out.println("For a moment you say nothing, until the person gets frustrated and asks again");
                while(person){
                 command3 = string.nextLine();
                 System.out.println("I'll ask again, who are you?!");
                 System.out.println("How do you respond?");
                    if(command3.equalsIgnoreCase("say nothing")){
                        if(orelse){
                         System.out.println("'You had better give me a name or else!");
                         orelse = true;
                    }else if(!orelse){
                     System.out.println("'SECURITY' The person screams.");
                     System.out.println("A group of men in strange black outfits storm the room and capture you, you feel a smash on your head and fall uncontious.");
                     System.out.println("You wake up in a small and dark room that smells of rotting flesh.");
                     TimesPlayed++;
                     break;
                    }
                    }
                    if(command3.equalsIgnoreCase(name)){
                     System.out.println("'Ok name, I have an idea, lets get you out of here shall we?' The person says, 'SECURITY!'");
                     System.out.println("A group of men in strange black outfits storm the room and capture you, you feel a smash on your head and fall uncontious.");
                     System.out.println("You wake up in a small and dark room that smells of rotting flesh.");
                     TimesPlayed++;
                     break;
                    }
                    if(command3.contains("hero")){
                     System.out.println("'I doubt it, SECURITY!'");
                     System.out.println("A group of men in strange black outfits storm the room and capture you, you feel a smash on your head and fall uncontious.");
                     System.out.println("You wake up in a small and dark room that smells of rotting flesh.");
                     TimesPlayed++;
                     break;
                    }
                    if(command3.contains("you")){
                        if(orelse){
                         System.out.println("'That's not important. Like I said before, who are you?");
                         orelse = true;
                        }else if(!orelse){
                         System.out.println("'Well atleast I tried to be nice.'");
                         System.out.println("'SECURITY' The person screams.");
                         System.out.println("A group of men in strange black outfits storm the room and capture you, you feel a smash on your head and fall uncontious.");
                         System.out.println("You wake up in a small and dark room that smells of rotting flesh.");
                         TimesPlayed++;
                         break;
                        }
                    }
             //command = string.nextLine();
                }
            }
            if(command3.equalsIgnoreCase("LEAVE")){
                System.out.println("You try to open the door that you entered through, but nothing happens. You try the door next to it, but when you open it all you can see is the void of space.");
            }
            if(command3.equalsIgnoreCase("ATTACK")){
                System.out.println("Why are you so violent? First the friendly monster, then the rats, and now this? You really need to calm down.");
            }
        }
    }
}