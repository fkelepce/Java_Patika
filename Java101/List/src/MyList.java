import java.util.Arrays;

public class MyList<T> {
    private T[] arr;
    private int index = 0;


    MyList() {
        this.arr = (T[]) new Object[10];
    }

    MyList(int a) {
        this.arr = (T[]) new Object[a];
    }

    public int size() {
        int count = 0;
        for (T item : this.arr) {
            if (item != null) {
                count++;
            }
        }
        return count;
    }

    public int getCapacity() {
        return this.arr.length;
    }

    public void add(T adding) {
        if (this.index == this.arr.length) {
            arr = Arrays.copyOf(this.arr, this.arr.length * 2);
        }
        this.arr[this.index] = adding;
        index++;
    }

    public T get(int index) {
        return this.arr[index];
    }

    public void remove(int index){
        if(index > this.index-1){
            System.out.println("Your index is out of bound");
        }
        for(int i = index ; i <= this.index-1 ; i++){
            this.arr[i] = this.arr[i+1];
            this.index--;
        }
    }

    public void set(int index, T data){
        if(index > this.index-1){
            System.out.println("Your index is out of bound");
        }
        this.arr[index] = data;

    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        if(size() > 0){
            for(T item : this.arr) {
                if( item != null)
                    result.append(item).append(",");
            }
        }
        if(result.length() > 1)
            result.deleteCharAt(result.length()-1).append("]");
        else
            result.append("]");
        return result.toString();
    }

    public int indexOf(T data){
        for(int i = 0 ; i < size() ; i++) {
            if(this.arr[i] == data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int catcher = -1;
        for(int i = 0 ; i < size() ; i++) {
            if(this.arr[i] == data){
                catcher = i;
            }
        }
        return catcher;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T[] toArray() {
        return Arrays.copyOfRange(this.arr, 0, size());
    }

    public void clear(){
        this.arr = (T[]) new Object[10];
    }

    public MyList<T> subList(int start,int finish){
        MyList<T> sublist = new MyList<>((finish-start )+1);
        for(int i = start ; i <=finish ; i++){
            sublist.add(arr[i]);
        }
        return sublist;
    }

    public boolean contains(T data){
        for(T item : arr){
            if(item == data)
                return true;
        }
        return false;
    }
}