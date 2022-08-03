class MyCalendar {
private final TreeMap<Integer, Integer> pairs;

    public MyCalendar() {
        pairs=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer lower = pairs.lowerKey(end);
        if (lower == null || pairs.get(lower) <= start) {
            pairs.put(start, end);
            return true;
        }
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */