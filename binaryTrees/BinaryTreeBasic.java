import java.util.*;
public class BinaryTreeBasic{
    static class Node{
        Node right,left;
        int data;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    static class BinaryTrees
    {   static int idx=-1;
        public static Node buildTree(int arr[])
        {
            idx++;
            if(arr[idx]==-1)
            return null;
            Node newNode=new Node(arr[idx]);
            newNode.left=buildTree(arr);//assign the left subtree first
            newNode.right=buildTree(arr);////then assign the right subtree
            return newNode;
        }
    }

    public static void preOrder(Node root)
    {
        if(root==null)//don't print -1 in the place of null
        return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root)
    {
        if(root==null)//don't print -1 in the place of null
        return;
        
        postOrder(root.left);//left
        postOrder(root.right);//right
        System.out.print(root.data+" ");//root
    }

    public static void levelOrder(Node root)
    {
        if(root==null)//check if there is NO tree exist
        return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);//as here should be one new line
        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            
            if(currNode==null)
            {   System.out.println();
                if(q.isEmpty())
                break;
                else
                q.add(null);
            }
            else
            {   
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                {  
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int findHeight(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=findHeight(root.left);
        int rh=findHeight(root.right);
        int height=Math.max(lh,rh)+1;
        return height;
    }

    public static int countNodes(Node root)
    {
        if(root==null)
        return 0;
        int lCount=countNodes(root.left);
        int rCount=countNodes(root.right);
        int totCount=lCount+rCount+1;//+1 because we have to count the root Node also
        return totCount;
    }
    public static void main(String args[])
    {
        int preOrder[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees tree=new BinaryTrees();
        Node root=tree.buildTree(preOrder);
        // System.out.println(root.data);

        //print the preorder of the tree

        // preOrder(root);
        postOrder(root);

        //LEVEL ORDER
        // levelOrder(root);

        //calculate the height
        // System.out.println("height : "+findHeight(root));
        // System.out.println("total no of Nodes is : "+ countNodes(root));

    }
}