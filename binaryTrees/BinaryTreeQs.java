import java.util.*;
public class BinaryTreeQs{
    static class Node{
            int data;
            Node right,left;
            Node(int data)
            {
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        public static boolean findUnivalued(Node root,int data)
        {
            if(root==null)
            return true;
            if(root.data!=data)
            return false;
            boolean left=findUnivalued(root.left,data);
            boolean right=findUnivalued(root.right,data);
            return left&&right;
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
        public static void deleteLeaf(Node root,int x)
        {   if(root==null)
            return;
            if(root.left!=null&&root.left.data==x)
            {if(root.left.left==null&&root.left.right==null)
                root.left=null;}
            if(root.right!=null&&root.right.data==x)
            {if(root.right.left==null&&root.right.right==null)
                root.right=null;
            }
            deleteLeaf(root.left,x);
            deleteLeaf(root.right,x);
        }
        
        public static Node mirror(Node node)
        {
            if(node ==null)
                return node;
                Node left=mirror(node.left);
                Node right=mirror(node.right);

                //swap
                node.left=right;
                node.right=left;
                return node;
        }
        public static String inorder(Node node)
        {
            if(node==null)
            return "";
            String str="(";
            str+=inorder(node.left);
            str+=Integer.toString(node.data);
            str+=inorder(node.right);
            str+=")";
            if(m.get(str)!=null&&m.get(str)==1)
                System.out.print(node.data+" ");
            if(m.containsKey(str))
                m.put(str,m.get(str)+1);
            else
                m.put(str,1);

            return str;

        }
        static HashMap<String,Integer> m;
        public static void printAllDups(Node root)
        {
             m=new HashMap<>();
            inorder(root); 
        }
        static int n=Integer.MIN_VALUE;
        public static int  findMaxSum(Node node)
        {
            
            findMaxUtil(node,n);
            return n;
        }
        public static int findMaxUtil(Node node,int n)
        {
            if(node==null)
            return 0;
            int l=findMaxUtil(node.left,n);
            int r=findMaxUtil(node.right,n);
            int max_single=Math.max(Math.max(l,r)+node.data,node.data);
            int max_top=Math.max(max_single,l+r+node.data);
            n=Math.max(n,max_top);
            return max_single;
        }
        public static void main(String args[])
        {
            // Node root=new Node(2);
            // root.left=new Node(2);
            // root.right=new Node(2);
            // root.right.left=new Node(2);
            // root.right.right=new Node(2);
            //check if a binary tree is unvalued or not
            // System.out.println("univalued : "+findUnivalued(root,root.data));


            //2
            //invert binary tree (mirror)
            // Node root=new Node(1);
            // root.left=new Node(2);
            // root.right=new Node(3);
            // root.left.left=new Node(4);
            // root.left.right=new Node(5);
            // root.right.left=new Node(6);
            // root.right.right=new Node(7);
            // mirror(root);
            // printTree(root);
            //3
            //delete the leaf nodes with the given value
            // Node root3=new Node(1);
            // root3.left=new Node(3);
            // root3.left.left=new Node(3);
            // root3.left.right=new Node(2);
            // root3.right=new Node(3);
            // deleteLeaf(root3,3);
            // printTree(root3);

            //4
            //print all duplicate subtrees
            // Node root=new Node(1);
            // root.left=new Node(2);
            // root.right=new Node(3);
            // root.left.left=new Node(4);
            // root.left.right=new Node(5);
            // root.right.left=new Node(2);
            // root.right.left.left=new Node(4);
            // root.right.right=new Node(4);
            // printAllDups(root);
            //5
            //maximum path sum in binary tree
            Node root=new Node(10);
            root.left=new Node(2);
            root.right=new Node(10);
            root.left.left=new Node(20);
            root.left.right=new Node(1);
            root.right.right=new Node(-25);
            root.right.right.left=new Node(3);
            root.right.right.right=new Node(4);
            System.out.println("maximum path sum is :"+findMaxSum(root));



        }
    
}