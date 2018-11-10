import java.util.*;
class Bill
{
        int qty;
        Scanner sc= new Scanner(System.in);
        void bills1(int k)//Bill Method for Action Figures
        {
            double btotal1, ac=0.0, btax1;
            if(k==1)
                ac=350;
                else if(k==2)
                ac=400;
                else if(k==3)
                ac=450;
            System.out.println("Please Enter the quantity");
            qty=sc.nextInt();
            ac*=qty;
            btax1=(0.13*ac);
            btotal1=btax1+ac;
            System.out.println("------BILL------");
            System.out.println("################");
            System.out.println("Your Subtotal = Rs."+ac);
            System.out.println("The Tax Added is = Rs."+btax1);
            System.out.println("Your Total Amount = Rs."+btotal1);
            new Bill().addressforpayment();
        }
    
        void bills2(int y)//Bill Method for Collectors Comics
        {
        
            double btotal2, poke=0.0, btax2;
            if(y==1)
                poke=900;
            else if(y==2)
                poke=1800;
            else if(y==3)
                poke=1700;
            System.out.println("Please Enter the quantity");
            qty=sc.nextInt();
            poke*=qty;
            btax2=0.13*poke;        
            btotal2=btax2+poke;
            System.out.println("------BILL------");
            System.out.println("################");
            System.out.println("Your Subtotal = Rs."+poke);
            System.out.println("The Tax Added is = Rs."+btax2);
            System.out.println("Your Total Amount = Rs."+btotal2);
            new Bill().addressforpayment();
        }
    
        void bills3(int l)//Bill method for Original Video
        {
            double btotal3, dbz=0.0, btax3;
                if(l==1)
                dbz=900;
                else if(l==2)
                dbz=700;
                else if(l==3)
                dbz=1000;
                System.out.println("Please Enter the quantity");
                qty=sc.nextInt();
                dbz*=qty;
                btax3=0.13*dbz;        
                btotal3=btax3+dbz;
                System.out.println("------BILL------");
                System.out.println("################");
                System.out.println("Your Subtotal Rs."+dbz);
                System.out.println("The Tax Added is Rs."+btax3);
                System.out.println("Your Total Amount Rs."+btotal3);
                new Bill().addressforpayment();
            }
    
            void bills4(int c)// Bill Method for Souvenirs
            {   

                double btotal4, col=0.0, btax4;
                if(c==1)
                col=450;
                else if(c==2)
                col=1000;
                else if(c==3)
                col=1500;
                System.out.println("Please Enter the quantity");
                qty=sc.nextInt();
                col*=qty;
                btax4=0.13*col;        
                btotal4=btax4+col;
                System.out.println("------BILL------");
                System.out.println("################");
                System.out.println("Your Subtotal Rs."+col);
                System.out.println("The Tax Added is Rs."+btax4);
                System.out.println("Your Total Amount Rs."+btotal4);
                new Bill().addressforpayment();
            }
    
            void addressforpayment()
            {
       
                System.out.print("*Name\t");
                String name= sc.nextLine();
                System.out.println("\n");
                System.out.print("*Address Line 1\t");
                String ad1= sc.nextLine();
                System.out.print("*Address Line 2\t");
                String ad2= sc.nextLine();
                System.out.println("\n");
                System.out.print("*Contact No.\t" );
                String number=sc.nextLine();
                System.out.println("\n");
                System.out.println("Thank You For Shopping With Us Your Product Will Be Delivered Within 3-4 Days");
                System.out.println("\n");
                new Bill().wanttocontinue();
            }
            
            void wanttocontinue()
            {
                System.out.println("Do You Wish to Continue Shopping");
                System.out.println("\n");
                System.out.println("If Yes Press Y");
                System.out.println("Else Press N");
                char accept=sc.next().charAt(0);
                if (accept=='y')
                {
                    new AB().main({"","",""});
                    System.out.println("\n");
                }
                else
                {
                    System.out.println("Thank You Do Viist Again");
                    System.exit(0);
                }
            }
        }