public class StackList {
    public static void main(String[] args) {
        MyStackList myStack = new MyStackList();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);

        INode topElement = myStack.peak();
        System.out.println("Top most element = " +topElement.getKey());
        myStack.pop();

        myStack.printStack();

    }
}