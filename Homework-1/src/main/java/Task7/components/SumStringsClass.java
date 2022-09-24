package Task7.components;

public class SumStringsClass extends SumClass{
    @Override
    public Object sumElements(Object[] elements) {
        StringBuilder res = new StringBuilder();
        for (Object el : elements) {
            res.append((String) el);
        }
        return res.toString();
    }
}
