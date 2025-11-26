class MyHashMap {

    public class Buck{
        int key;
        int value;
        Buck next;

        public Buck(int key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
        }   
        
       

    }
    public int in_size = 25;
    public Buck[] bucks = new Buck[in_size];
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {

        int v = key % in_size;
        Buck head = bucks[v];
        System.out.print(key);
        // if head is null directly adding values to head
        if(head == null){
            bucks[v] = new Buck(key, value);
            return;
        }
       
        // if head is not null first need to iterate the Node and update if found or add new
        Buck curr = head;
        Buck prev = null;
        while(curr != null){
            if(curr.key == key){
            curr.value = value;
            return;
            }
            prev = curr;
            curr = curr.next;
        }

        // if its coming to this point which means curr is not empty intially at the same time key is not found inside curr
        prev.next = new Buck(key, value);
    }
    
    public int get(int key) {

        int v = key % in_size;
        Buck curr = bucks[v];

        //  System.out.print(curr);
            while(curr != null)
            {
                if(curr.key == key)
                return curr.value;
                else{
                    curr = curr.next;
                }
            }
      return -1;
    }
    
    public void remove(int key) {

        int v = key % in_size;
        Buck curr = bucks[v];
        Buck prev = null;
        
        while(curr != null){
            if(curr.key == key){
                if(prev == null){
                    bucks[v] = curr.next;
                }else{
                    prev.next = curr.next;
                }
                return ;
            }
            prev = curr;
            curr = curr.next;
        }

    }


}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */