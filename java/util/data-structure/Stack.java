package br.com.edsilfer.algorithms.util.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ferna on 5/17/2017.
 */
public class Stack<T> {
    private List<T> stack = new ArrayList<>();

    public void push(T object) {
        stack.add(object);
    }

    public T pop() {
        T result = null;

        if (stack.size() > 0) {
            result = stack.get(stack.size() - 1);
            stack.remove(result);
        }

        return result;
    }

    public int size() {
        return stack.size();
    }

    public T read() {
        T result = null;

        if (stack.size() > 0) {
            result = stack.get(stack.size() - 1);
        }

        return result;
    }
}
