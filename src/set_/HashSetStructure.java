package set_;

@SuppressWarnings("all")
public class HashSetStructure {
    public static void main(String[] args) {
        // 实现HashSet的底层（hashMap）的底层

        // 1. 创建一个数组，数组的类型是Node[]
        // 2. 有些人，直接把Node[] 成为table
        Node[] table = new Node[16];
        System.out.println("table=" + table);
        // 3. 创建节点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;
        Node rose = new Node("rose", null);
        jack.next = rose;

        Node lucy = new Node("lucy", null);
        table[3] = lucy;
        System.out.println("table=" + table);
    }
}
class Node { //节点，存储数据，可以指向下一个节点，从而形成链表
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
