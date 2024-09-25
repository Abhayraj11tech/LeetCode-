class MyHashSet {
    private  int size = 1000;
    private List<Integer>[] arr;

    public MyHashSet() {
        arr = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new ArrayList<>();
        }
    }

    private int hash(int key) {
        return key % size;
    }

    public void add(int key) {
        int idx= hash(key);
        if (!arr[idx].contains(key)) {
            arr[idx].add(key);
        }
    }

    public boolean contains(int key) {
        int idx = hash(key);
        return arr[idx].contains(key);
    }

    public void remove(int key) {
        int idx = hash(key);
        arr[idx].removeIf(k -> k == key);
    }
}
