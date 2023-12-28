package lesson20231028;

public class SearchAlgorithms {
    public static void main(String[] args) {
        String[] data =new String[] {"A","B","Hello","Word","!!!"};

    }
    public static int searchBinary(Integer[] data, int element) {
        int start = 0;
        int end = data.length - 1;
        int middle;

        while (start <= end){
            middle = start + (end - start) / 2;
            if (element == data[middle]) return middle;
            if (element > data[middle]) start = middle + 1;
            else end = middle - 1;
        }
        return -1;
    }
}
