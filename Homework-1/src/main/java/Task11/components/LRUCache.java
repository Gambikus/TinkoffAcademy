package Task11.components;

import org.json.JSONObject;

import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class LRUCache {
    WeakHashMap<Integer, JSONObject> cache;
    LinkedList<Integer> lastFiveElements;

    public LRUCache () {
        cache = new WeakHashMap<>();
        lastFiveElements = new LinkedList<>();
    }

    public JSONObject get(Integer id) {
        if (lastFiveElements.size() == 5) {
            cache.remove(lastFiveElements.poll());
        }
        lastFiveElements.addLast(id);
        if (!cache.containsKey(id)) {
            JSONObject newItem = new JSONObject();
            newItem.put("data", Data.values()[(int) (Math.random() * Data.values().length)]);
            cache.put(id, newItem);
        }
        return cache.get(id);
    }
}
