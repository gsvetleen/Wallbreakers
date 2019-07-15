class MyHashMap {
    int[] hashmap;
    int size = 100;
    /** Initialize your data structure here. */
    public MyHashMap() {
        hashmap = new int[size];
        Arrays.fill(hashmap, -1);
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(key > size){
            int temp = size;
            while(key > size)
                size *= 2;
            hashmap = Arrays.copyOf(hashmap,size);
            Arrays.fill(hashmap, temp, size, -1);
        }
        hashmap[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
       if(key < size && hashmap[key] != -1)
           return hashmap[key];
        else
            return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(key < size && hashmap[key] != -1)
            hashmap[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */