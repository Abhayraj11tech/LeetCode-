class MyHashMap {
    private final int BUCKET_SIZE = 1000;
    private List<Entry>[] buckets;

    public MyHashMap() {
        buckets = new ArrayList[BUCKET_SIZE];
        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    private int hash(int key) {
        return key % BUCKET_SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        for (Entry entry : buckets[index]) {
            if (entry.key == key) {
                entry.value = value; 
                return;
            }
        }
        buckets[index].add(new Entry(key, value)); 
    }

    public int get(int key) {
        int index = hash(key);
        for (Entry entry : buckets[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1; 
    }

    public void remove(int key) {
        int index = hash(key);
        buckets[index].removeIf(entry -> entry.key == key);
    }

    private static class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
