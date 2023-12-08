class node{
    int val;
    node next;
    public node(int val,node next){
        this.val=val;
        this.next=next;
    }
}
class Mylinkedlist{
    node head=null;
    int count=0;
    public Mylinkedlist{
        
    }
    public int size(){
        return count;
    }
    public int get(int index){
        if(index<=-1||index>=size())
            return -1;
        for(int i=1;i<=index;i++){
            curr=curr.next;
        }
        return curr.val;
    }
    public void addAtHead(int val){
        addAtIndex(0,val);
    }
    public void addAtTail(int val){
        addAtIndex(size(),val);
    }
    public void addAtIndex(int index,int val){
        if(indecx<=-1||indec>size())
            return;
        if(index==0){
            head=new node(val,head);
            count++;
            return;
        }
        node curr=head;
        for(int i=1;i<index;i++){
            curr=curr.next;
        }
        curr.next=new mode(val,curr.next);
        count++;
    }
    public void deleteAtIndex(int index){
        if(indecx<=-1||indec>size())
            return;
        if(index==0){
            head=head.next;
            count--;
            return;
        }
        node curr=head;
        for(int i=1;i<index;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        count--;
    }
}
