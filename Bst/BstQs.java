import java.util.*;
public class BstQs{
    static class Node {
        int data;
        Node left,right;
        Node (int data){
            this.data=data;
        }
    }
 
    public static Node ans;
    public static Node findClosestNode(Node root,int key,int prev){
        if(root==null)
        return null;
        if(Math.abs(root.data-key)<prev){
            ans=root;
            prev=Math.abs(root.data-key);
        }
        if(key>root.data)//right 
        {   
            findClosestNode(root.right,key,prev);
        }
        else{
            findClosestNode(root.left,key,prev);
        }
        return ans;
    }
    public static void inorder(Node root,ArrayList<Integer> list){
        if(root==null)
        return ;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static int kthSmallestElem(Node root,int k){
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list.get(list.size()-k);
    }
    static int sum=0;
    public static int sumInRAnge(Node root,int low,int high){
        
        if(root==null)
        return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr.data>=low && curr.data<=high){
                sum+=curr.data;
            }
            if(curr.left!=null && curr.data>low)
            q.add(curr.left);
            if(curr.right!=null && curr.data<high)
            q.add(curr.right);
        }
        return sum;
    }
    static Node root1;
    static Node root2;
    public static int countPairs(Node root1,Node root2,int x){
        if(root1==null || root2==null)
        return 0;
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        Node top1,top2;
        int count =0;
        while(true){
            while(root1!=null){
                st1.push(root1);
                root1=root1.left;
            }
            while(root2!=null){
                st2.push(root2);
                root2=root2.right;
            }
            if(st1.empty()||st2.empty())
            break;

            top1=st1.peek();
            top2=st2.peek();
            if((top1.data+top2.data)==x){
                count++;
                st1.pop();
                st2.pop();
                root1=top1.right;
                root2=top2.left;
            }
            else if((top1.data+top2.data)<x){
                st1.pop();
                root1=top1.right;
            }
            else{
                st2.pop();
                root2=top2.left;
            } 
        }
        return count;
    }
    public static void main(String args[]){
        Node root=new Node (10);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(11); 
        root.right.right=new Node(20);
        //find Nodes in the range of 

        // 2
        //find the closest element in binary search tree
        
        // ans=root;
        findClosestNode(root,4,Integer.MAX_VALUE);
        // System.out.println(ans.data);

        //3 
        // k'th smallest element in bst
        // System.out.println(kthSmallestElem(root,3));
        //1
        //find the sum of Nodes which are in the range
        int l=3,r=5;
        // System.out.println(sumInRAnge(root,l,r));

        //4 
        //two sum Bst
        root1=new Node(5);
        root1.left=new Node(3);
        root1.left.left=new Node(2);
        root1.left.right=new Node(4);
        root1.right=new Node(7);
        root1.right.left=new Node(6);
        root1.right.right=new Node(8);

        root2=new Node(10);
        root.left=new Node(6);
        root.left.left=new Node(3);
        root.left.right=new Node(8);
        root2.right=new Node(15);
        root.right.right=new Node(18);
        root.right.left=new Node(11);
        int x=16;
        System.out.println(countPairs(root1,root2,x));


        
        
    }
}