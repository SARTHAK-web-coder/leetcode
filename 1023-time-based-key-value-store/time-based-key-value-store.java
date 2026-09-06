class TimeValue {
    int timestamp;
    String value;

    TimeValue(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}

class TimeMap {
    private HashMap<String, ArrayList<TimeValue>> map ;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            map.get(key).add(new TimeValue(timestamp, value));
        } else {
            ArrayList<TimeValue> arr = new ArrayList<>();
            arr.add(new TimeValue(timestamp, value));
            map.put(key, arr);
        }
    }

    public String get(String key, int timestamp) {
        ArrayList<TimeValue> list = map.get(key);
        if (list == null) {
            return "";
        }
        int left = 0;
        int right = list.size() - 1;
        String ans = "";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid).timestamp == timestamp) {
                ans = list.get(mid).value;
                break;
            } else if (list.get(mid).timestamp < timestamp) {
                ans = list.get(mid).value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */