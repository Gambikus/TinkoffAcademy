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

    public void add(Integer id) {
        JSONObject newItem = new JSONObject();
        newItem.put("data", Data.values()[(int) (Math.random() * Data.values().length)]);
        cache.put(id, newItem);
    }
    public JSONObject get(Integer id) {
        if (lastFiveElements.size() == 5) {
            Integer deletedId = lastFiveElements.poll();
            if (!lastFiveElements.contains(deletedId) && !id.equals(deletedId)) {
                cache.remove(deletedId);
            }
        }
        lastFiveElements.addLast(id);
        if (!cache.containsKey(id)) {
            add(id);
        }
        return cache.get(id);
    }
}
