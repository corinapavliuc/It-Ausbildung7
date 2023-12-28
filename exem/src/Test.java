public class Test {
    public static void main(String[] args) {

    }
    public void test(){
        int idx = 0;
        idx++;
        idx--;
        idx = idx +1;
        idx =-1;
        idx =idx %idx;
        if (idx >=0){
            --idx;
        }else {
            idx++;
        }
        System.out.println((double) idx);
    }
}
