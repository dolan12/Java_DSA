import java.util.*;
public class bst2{
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void preorder(Node root)
    {
        if(root==null)
        return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBst(int arr[],int st,int end)
    {
        if(st>end)
        return null;
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBst(arr,st,mid-1);
        root.right=createBst(arr,mid+1,end);
        return root;
    }
    public static Node createBst2(ArrayList<Integer> list,int st,int end)
    {
        if(st>end)
        return null;
        int mid=(st+end)/2;
        Node root=new Node(list.get(mid));
        root.left=createBst2(list,st,mid-1);
        root.right=createBst2(list,mid+1,end);
        return root;
    }
    public static void getinOrder(Node root,ArrayList<Integer> list)
    {
        if(root==null)
        return;
        getinOrder(root.left,list);
        list.add(root.data);
        getinOrder(root.right,list);
        
    }
    public static Node balancedBst(Node root)
    {
        ArrayList list=new ArrayList<>();
        getinOrder(root,list);

        return createBst2(list,0,list.size()-1);
    }
    public static void main(String args[])
    {
        //sorted array to Balanced bst
        // int arr[]={3,5,6,8,10,11,12};
        // Node root=createBst(arr,0,arr.length-1);
        // preorder(root);

        //make a bst balanced
        //Tc=O(n)
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);

        root=balancedBst(root);
        preorder(root);
    }
}