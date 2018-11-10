import java.util.*;
class Souvenirs
{
 Scanner sc=new Scanner(System.in);
    
 int c;
 void souv()
 {
    System.out.println("1:Dragonball Z Keychains"+"\t"+"Rs.450/-"+"\n"+"2:Detective Conan Glasses, Shoes And Bowtie Set"+"\t"+"Rs.1000/-"+"\n"+"3:Action Kamen, Quantom Robot And Buri Buri Zymon Magazines"+"\t"+"Rs.1500");
    System.out.println("Please Enter Your Choice");
    c=sc.nextInt();
    if (c!=1 && c!=2 && c!=3)
    {System.out.println("Wrong Choice");
     new Souvenirs().souv();}
    else
    {
     Bill ob3=new Bill();
     ob3.bills4(c);
    }
 }
}