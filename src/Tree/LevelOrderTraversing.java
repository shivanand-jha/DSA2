package Tree;


class BT
{
    Node root;
    public BT() {
        root = null;}
        public void printLevelOrder ()
        {
            int h = height(root);
            for (int i = 1; i <= h; i++) {
                printCurrentLevelOrder(root, i);
            }
        }
        public int height (Node root)
        {
            if (root == null)
                return 0;
            else {
                int lHeight = height(root.left);
                int rHeight = height(root.right);
                if (lHeight > rHeight)
                    return lHeight + 1;
                else
                    return rHeight + 1;
            }
        }
        public void printCurrentLevelOrder (Node root,int level)
        {
            if (root == null)
                return;
            if (level == 1)
                System.out.print(root.key + " ");
            else if (level > 1) {
                printCurrentLevelOrder(root.left, level - 1);
                printCurrentLevelOrder(root.right, level - 1);
            }
        }

        public static void main (String[]args){
            BT tree = new BT();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
            System.out.println("binary tree level order traversal :");
            tree.printLevelOrder();
        }

}