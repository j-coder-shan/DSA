public class Test {
    public static void main(String[] args) {
//        stack_array stack = new stack_array(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.display();
//        stack.pop();
//        stack.pop();
//        stack.display();
//        stack.peek();
//
//        stack_linked stack1 = new stack_linked();
//        stack1.push(1);
//        stack1.push(2);
//        stack1.push(3);
//        stack1.push(4);
//        stack1.push(5);
//        stack1.push(6);
//        stack1.pop();
//        stack1.peek();
//
//        queue_linear queueLinear = new queue_linear(5);
//        queueLinear.enQueue(1);
//        queueLinear.enQueue(2);
//        queueLinear.enQueue(3);
//        queueLinear.enQueue(4);
//        queueLinear.enQueue(5);
//        queueLinear.enQueue(6);
//        queueLinear.deQueue();
//        queueLinear.display();
//
//        queue_circular queueCircular = new queue_circular(5);
//        queueCircular.enQueue(1);
//        queueCircular.enQueue(2);
//        queueCircular.enQueue(3);
//        queueCircular.enQueue(4);
//        queueCircular.enQueue(5);
//        queueCircular.enQueue(6);
//        queueCircular.deQueue();
//        queueCircular.enQueue(6);
//        queueCircular.display();
//        queueCircular.deQueue();
//        queueCircular.enQueue(7);
//        queueCircular.display();
//
//        queue_linked queueLinked = new queue_linked(5);
//        queueLinked.enQueue(1);
//        queueLinked.enQueue(2);
//        queueLinked.enQueue(3);
//        queueLinked.enQueue(4);
//        queueLinked.enQueue(5);
//        queueLinked.enQueue(6);
//        queueLinked.deQueue();
//        queueLinked.deQueue();
//
//        ArrayDeQueue deQueue = new ArrayDeQueue(5);
//        deQueue.insertFront(10);
//        deQueue.insertFront(20);
//        deQueue.insertRear(30);
//        deQueue.insertRear(40);
//        System.out.println(STR."Front element: \{deQueue.getFront()}");
//        System.out.println(STR."Rear element: \{deQueue.getRear()}");
//        System.out.println(STR."Deleted front element: \{deQueue.deleteFront()}");
//        System.out.println(STR."Deleted rear element: \{deQueue.deleteRear()}");
//        System.out.println(STR."Front element: \{deQueue.getFront()}");
//        System.out.println(STR."Rear element: \{deQueue.getRear()}");
        listArray list = new listArray(5);
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.traverseList();
        list.insertList(2, 25);
        list.traverseList();
        list.deleteList(3);
        list.traverseList();
        list.retrieveList(2);
        list.replaceList(2, 35);
        list.traverseList();


    }
}
