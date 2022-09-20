package ss10_dsa_stack_queue.exercise.reverse_element_stack;

public class ReverseStack {
    private int[] arr;
    private int size;

    public ReverseStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public ReverseStack() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
