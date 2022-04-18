
public class Program {
    public static int findClosesValueInBst(BST tree, int target) {
        return -1;
    }

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        BST ten = new BST(10);

        System.out.println(ten.left);

    }
}

