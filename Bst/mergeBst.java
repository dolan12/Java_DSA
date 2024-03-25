import java.util.*;
public class mergeBst{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }

    }
    public static Node balancedBst(ArrayList<Integer> list ,int st,int end){
        if(st>end)
        return null;
        int mid=(st+end)/2;
        Node root=new Node(list.get(mid));
        root.left=balancedBst(list,st,mid-1);
        root.right=balancedBst(list,mid+1,end);
        return root;
    }
    public static void inorder(ArrayList<Integer> list,Node root){
        if(root==null)
        return;
        inorder(list,root.left);
        list.add(root.data);
        inorder(list,root.right);
    }
    public static void preorder(Node root){
        if(root==null)
        return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node getAns(Node root1,Node root2){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        inorder(list1,root1);
        inorder(list2,root2);
        //merge
        int i=0,j=0;
        ArrayList<Integer> list3=new ArrayList<>();
        while(i<list1.size()&&j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                list3.add(list1.get(i));
                i++;
            }
            else{
                list3.add(list2.get(j));
                j++;
            }
            
        }
        while(i<list1.size()){
            list3.add(list1.get(i));i++;
            
        }
        while(j<list2.size()){
        list3.add(list2.get(j));j++;
          
        }

        return balancedBst(list3,0,list3.size()-1);
    }
    public static void main(String args[]){
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        Node ans=getAns(root1,root2);
        preorder(ans);

    }
}