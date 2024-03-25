//print all binary string of size N without consecutive ones
public class printBinStrings{
    public static void printstrings(int n ,int lastPlace,String shahid){
        //base case
        if(n==0){
            System.out.println(shahid);
            return;
        }
        //work
        printstrings(n-1,0,shahid+"0");

        if(lastPlace==0){
            printstrings(n-1,1,shahid+"1");
        }

    }
    public static void main(String args[])
    {
        printstrings(3,0,"");
    }
}