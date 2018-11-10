import java.util.*;
class CollectorsComic
{
    Scanner sc=new Scanner(System.in);
    int y;
    long ctot;
    void comic()
    {
        System.out.println("1:Munchen Graph"+"\t"+"Rs.900/-"+"\n"+"2:Dragonball Z Manga"+"\t"+"Rs.1800/-"+"\n"+"3:Detective Conan Manga"+"\t"+"Rs.1700/-");
        System.out.println("Please Enter Your Choice");
        y=sc.nextInt();
        if(y!=1 && y!=2 && y!=3)
        {System.out.println("Wrong Choice");
        new CollectorsComic().comic();
    }else{
        Bill ob2=new Bill();
        ob2.bills2(y);
    }
    }
}