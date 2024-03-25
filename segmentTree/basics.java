public class basics{
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static int buildST(int arr[],int i, int start,int end){
        if(start==end){
            tree[i]=arr[start];
            return arr[start];
        }

        int mid=(start+end)/2;
        buildST(arr,2*i+1,start,mid);//left subtree
        buildST(arr,2*i+2,mid+1,end);//right subtree
        tree[i]=tree[2*i+1]+tree[2*i+2];//as paren node will be the sum of both the child node
        return tree[i];
    }

    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        if(qj<=si || qi>=sj)//non Overlapping
            return 0;
        else if(si>=qi && sj<=qj){
            return tree[i];
        }else{
            int mid=(si+sj)/2;
            int left=getSumUtil(2*i+1,si,mid,qi,qj);
            int right=getSumUtil(2*i+2,mid+1,sj,qi,qj);
            return left+right;
        }
    }
    //QUERY on ST
    public static int getSum(int arr[],int qi,int qj){
        int n=arr.length;
        return getSumUtil(0,0,n-1,qi,qj);
    }
    
    //updation
    public static void UpdateSTUtil(int i,int si,int sj, int idx,int diff){
        if(idx>sj || idx<si){
            return;
        }

        tree[i]+=diff;
        if(si!=sj){//non-leaf
            int mid=(si+sj)/2;
            UpdateSTUtil(2*i+1,si,mid,idx,diff);//left 
            UpdateSTUtil(2*i+2,mid+1,sj,idx,diff);//right
        }
    }
    public static void UpdateST(int arr[],int idx,int newVAl){
        int n=arr.length;
        int diff=newVAl-arr[idx];
        arr[idx]=newVAl;
        UpdateSTUtil(0,0,n-1,idx,diff);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        System.out.println(buildST(arr,0,0,n-1));
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        System.out.println(getSum(arr,2,5));//before updation
        
        UpdateST(arr,2,2);
        System.out.println("after updation : "+getSum(arr,2,5));//before updation

    }
}