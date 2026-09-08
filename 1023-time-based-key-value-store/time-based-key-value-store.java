class pair {
    int timestamp;
    String value;

    pair(int timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }
}

class TimeMap {
    private HashMap<String, ArrayList<pair>> map;

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
        if(list==null){
            return "";
        }
        int left =0;
        int right = list.size()-1;
        String ans = "";
        while(left<=right){
            int mid = left + (right-left)/2;
            if(list.get(mid).timestamp==timestamp){
                ans = list.get(mid).value;
                return ans;
            }else if(list.get(mid).timestamp<timestamp){
                ans = list.get(mid).value;
                left = mid +1;
            }else{
                right = mid-1;
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