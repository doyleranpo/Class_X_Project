import java.util.*;
class ActionFigures
{    
    int k;
    Scanner sc=new Scanner(System.in);
    void act()
        {
        
        System.out.println("1:Superman Figures"+"\t"+"Rs.350/-"+"\n"+"2:Batman Figures"+"\t"+"Rs.400/-"+"\n"+"3:Avengers Figures"+"\t"+"Rs.450/-");
        System.out.println("Please Enter Your Choice");
        k=sc.nextInt();
        if (k!=1 && k!=2 && k!=3)
        {System.out.println("Wrong Choice");
         new ActionFigures().act();
        }else{
    
        Bill ob1=new Bill();
        ob1.bills1(k);
    }
    }
}