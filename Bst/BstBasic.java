import java.util.*;
public class BstBasic {
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node insertArr(Node root,int val)
    {   
        if(root==null)
        {   Node newNode=new Node(val);
            return newNode;
        }
        if(root.data>val)
        {
            root.left=insertArr(root.left,val);//as this method returns the root of the tree
        }
        if(root.data<val)
        {
            root.right=insertArr(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        return false;

        if(root.data==key)
        return true;

        if(root.data>key)
        {
            return search(root.left,key);
        }
       else
            return search(root.right,key);
        
    }
    public static Node inorderSucc(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    public static Node delete(Node root,int val)
    {
        if(root.data>val)
        {
            root.left=delete(root.left,val);
        }
        else if(root.data<val)
        root.right=delete(root.right,val);
        else//if(root.data==val)
        {
            if(root.left==null&&root.right==null)
                return null;
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left; 

                //case 3- both children
                Node Is=inorderSucc(root.right);
                root.data=Is.data;
                root.right=delete(root.right,Is.data);
           
        }
        return root;
    }
    public static void printInRange(Node node,int n1,int n2)
    {   
        if(node==null)
        return;
        if(node.data>=n1&&node.data<=n2)
        {
            printInRange(node.left,n1,n2);
            System.out.print(node.data+" ");
            printInRange(node.right,n1,n2);
        }
        else if(node.data<n1)
        {
            printInRange(node.right,n1,n2);
        }
        else
        printInRange(node.left,n1,n2);
    }

    public static void printPathToLeaf(Node node,ArrayList<Integer> list)
    {
        if(node==null)
        return;

        list.add(node.data);
        if(node.right==null&&node.left==null)
        {
            for(int i=0;i<list.size();i++)
            {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
        }
        
        printPathToLeaf(node.left,list);
        printPathToLeaf(node.right,list);
        list.remove(list.size()-1);
    }
    
    public static boolean isValid(Node root,Node min,Node max)
    {
        if(root==null)
        return true;
        if(min!=null&&root.data<=min.data)//invalid
        return false;
        else if(max!=null&& root.data>=max.data)//invalid
        return false;
        return isValid(root.left,min,root) && isValid(root.right,root,max);
    }
    public static void mirror(Node root)
    {   if(root==null)
        return;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
    public static Node createMirror2(Node root)
    {
        if(root==null)
        return null;
        Node leftMirror=createMirror2(root.left);
        Node rightMirror=createMirror2(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void main(String args[])
    {
        // int arr[]={5,9,3,2,7,1,6,10,4,8};
        // Node root=null;
        // for(int i=0;i<arr.length;i++)
        // {
        //   root=insertArr(root,arr[i]);//make a bst
        // }
        // inorder(root);

        // System.out.println(search(root,11));

        // root=delete(root,3);
        // inorder(root);
        
        //print all the nodes in the range(including the range)
        // printInRange(root,3,7);

        //root to leaf path print
        // printPathToLeaf(root,new ArrayList<>() );

        //validate the bst
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        // System.out.println(isValid(root,null,null));

        //Mirror a bst
        // mirror(root);//approach 1 
        //approach 2
        createMirror2(root);
        // printNode(root);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
    }
}