package mission;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by nehad on 28/7/18.
 */
//this uses extra space
public class SpecialStack extends Stack<Integer> {

    Stack<Integer> minStack = new Stack<>();

    public void push(int val)
    {
        super.push(val);
        if (minStack.isEmpty() || (val < minStack.peek()))
            minStack.push(val);
        else
            minStack.push(minStack.peek());
    }

    public Integer pop()
    {
        if (isEmpty())
            return -1;

        minStack.pop();
        return super.pop();
    }

    public Integer getMin()
    {
        return minStack.peek();
    }
}

//this uses less space
class SpecialStackWithLessSpace extends Stack<Integer> {

    Stack<Integer> minStack = new Stack<>();

    public void push(int val)
    {
        super.push(val);
        if (minStack.isEmpty() || (val <= minStack.peek()))
            minStack.push(val);
    }

    public Integer pop()
    {
        if (isEmpty())
            return -1;

        if (minStack.peek() == super.peek())
            minStack.pop();
        return super.pop();
    }

    public Integer getMin()
    {
        return minStack.peek();
    }
}

//uses no extra space for storing min
class StackWithNoExtraSpace extends Stack<Integer> {
    private int min;

    public int getMin()
    {
        return min;
    }

    public void push(int val)
    {
        if (isEmpty())
        {
            super.push(val);
            min = val;
            return;
        }

        if (val >= min){
            super.push(val);
        }
        else {
            super.push(2*val - min);
            min = val;
        }
    }

    public Integer pop()
    {
        if (isEmpty())
            return -1;

        int y = super.pop();
        if (y >= min)
        {
            return y;
        }
        else
        {
            int val = min;
            min = 2*val - y;
            return val;
        }
    }
}

class TestSpecialStack
{
    public static void main(String[] args)
    {
        System.out.println("Stack 1 : ");
        SpecialStack stack = new SpecialStack();
        stack.push(10);
        stack.push(14);
        stack.push(5);
        System.out.println("min till now : " + stack.getMin());

        stack.push(3);
        stack.push(15);
        System.out.println("min till now : " + stack.getMin());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Min till now : " + stack.getMin());



        System.out.println("Stack 2 :");
        SpecialStackWithLessSpace stack2 = new SpecialStackWithLessSpace();
        stack2.push(10);
        stack2.push(14);
        stack2.push(5);
        System.out.println("min till now : " + stack2.getMin());

        stack2.push(3);
        stack2.push(15);
        System.out.println("min till now : " + stack2.getMin());

        stack2.pop();
        stack2.pop();
        stack2.pop();
        stack2.pop();
        System.out.println("Min till now : " + stack2.getMin());



        System.out.println("Stack 3:");

        StackWithNoExtraSpace stack3 = new StackWithNoExtraSpace();
        stack3.push(14);
        stack3.push(5);
        stack3.push(15);
        System.out.println("min till now : " + stack3.getMin());

        stack3.push(3);
        stack3.push(1);
        System.out.println("min till now : " + stack3.getMin());

        stack3.pop();
        stack3.pop();
        stack3.pop();
        stack3.pop();
        System.out.println("Min till now : " + stack3.getMin());
    }
}