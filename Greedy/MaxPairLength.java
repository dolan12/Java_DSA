import java.util.*;
public class MaxPairLength{
    public static void main(String args[])
    {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        //add the first pair to the chain
        int chainLen=1;
        int lastSecondNum=pairs[0][1];
        for(int i=1;i<pairs.length;i++)
        {
            if(lastSecondNum<pairs[i][0])
            {
                chainLen++;
                lastSecondNum=pairs[i][1];
            }
        }
        System.out.println("Max possible chain length :"+chainLen);
    }
}