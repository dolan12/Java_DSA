public class stockbuy{
    public static void calprofit(int price[])
    {   int maxprofit=0;
        int currprofit=0,buyprice=Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++)
        {
            if(buyprice<price[i])
            {currprofit=price[i]-buyprice;
            maxprofit=Math.max(maxprofit,currprofit);}
            else 
            buyprice=price[i];
        }
       System.out.println(maxprofit);
    }
    public static void main (String args[])
    {
        int price[]={7,1,5,3,6,4};
        calprofit(price);
    }
}