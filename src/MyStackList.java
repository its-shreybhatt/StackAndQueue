public class MyStackList<K> {
    MyLinkedList myLinkedList = new MyLinkedList();

    public void push(INode element) {
        myLinkedList.addToFront(element);
    }
    public void pushQueue(INode element) {
        myLinkedList.appendToLast(element);
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.popFirstNode();
    }

    public INode dequeue() {
        return myLinkedList.popFirstNode();
    }
    public void printStack() {
        myLinkedList.printMyNodes();
    }

}
