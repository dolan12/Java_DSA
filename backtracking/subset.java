//program to print substring 
public class subset{
    public static void find_subset(String str,int i,StringBuilder subset){
        if(i==(str.length())){
            if(subset.length()==0)
            System.out.println("null");
            else
            {System.out.println(subset);
            subset.deleteCharAt(subset.length()-1);}
            return;
        }
        find_subset(str,i+1,subset.append(str.charAt(i)));//yes
        find_subset(str,i+1,subset);//no
    }
    public static void main(String args[]){
        String str="abc";
        find_subset(str,0,new StringBuilder(""));
    }
}