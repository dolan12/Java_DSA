import java.util.*;
public class topView {
    static class Node{
        Node left,right;
        int data;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class Info{
        int hd;
        Node node;
        Info(Node node,int hd)
        {
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root)
    {
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;//to print elements from left to right
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty())
        {
            Info curr=q.remove();
            if(curr==null)
            {
                System.out.println();
                if(q.isEmpty())
                break;
                q.add(null);
            }
            else{
                if(!map.containsKey(curr.hd)){//if hd is appearing for the first time
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null)
                {
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);//left child's hd=curr.hd-1
                }
                if(curr.node.right!=null)
                {
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);//right child's hd=curr.hd+1
                }
            }
        }
        for(int i=min;i<=max;i++)
        {
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        topView(root);
    }
    
}