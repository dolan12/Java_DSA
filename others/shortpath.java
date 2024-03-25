//given a path (north,south,east,west).after reaching the destination cal. the shortest distance
public class shortpath{
    public static float getshortestpath (String path)
    {   int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {   int n=path.charAt(i);
            if(n=='N')
            y++;
            else if (n=='S')
            y--;
            else if(n=='E')
            x++;
            else
            x--;
        }
        //shortest path =sqrt(pow((x2-x1),2)+pow((y2-y1),2 ));
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static void main (String args[])
    {
        String path="WNEENESENNN";
        System.out.println(getshortestpath(path));
    }
    }
