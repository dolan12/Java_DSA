import java.util.*;
public class heapBasics{
    static class Heap{
        ArrayList<Integer> list=new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }

        public void add(int data){
            //add
            list.add(data);
            int x=list.size()-1;//x is a child index
            int par=(x-1)/2;//parent Index
            while(list.get(x)<list.get(par)){//as we are creating a min Heap
                //swap
                int temp=list.get(x);
                list.set(x,list.get(par));
                list.set(par,temp);

                //update
                x=par;
                par=(x-1)/2;
                }
            }
        public int peek(){
            return list.get(0);
        }


        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            if(left<list.size()&& list.get(minIdx)>list.get(left)){
                minIdx=left;
            }
            if(right<list.size()&& list.get(minIdx)>list.get(right)){
                minIdx=right;
            }
            if(minIdx!=i){//if this is not a heap
                //swap
                int temp=list.get(i);
                list.set(i,list.get(minIdx));
                list.set(minIdx,temp);

                heapify(minIdx);// as the root val is now in the minIdx 
            }
        }
        public int remove(){
            int data=list.get(0);
            //swap first and last
            int temp=list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1,temp);

            //delete the last
            list.remove(list.size()-1);

            //heapify
            heapify(0);
            return data;//deleted value
        }
    }
    
    public static void main(String args[]){
         Heap h=new Heap();
         h.add(3); 
         h.add(4);
         h.add(2);
         h.add(1);
         while(!h.isEmpty()){
            System.out.print(h.remove()+" ");
         }
    }
}