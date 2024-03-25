public class FractionalKnaapsack{
    public static void main(String args[])
    {
        int weight[]={10,20,30};
        int val[]={60,100, 120};
        int w=50;
        float ans=0;
        float ratio[]=new float[val.length];
        for(int i=0;i<weight.length;i++)
        {
            ratio[i]=val[i]/weight[i];

        }
        //sort


        //cal value
        for(int i=0;i<ratio.length;i++)
        {
            if(w>=weight[i])
                {ans+=val[i];
                w-=weight[i];}
            else
           {
            ans+=w*ratio[i];
            w=0;
            break;}

        }
        System.out.println(ans);
    }
}