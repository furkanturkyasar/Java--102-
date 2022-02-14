import java.util.Arrays;

public class MyList<T> {
    T[] array;

    MyList() {
        this.array = (T[]) new Object[10];
    }

    MyList(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    public int size() {
        int count = 0;
        for (T i : array) {
            if (i != null) {
                count++;
            }
        }
        return count;
    }

    public int getCapacity() {
        return array.length;
    }

    public void add(T data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = data;
                break;
            } else if (array[i] != null && i == array.length - 1) {
                array = Arrays.copyOf(array, array.length * 2);
                array[array.length / 2] = data;
                break;
            }
        }
    }

    // Ilk opsiyon
    /*
    public T get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                for (T t : array) {
                    return array[i];
                }
            } else if (array[index] == null) {
                return null;
            }
        }
        return null;
    }
     */

    // Ikinci opsiyon
    public T get(int index) {
        if (array[index] != null) {
            return array[index];
        } else {
            return null;
        }
    }


    public T remove(int index) {
        T value;
        value = get(index);
        if (array[index] != null) {
            if (size() - index >= 0) {
                System.arraycopy(array, index + 1, array, index, size() - index);
            }
        } else {
            return null;
        }

        return value;
    }

    public void set(int index, T data) {
        if (array[index] != null) {
            array[index] = data;
        } else {
            System.out.println("null");
        }
    }

    @Override
    public String toString() {
        String list = "[";
        for (int i = 0; i < size(); i++) {
            if (array[i] != null) {
                list += array[i];
                if (i != (size() - 1)) {
                    list += ",";
                }
            }
        }
        list += "]";
        return list;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size(); i++) {
            if (data == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size(); i > 0; i--) {
            if (data == array[i]) {
                return i;
            }
        }
        return -1;
    }

    // ilk opsiyon
    /*
    public boolean isEmpty() {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                check = true;
            } else if (array[i] == null){
                check = false;
            }
        }
        return check;
    }

     */

    public boolean isEmpty() {
        return size() == 0;
    }

    public T[] toArray() {
        return Arrays.copyOfRange(array, 0, size());
    }

    public void clear() {
        this.array = (T[]) new Object[10];
    }

    MyList<T> subList(int start, int finish) {
        MyList<T> sub = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            sub.add(array[i]);
        }
        return sub;
    }

    public boolean contains(T data) {
        for (T t : array) {
            if (data == t && data != null) {
                return true;
            }
        }
        return false;
    }

}
