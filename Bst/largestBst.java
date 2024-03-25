public class largestBst{
    static class Bst{
        Bst left;
        Bst right;
        int data;
        Bst(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class Info{
        boolean isBst;
        int size,min,max;
        Info(boolean isBst,int size,int min,int max){
            this.isBst=isBst;
            this.size=size; 
            this.min=min;
            this.max=max;
        }
    }
    public static int maxBst=0;
    public static Info largestBst(Bst root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo=largestBst(root.left);
        Info rightInfo=largestBst(root.right);
        int size=leftInfo.size+rightInfo.size+1;
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        if(root.data<=leftInfo.max||root.data>=rightInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBst&&rightInfo.isBst){
            maxBst=Math.max(maxBst,size);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }
    public static void main(String args[]){
        Bst root=new Bst(50);
        root.left=new Bst(30);
        root.left.left=new Bst(5);
        root.left.right=new Bst(20);
        root.right=new Bst(60);
        root.right.left=new Bst(45);
        root.right.right=new Bst(70);
        root.right.right.right=new Bst(80);
        root.right.right.left=new Bst(65);

        Info info=largestBst(root);
        System.out.println("largest Bst size : "+maxBst);

    }
}