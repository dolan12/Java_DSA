public class subtreeLie{
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

    public static boolean isIdentical(Node node,Node subRoot)
    {
        if(node==null&&subRoot==null)
        return true;
        if(node==null||subRoot==null||(node.data!=subRoot.data))
        return false;

        if(!isIdentical(node.left,subRoot.left))
        return  false;
        
        if(!isIdentical(node.right,subRoot.right))
        return  false;
        return true;

    }
    public static boolean checkLie(Node root,Node subRoot)
    {
        if(root==null)
        return false;
        if(root.data==subRoot.data)
        {
            if(isIdentical(root,subRoot)==true)
            return true;
        }
        return checkLie(root.left,subRoot)||checkLie(root.right,subRoot);
    }
    public static void main(String args[])
    {
        //tree
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        //subtree
        Node subRoot=new Node(3);
        subRoot.left=new Node(6);
        subRoot.right=new Node(7);

        System.out.println(checkLie(root,subRoot));

    }
}