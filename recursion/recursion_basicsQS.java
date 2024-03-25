public class recursion_basicsQS{
    public static void occurence_print(int arr[],int idx,int key){
        if(idx==arr.length)
        return;
        //check in curr index
            if(arr[idx]==key)
        System.out.print(idx+" ");
        occurence_print(arr,idx+1,key);

    }
    //digit to number
    public static  String digitToNumber(int n,StringBuilder str){
        if(n==0)
        return str.toString();//converting to string 
        int currnum=n%10;
        digitToNumber(n/10,str);
        switch (currnum)
        {case 0:
           { 
            str.append(" zero");
            break;}
        case 1:
            {
            str.append(" one");
            break;}
        case 2:
            {
            str.append(" two");
            break;}
        case 3:
            {
            str.append(" three");
            break;}
        case 4:
             {
            str.append(" four");
            break;}
        case 5:
            {
            str.append(" five");
            break;}
        case 6:
            {
            str.append(" six");
            break;}
        case 7:
          { 
            str.append(" seven");
            break;}
        case 8:
            {
            str.append(" eight");
            break;}
        case 9:
            {
            str.append(" nine");
            break;}
            }
        return str.toString();//converting to string
    }

    public static int stringLength(String str)
    {
        if(str.length()==0)
        return 0;

        //str.substring(1) means return the string without the 0'th index char
        return stringLength(str.substring(1))+1;
    }

    // public static int count_substring(String str,int idx,char key)
    // {
    //     if(str.charAt(i).equals(key) )
    // }
    public static void  main(String args[]){
        // int arr[]={3,2,4,5,6,2,7,2,2};
        // occurence_print(arr,0,2);

        System.out.println(digitToNumber(1974,new StringBuilder("")));


        // System.out.println(stringLength("abcdef"));
    }
}