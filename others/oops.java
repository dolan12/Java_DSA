public class oops{

    public static void main(String args[])
    {
        pen p1=new pen();//created a pen object called p1
        p1.setColor("blue");//or p1.color=blue;
        System.out.println(p1.color);//process to access attributes
        p1.setTip( 5);
        System.out.println(p1.tip);

        BankAccount myAcc=new BankAccount();//created new bankaccount object
        myAcc.username="Dolan Dhara";
        //myAcc.password= "abcd";//shows error because password attribute is private
        myAcc.setPassword("abcdef");
        // System.out.println(myAcc.password);//although we can change the password but we can't access the password.for that we need a getter

        //object made with usermade constructor
        student s1=new student("dolan");
        s1.roll=223025;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=80;
        s1.marks[2]=90;
        
        student s2=new student(s1);
        s2.password="abcde";
        s1.marks[2]=60;//notice how change in s1 can affect s2 also
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]+" ");
        }



        

    }
}
class pen{
    String color;
    int tip;
    void setColor(String newcolor)
    {
        color= newcolor;
    }
    void setTip(int newTip)
    {
        tip=newTip;
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd)//as this function is public we can chenge the password but can't accces it
    {
        password=pwd;
    }
}

class student{
    String name;
    int roll;
    String password;
    int marks[];
    //constructor
    student(String name)
    {   
        //anything we can code
        // System.out.println("the initialization is done:");
        this.name=name;//FOR initialization
        marks=new int [3];
    }
    //copy constructur
    //shallow copy constructor
    // student(student s3)
    // {   
    //     this.name=s3.name;
    //     this.roll=s3.roll;
    //     marks=new int [3];
    //     this.marks=s3.marks;
    // }
    
    //deep copy constructor
    student(student s3)
    {
        this.name=s3.name;
        this.roll=s3.roll;
        marks=new int[3];
        for(int i=0;i<marks.length;i++)
        {
            this.marks[i]=s3.marks[i]; 
        }
    }
   
   
}