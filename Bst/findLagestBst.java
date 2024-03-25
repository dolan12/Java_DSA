public class findLagestBst{
    static class node{
        int data;
        node left,right;
        node(int data){
            this.data=data; 
        }
    }
    static class Info{
    boolean isBst;
    int max;
    int min;
    int size;
    Info(boolean isBst,int size,int min ,int max)
    {
        this.isBst=isBst;
        this.size=size;
        this.min=min;
        this.max=max;
    }
}
    public static Info find_LargestBst(node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info left=find_LargestBst(root.left);
        Info right=find_LargestBst(root.right);
        boolean isValid=left.max<root.data && right.min>root.data;//condition of invalid
        int size=left.size+right.size+1;
        int min=Math.min(right.min,Math.min(root.data,left.min));
        int max=Math.max(root.data,Math.max(left.max,right.max));
        Info main=new Info(isValid,size,min,max);
        if(main.isBst&&ans.size<main.size ){
            ans=main;
        }
    return main;


    }
    static Info ans=new Info(true,0,0,0);
    public static void main(String args[])
    {
        // node root=new node(2);
        // root.left=new node(3);
        // root.right=new node(4);
        // root.right.left=new node(1);
        // root.right.right=new node(5);
        // root.right.right.right=new node(6);
        node root=new node(50);
        root.left=new node(30);
        root.left.left=new node(5);
        root.left.right=new node(20);
        root.right=new node(60);
        root.right.left=new node(45);
        root.right.right=new node(70);
        root.right.right.right=new node(80);
        root.right.right.left=new node(65);
        find_LargestBst(root);
        System.out.println("max size of possible bst is :"+ans.size);
        
    }
}