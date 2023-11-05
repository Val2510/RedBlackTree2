public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.insert(25);
        System.out.println("Красно-чёрное дерево после балансировки:");
        printInOrder(tree.getRoot(), tree.getTNULL());
    }

    public static void printInOrder(Node node, Node TNULL) {
        if (node != null && node != TNULL) {
            printInOrder(node.left, TNULL);
            System.out.print(node.data + " ");
            printInOrder(node.right, TNULL);
        }
    }
}