package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        System.out.println("모든 노드 탐색하기");
        printAll(first);

        Node lastNode= getLastNode(first);
        System.out.println("lastNode = " + lastNode);
    }

    private static void printAll(Node node) {
        Node x=node;
        while(x!=null){
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x=node;
        while(x.next!=null){
            x = x.next;
        }
        return x;
    }
}
