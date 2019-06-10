public class TestBinaryTree {

    static BinaryTree binaryTree=new BinaryTree();
    public static void main(String[] args){
        TestBinaryTree testBinaryTree=new TestBinaryTree();
        int[] intList={1,5,9,8,7,4,65,3,69,8,26,36,88,9,27,65};
        for(int i=0;i<intList.length;i++){
            testBinaryTree.insert(intList[i]);
        }
        testBinaryTree.show(binaryTree.root);
    }

    /**
     * 展示树中的内容
     * @param node
     */
    public void show(Node node){
        if(node!=null){
            show(node.leftChild);
            System.out.print(node.data+"\t");
            show(node.rightNode);
        }
    }

    /**
     * 向二叉树中添加值
     * @param data
     */
    public void insert(int data){
        // 创建一个新结点并为该结点赋值
        Node node = new Node();
        node.data=data;
        // 当根节点为空时，将该值赋予根节点
        if(binaryTree.root==null){
            binaryTree.root=node;
        }
        else{
            // 向下遍历的临时结点
            Node current = binaryTree.root;

            // 储存父节点，便于添加新的结点
            Node parent;

            while(true){
                if(data<=current.data){
                    parent=current;
                    current=current.leftChild;
                    if(current==null){
                        parent.leftChild=node;
                        break;
                    }
                }
                else{
                    parent=current;
                    current=current.rightNode;
                    if(current==null){
                        parent.rightNode=node;
                        break;
                    }
                }

            }

        }
    }
}

/**
 * 树中的结点
 */
class Node{
    // 该结点的内容
    int data;

    // 左孩子
    Node leftChild;

    // 右孩子
    Node rightNode;

    /**
     * 输出该结点的内容
     */
    public void print(){
        System.out.println(data);
    }
}

/**
 * 储存树根的类
 */
class BinaryTree{
    public Node root;
}


