import java.io.*;
import java.util.*;
class AB
{
 static Scanner sc=new Scanner(System.in);
    
  
 public static void main(String[] args)
 {   
  System.out.println("**************** **      **  *********      **********   **********   **        **        *********  *********  ****************  **********  **********  **   **********            ");
  System.out.println("**************** **      **  *********      **********   **********   **        **        *********  *********  ****************  **********  **********  **   **********             ");
  System.out.println("       **        **      **  **             **           **      **   **        **        **         **                **         **      **  **      **  *    **           ");
  System.out.println("       **        **********  *********      **           **      **   **        **        *********  **                **         **      **  **********       **********          ");
  System.out.println("       **        **********  *********      **           **      **   **        **        *********  **                **         **      **  **********       **********           ");
  System.out.println("       **        **      **  **             **           **      **   **        **        **         **                **         **      **  ** **                    ** ");
  System.out.println("       **        **      **  *********      **********   **********   ********* ********* *********  *********         **         **********  **    **         **********         ");
  System.out.println("       **        **      **  *********      **********   **********   ********* ********* *********  *********         **         **********  **       **      **********           ");
  System.out.println("                                                    ");
  System.out.println("                                                ");
  System.out.println("                                                ");
  System.out.println("                                                ");
  System.out.println("                                                ");
  System.out.println("                                    ");
  System.out.println(                         "");
  System.out.println("                            ");
  System.out.println("                                        ");
  System.out.println("                                                ");
  int n;
  String items[]={"1:Action Figures","2:Collectors Comic Books","3:Original Video Animations","4:Soveigners","5:Exit"};
  for(int i=0;i<items.length;i++)
  {
   System.out.println(items[i]);
  }
  System.out.println("Please Enter a Number which corresponds to the choices");
  n=sc.nextInt();
              
  switch(n)
  {
   case 1:
   new ActionFigures().act();
   break;
   case 2:
   new CollectorsComic().comic();
   break;
   case 3:
   new OriginalVideo().original();
   break;
   case 4:
   new Souvenirs().souv();
   break;
   case 5:
   System.out.println("Do Visit Again");
   System.exit(0);
   break;
   default: System.out.println("Wrong Choice");
   //new AB().main();
  }   
 }
}
