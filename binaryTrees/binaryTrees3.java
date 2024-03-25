import java.util.*;
public class binaryTrees3{
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void kthLevel(Node root,int level,int key)
    {
        if(root==null)
        return;
        if(level==key)
        {System.out.print(root.data+" ");
        return;
        }
        kthLevel(root.left,level+1,key);
        kthLevel(root.right,level+1,key);
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path)
    {
        if(root==null)
        return false;

        path.add(root);
        
        if(root.data==n)
        {
            return true;
        }
        boolean foundLeft=getPath(root.left,n,path);
        boolean foundRight=getPath(root.right,n,path);
        if(foundLeft||foundRight)
        return true;
        path.remove(path.size()-1);
        return false;
    }
    //Tc=O(n^2)
    public static Node findLca(Node root,int n1,int n2)
    {
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //least common ancestors
        int i=0;
        for(;i<path1.size()&& i<path2.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            break;
        }
        Node lca=path1.get(i-1);
        return lca;
    }

    //Tc=O(n)
    public static Node lca2(Node root,int n1,int n2)
    {
        if(root==null||root.data==n1||root.data==n2)
        return root;

        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);
        //leftLca= val &rightLca=null
        if(rightLca==null)
        return leftLca;
        //rightLcaa=val & leftLca=null
        if(leftLca==null)
        return rightLca;

        return root;//leftlca=val &rightlca=val

    }
    public static int distance(Node lca,int n)
    {   if(lca==null)
        return -1;

        if(lca.data==n)
        return 0;
        
        int left=distance(lca.left,n);
        int right=distance(lca.right,n);
        if(left==-1 && right==-1)
        return -1;
        else if(left==-1)
        return right+1;
        else
        return left+1;
    }
    public static int findMinDistance(Node root,int n1,int n2)
    {
        Node lca=lca2(root,n1,n2);
        int leftDist=distance(lca,n1);
        int rightDist=distance(lca,n2);
        return leftDist+rightDist;
        
    }
    public static int findkthAncestor(Node root,int data,int k)
    {
        if(root==null)
        return -1;
        if(root.data==data)
        return 0;
        int left=findkthAncestor(root.left,data,k);
        int right=findkthAncestor(root.right,data,k);
        if(left==-1 && right==-1)
        return -1;
        int max=Math.max(left,right);//previous Node order
        if(max+1==k)//if curr Node Order same as the given order
        System.out.println(root.data);
        return max+1;//current Node order
    }

    public static int sumTree(Node root)
    {
        if(root==null)
        return 0;
        int leftChild=sumTree(root.left);
        int rightChild=sumTree(root.right);
        int data=root.data;

        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;
        root.data=newLeft+leftChild+newRight+rightChild;
        return data;

    }

    public static void printTree(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {   System.out.println();
                if(q.isEmpty())
                break;
                q.add(null);
            }
            else
            {   System.out.print(curr.data+" ");
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
        }
    }
    public static void main(String args[])
    {  /*        1
               /  \
              2    3
             / \  / \
            4   5 6  7
        */

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        //print the all nodes in the given level
        // kthLevel(root,1,2);//root is the level 1

        // Lowest common ancestors
        // System.out.print(findLca(root,4,5).data+" ");

        //approach 2
        // System.out.print(lca2(root,4,6).data);

        // min distance of two Nodes
        // System.out.println("Total distance : "+(findMinDistance(root,4,6)));
        //k'th Incestors of a Node 
        // findkthAncestor(root,4,2);

        //Transform to a sum tree

        sumTree(root);
        printTree(root);
        
    }
}