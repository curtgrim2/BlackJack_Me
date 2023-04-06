import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.security.SecureRandom;



public class BlackJack4{
 public static void main (String[] cdg){
         
           Scanner playerresponse = new Scanner(System.in);
           
           //int [] numcards = {1,2,3,4,5,6,7,8,9,10};
           //String [] royal = {"J",Q,K,A};
           
           boolean bust = false;  
           boolean blackj = false; 
           boolean stand = false;    
           boolean dealersturn = false;
           ArrayList <String>allcards = new ArrayList<String>();
           //ArrayList dealer = new ArrayList();
           //ArrayList player = new ArrayList();
          
          ArrayList<Integer> dealer = new ArrayList<Integer>();
          ArrayList<Integer> player = new ArrayList<Integer>();
           
           allcards.add("1");
           allcards.add("2");
           allcards.add("3");
           allcards.add("4");
           allcards.add("5");
           allcards.add("6");
           allcards.add("7");
           allcards.add("8");
           allcards.add("9");
           allcards.add("10");
           allcards.add("J");
           allcards.add("Q");
           allcards.add("K");
           allcards.add("A");
          
         /* int drawn = Random();
          
          if (drawn == "K" ||drawn =="Q"|| drawn == "J"){
                             
                             
                             }

          else{
          
           //dealer.add(allcards.get(Random()));
           //player.add(allcards.get(Random()));
           } */
           
           int rounds =1;

           
           BlackJack4 randy = new BlackJack4();
           
           String namecall= " ";
           
           int sum1 = 0;
           int dealersum =0;

       
           
           player.add(randy.RandomN(namecall,player,rounds, allcards));
           
           dealer.add(randy.RandomN(namecall,player, rounds, allcards));
           
           player.add(randy.RandomN(namecall,player,rounds, allcards));
           
           dealer.add(randy.RandomN(namecall,player, rounds, allcards));
           
           
    //int sum1 = 0;
   // int dealersum =0;
      
    boolean done = false;
           
           
           
           while(  done == false){ /*First Symstem out print Dealers ? Hand then players; Ask to hit and repet till you get a stand  */ //stand == false || blackj ==false ||
           
            randy = new BlackJack4();
            
            
                 
            
          
           System.out.print("Dealer has " + dealer.get(0) + "  " + "?  " );
           
            System.out.print("Player has "  );
            sum1=0;
                       
           for(int x = 0 ; x<=rounds  ; x++){  
           
           System.out.print(player.get(x) + " ");
         
           
            sum1 = sum1 + Integer.valueOf(player.get(x));
            
           }
           
           if(sum1> 21){
           done = true;
           break;
           }
           
           else if (sum1 == 21){
           done = true;
           break;
           
           }
           
           
           System.out.println();
           System.out.print("Would you like to (H)it or (S)tand?");
           
           String response=" ";
           
           //if(playerresponse.hasNext()){
            response = playerresponse.next(); 
//}
//else{
            if (response.equals("S")){
            
                  done = true;
                  dealersturn =true;
                  
                  System.out.print("Player stands with ");
                  
                  for(int x = 0 ; x<=rounds  ; x++){  
           
           System.out.print(player.get(x) + " ");
                  }
                  
                  System.out.println("=" + sum1);

           }
           
           else if (response.equals("H")){
           player.add(randy.RandomN(namecall,player,rounds,allcards));
           rounds++;
           }//
                  
           
           
             else{
                            System.out.println("Invalid Input");
                         }      
                 }
                           
                           
                           
                           /* CHECKING PLAYERS RESULTS*/
                           
                           
                          if(sum1> 21){
                          System.out.println();
           System.out.println("Player busts");
           dealersturn = false;
            sum1=0;
                     for(int x = 0 ; x<=rounds  ; x++){  
           
           System.out.print(player.get(x) + " ");
           
           
            sum1 = sum1 + Integer.valueOf(player.get(x));
            
           }
           System.out.println();

           System.out.print(sum1 + "= Sum ");
           
                  
           }
           
           else if (sum1 == 21){
           System.out.print("BLACKJACK FOR PLAYER");
           
           }
                           
                           
                           
                          
                           
                           
                           
                           /* Dealers turn:  Dealer its until score is greater of equal to 17*/
                           
                           
                           
                           
                       if(dealersturn==true){    
                           
                           
                           rounds = 0;
                           boolean dealerstand = false;
                           boolean dealerbust = false;
                           boolean gameover = false;
                           
                           
                           while(gameover== false){  
                           
                           System.out.print("Dealer has " );   
                           
                           dealersum =0; 
                                  
                           for(int x = 0 ; x<=rounds; x++){
                           System.out.print(dealer.get(x) + " ");
    
                            dealersum+= dealer.get(x);
                           }                                 
                              
                              
                              if(dealersum>=17 && dealersum<=21){
                              
                                gameover=true;    
                              
                              }
                              else if(dealersum>21){
                              gameover = true;
                              }
                              else{
                              
           
                               dealer.add(randy.RandomN2(namecall,dealer, rounds, allcards));
                              
                              rounds++;
                               }
                                
                                System.out.println( );
                                 
                           }
           
                      } 
                      if(sum1>dealersum && sum1<=21){
                      System.out.print("Player Wins");
                      
                      }
                      
                      else if (sum1<dealersum && dealersum<=21){
                      System.out.print("Dealer Wins");
                      }
                      
                      
                     else if (sum1==dealersum){
                      System.out.print("DRAW");
                      }
                 }     //End of main
                      
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                     
                                         
                      
                      public int Decipher (List <Integer> player, int rounds, int randnum, List allcards){
                      //public int Decipher ( int randnum, List allcards){
                       
                      if (allcards.get(randnum)== "K" ||allcards.get(randnum) =="Q"|| allcards.get(randnum)== "J"){
                             return 10;
                             
                             }
                             
                       else if(allcards.get(randnum) == "A"){
                       
                       int playersum1 = 0;
                       
                             for(int x = 0 ; x<=rounds; x++){
                                       playersum1+= player.get(x);                                  
                              }
                              
                              if(playersum1+11<=21){
                                    return 11;
                              
                              }
                              else{
                              
                                    return 1;                              
                                    }
                            } 
                            
                            else{
                                                       
                           int [] array = {1,2,3,4,5,6,7,8,9,10};
                           int newnum = array[randnum];
                           
                            
                            return newnum;
                            }                   
                      }
                      
                      
                      public int RandomN(String namecall,ArrayList <Integer> player,int rounds, ArrayList allcards){
                     SecureRandom rand = new SecureRandom(); //15
                      int randnum =  rand.nextInt(14);//
                                           
                      
                       //namecall = String.valueOf(allcards.get(randnum));
                      return Decipher( player, rounds, randnum, allcards);
                      
                      }
                      
                     /* public String CardReveal(ArrayList allcards){
                      
                                 
                                 
                                 
                      }*/
                      
                      
                      
                      
                      
                      
                      
                      
                      public int Decipher2 (ArrayList <Integer> dealer, int rounds, int randnum, ArrayList allcards){
                       
                      if (allcards.get(randnum)== "K" ||allcards.get(randnum) =="Q"|| allcards.get(randnum)== "J"){
                             return 10;
                             
                             }
                             
                       else if(allcards.get(randnum) == "A"){
                       
                       int playersum1 = 0;
                       
                             for(int x = 0 ; x<=rounds; x++){
                                       playersum1+= dealer.get(x);                                  
                              }
                              
                             if(playersum1+11<=21){
                                    return 11;
                              
                              }
                              else{
                              
                                    return 1;                              
                                    }
                            } 
                            
                            
                            else{
                            
                            int [] array = {1,2,3,4,5,6,7,8,9,10};
                             int newnum = array[randnum];
                             return newnum;
                            }                   
                      }
                      
                      
                      public int RandomN2(String namecall,ArrayList <Integer> dealer,int rounds, ArrayList allcards){
                      SecureRandom rand = new SecureRandom(); //15
                      int randnum =  rand.nextInt(14);//
                      return Decipher2( dealer, rounds, randnum, allcards);
                      
                      }
                      
               }