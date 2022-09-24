package Task7.components;

public class SumNumbersClass extends SumClass {
    @Override
    public Object sumElements(Object[] elements) {
        Integer res = 0;
        for (Object element : elements) {
            res += (Integer) element;
        }
        return res;
    }
}
