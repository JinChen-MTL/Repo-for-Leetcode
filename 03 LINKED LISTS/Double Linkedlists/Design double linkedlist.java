class ListNode{
    int val;
    ListNode prev;
    ListNode next;
  
    public ListNode(int val){
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
class MyLinkedList{
    int size;
    ListNode head;
    ListNode tail;
    public MyLinkedList(){
        head = null;
        tail = null;
        size = -1;
    }
    public int get(int index){
        if(index > size || index < 0 || size < 0)
            return -1;
        if(index == 0 && size == 0)
            return head.val;
        if(index == size)
            return tail.val;

        ListNode curr = head;
        int pos = 0;
        while(curr != null && pos < index){
            curr = curr.next;
            pos++;
        }
        return curr.val;
    }
    public void addAtHead(int val){
        if(head == null){
            ListNode temp = new ListNode(val);
            head = temp;
            tail = temp;
            size++;
        }
        else
        {
            ListNode temp = new ListNode(val);
            temp.next = head;
            head.prev = temp;
            head = temp;
            size++;
        }
    }
    public void addAtTail(int val){
        if(size == -1){
            ListNode temp = new ListNode(val);
            head = temp;
            tail = temp;
            size++;
        }
        else
        {
            ListNode temp = new ListNode(val);
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
            size++;
        }
    }
    public void addAtIndex(int index, int val){
        if(index < 0){
            return;
        }
        else if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            ListNode temp = new ListNode(val);
            temp.next = tail;
            temp.prev = tail.prev;
            tail.prev.next = temp;
            tail.prev = temp;
            size++;
        } 
        else if (index == (size + 1)){
            addAtTail(val);
        }
        else if(index > (size + 1)){
            return;
        }
        else{
            int pos = 0;
            ListNode curr = head;
            while(curr != null && pos < index){
                curr = curr.next;
                pos++;
            }
            ListNode temp = new ListNode(val);
            temp.prev = curr.prev;
            temp.next = curr;
            curr.prev.next = temp;
            curr.prev = temp;
            size++;
        }
    }
    public void deleteAtIndex(int index){
        if(index < 0){
            head = null;
            tail = null;
        }   
        else if(index == 0 && size == 0){
            head = null;
            tail = null;
            size--;
        }
        else if(index == size){
            ListNode curr = tail;
            tail = tail.prev;
            tail.next = null;
            curr.prev = null;
            size--;
        }
        else if (index == 0 && size != 0){
            ListNode curr = head;
            head = head.next;
            head.prev = null;
            curr.next = null;
            size--;
        }        
        else if(index > size){
            return;
        }
        else{
            ListNode curr = head;
            int pos = 0;
            while(curr != null && pos < index){
                curr = curr.next;
                pos++;
            }
            ListNode n = curr.next;
            ListNode p = curr.prev;
            p.next = n;
            n.prev = p;
            curr.next = null;
            curr.prev = null;
            size--;
        }
    }
}
