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
    // The problem is that ArrayList takes only one type:
    // ArrayList<Type>

    // not:
    // ArrayList<Type1, Type2> ❌ 

    // So you use TimeValue class for strong and accessing the timestampe and value.
    public TimeMap() {
        // Constructor runs when a new TimeMap object is created.
        // like this --> ["TimeMap", "set", "get", "get", "set", "get", "get"]
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            // // Key already exists → get its list and add new TimeValue
            map.get(key).add(new TimeValue(timestamp, value));
        } else {
            // // Key doesn't exist → create a new list
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