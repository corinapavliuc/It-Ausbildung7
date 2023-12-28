public class SpecialStack {
    CustomArrayStack data;
    CustomArrayStack minValues;


public  SpecialStack(int capacity) {
    data = new CustomArrayStack(capacity);
    minValues= new  CustomArrayStack(capacity);
}
    public void push(int element) { // 0(1)
        data.push(element);
        if (!minValues.isEmpty()) {
            int currentMin = minValues.peek();
            minValues.push(Math.min(element, currentMin));
        } else {
            minValues.push(element);
        }
    }


    public int pop() {
    int result = data.pop();
    minValues.pop();
        return result;

    }
    public int getMin(){ //0(1)
        return minValues.peek();
    }

    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack(5);
        stack.push(18);
        stack.push(19);
        stack.push(29);
        stack.push(15);
        stack.push(16);
        System.out.println(stack.getMin()); //15
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin()); //18
        stack.push(5);
        System.out.println(stack.getMin()); //5
    }


    private class CustomArrayStack {
        private boolean empty;

        public CustomArrayStack(int capacity) {

        }

        public void push(int element) {
        }

        public boolean isEmpty() {
            return empty;
        }

        public void setEmpty(boolean empty) {
            this.empty = empty;
        }

        public int pop() {
            int i = 0;
            int i1 = i;
            int i11 = i1;
            int i111 = i11;
            return i111;
        }

        public int peek() {
            return 0;
        }
    }
}


