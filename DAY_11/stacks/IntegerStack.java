package DAY_11.stacks;

public class IntegerStack {
    int arr[];
    int top;
    int capacity;
    IntegerStack(int size){
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data){
        if(top == capacity-1){
            System.out.println("Stack OverFlow");
            return;
        }
        arr[++top] = data;
        System.out.println("The Integer "+data+" was pushed to stack.");
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    void display(){
        if(top==-1){
            System.out.println("Stack underflow, Nothing to display.");
            return;
        }
        System.out.print("The elements in order [LIFO] are: ");         for(int i=top; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("The popped element is : "+stack.pop());
        stack.display();
    }
}
