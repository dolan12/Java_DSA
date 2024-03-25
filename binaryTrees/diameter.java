public class diameter{
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

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int arr[])
        {   idx++;
            if(arr[idx]==-1)
            return null;
            Node newNode=new Node(arr[idx]);
            newNode.left=buildTree(arr);
            newNode.right=buildTree(arr);
            return newNode;
        }

    }

    public static int height(Node root)
    {
        if(root==null)
        return 0;
        int lheight=height(root.left);
        int rheight=height(root.right);
        return Math.max(lheight,rheight)+1;
    }
    //approach 1 to find diameter 
    // TC =O(n^2)
    public static int findDiameter(Node root)
    {
        if(root==null)
        return 0;
        int ldiam=findDiameter(root.left);
        int rdiam=findDiameter(root.right);
        int lheight=height(root.left);
        int rheight=height(root.right);
        return Math.max((lheight+rheight+1),Math.max(ldiam,rdiam));
    }

    //approach 2 to find diameter of a Binary tree
    //TC=O(n)
    static class Info{
        int height,diam;
        public Info(int diam,int h)
        {
            this.diam=diam;
            height=h;
        }
        }
        public static Info diameter2(Node root)
        {   if(root==null)
            return new Info(0,0);
            Info leftinfo=diameter2(root.left);
            Info rightInfo=diameter2(root.right);
            int diam=Math.max(Math.max(leftinfo.diam,rightInfo.diam),(leftinfo.height+rightInfo.height+1));
            int ht=Math.max(leftinfo.height,rightInfo.height)+1;
            return new Info(diam,ht);
        }
    
    
    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree trees=new BinaryTree();
        // Node root=trees.buildTree(nodes);
        // System.out.println("diameter using approach 1 :"+findDiameter(root));

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        System.out.println("diam : "+ diameter2(root).diam);
        System.out.println("height : "+ diameter2(root).height);

    }
}