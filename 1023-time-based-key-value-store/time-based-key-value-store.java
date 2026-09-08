// Stores timestamp and value together
class pair {
    int timestamp;
    String value;

    // Constructor initializes timestamp and value to access using get function at perticular value 

    pair(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}

class TimeMap {
    private HashMap<String, ArrayList<pair>> map;
    // The problem is that ArrayList takes only one type:
    // ArrayList<Type>

    // not:
    // ArrayList<Type1, Type2> ❌ 

    // So you use TimeValue class for strong and accessing the timestampe and value.
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            map.get(key).add(new pair(timestamp, value));
        } else {
            ArrayList<pair> arr = new ArrayList<>();
            arr.add(new pair(timestamp, value));
            map.put(key, arr);
        }
    }

    public String get(String key, int timestamp) {
        ArrayList<pair> list = map.get(key);
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
                return ans;
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
/*
TimeMap Approach:

1. Create a pair class to store timestamp and value together.
  Example: (1, "bar"), (4, "bar2")

2. Use HashMap:
  key -> ArrayList<pair>
  This allows each key to store multiple timestamp-value pairs.

3. set():
  - If key already exists, add the new pair to its list.
  - Otherwise, create a new ArrayList and store it in the map.

4. get():
  - First find the list belonging to the given key using map.get(key).
  - Use binary search because timestamps are stored in sorted order.
  - Find the largest timestamp that is <= the requested timestamp.
  - If an exact timestamp is found, return its value.
  - After binary search, 'right' represents the largest valid timestamp.
  - If right == -1, no valid timestamp exists, so return "".

Time Complexity:
set() -> O(1)
get() -> O(log n)

Space Complexity:
O(n)
*/