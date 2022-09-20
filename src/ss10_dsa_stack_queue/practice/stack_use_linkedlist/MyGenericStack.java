package ss10_dsa_stack_queue.practice.stack_use_linkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;



public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    private boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return stack.size();
    }

    static void stackOfStrings() {
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("Five");
        myGenericStack.push("Four");
        myGenericStack.push("Three");
        myGenericStack.push("Two");
        myGenericStack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + myGenericStack.size());
        System.out.println("1.2. Pop elements from stack : ");
        while (!myGenericStack.isEmpty()) {
            System.out.printf(" %s", myGenericStack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + myGenericStack.size());
    }

    static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.println("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());

    }
}
