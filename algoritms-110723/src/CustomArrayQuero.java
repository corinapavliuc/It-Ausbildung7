public class CustomArrayQuero {
    private int[] data;
    private int tail;
    private int head;
    private int count;

    public  CustomArrayQuero(int capacity){
        data =new int[capacity];
        count =0;
        head = -1;
        tail = -1;
    }
    public  void enqueue(int element){
        data[++tail] = element;
       if( head==-1)head++;
    }
    public int dequeue(){
        return data[head++];
    }

    public static void main(String[] args) {
        CustomArrayQuero quero = new CustomArrayQuero(5);
        quero.enqueue(1);
        quero.enqueue(2);
        quero.enqueue(3);
        quero.enqueue(4);
        quero.enqueue(5);
        System.out.println(quero.dequeue());
        System.out.println(quero.dequeue());
        System.out.println(quero.dequeue());
        System.out.println(quero.dequeue());
        System.out.println(quero.dequeue());
    }
}
