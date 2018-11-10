import java.util.*;
class OriginalVideo
{
    Scanner sc=new Scanner(System.in);
    
    int l;
    void original()
  {
     System.out.println("1:Dragonball Z complete Original Video Animations"+"\t"+"Rs.900/-"+"\n"+"2:Detective Conan Original Video Animations Season 1"+"\t"+"Rs.700/-"+"\n"+"3:Pokemon Original Video Animations Complete Set"+"\t"+"Rs.1000");
     System.out.println("Please Enter Your Choice");
     l=sc.nextInt();
     if (l!=1 && l!=2 && l!=3)
     {
       System.out.println("Wrong Choice");
       new OriginalVideo().original();
     }
     else{
      Bill ob2=new Bill();
      ob2.bills3(l);
    }
  }
}