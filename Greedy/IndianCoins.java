import java.util.*;
public class IndianCoins{
    public static void main(String args[])
    {
        Integer coins[]={1,2,5,10,20,50,100,200,500,1000,2000};
        //to use this below property we have to use Integer class object
        Arrays.sort(coins,Comparator.reverseOrder());
        int countOfCoins=0;
        int amount=590;//amount to be paid
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++)
        {   if(amount==0)
            break;
            
            while(coins[i]<=amount)
            {
                amount-=coins[i];
                countOfCoins++;
                ans.add(coins[i]);
            }
        }
        System.out.println("total coins needed : " +countOfCoins);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
        
    }
}