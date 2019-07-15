class MyHashSet {
    List<Integer> value;
    /** Initialize your data structure here. */
    public MyHashSet() {
        value = new ArrayList<>();
    }
    
    public void add(int key) {
        if(value.contains(key))
            return;
        value.add(key);
    }
    
    public void remove(int key) {
        if(value.size() != 0 && value.contains(key))
            value.remove(value.indexOf(key));
        
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return value.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */