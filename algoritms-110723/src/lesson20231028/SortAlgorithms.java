package lesson20231028;

public class SortAlgorithms {
    public static void main(String[] args) {
        int [] data = new int[] {0,12,12,-9,8,121};
        sort(data);
    }
    public static void sort(int[] data) {
        for (int i =0; i< data.length; i++){
            int min = data[i];
            for (int j =i +i; j< data.length; j++){
                if (data[j] < min){
                    min =data[j];
                    data[j]=data[i];
                    data[i] =min;
                }
            }
        }
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int indMin = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    indMin = j;
                }
            }
            int tmp = data[i];
            data[i] = data[indMin];
            data[indMin] = tmp;
        }
    }
                }




