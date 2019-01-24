/**
 * author: rale
 * createdAt: 1/20/19
 * 对树节点的水平遍历
 * 难度：HARD
 */
public class LevelTraversal {

    /**
     *  对传入的树的根节点进行水平遍历
     *  如树的结构为：
     *      a
     *     / \
     *    b   c
     *    则返回的字符串为abc
     *
     *    涉及知识点：
     *    1.水平遍历（Level Traversal)
     *    2.StringBuilder与String
     *    3.队列（Queue）
     */
    public String traverse(TreeNode root) {
        return "";        if (root ==null) {
            return "";
        }
        Queue<TreeNode> tree = new LinkedList<TreeNode>();
        queue.offer(root);
        StringBuilder node = new StringBuilder();
        while(queue.isEmpty=true){
            Treenode current=queue.poll();
            if(current.getLeftChild()!=null) {
                queue.offer(current.getLeftChild());
            }
            if(current.getRightChild() != null) {
                queue.offer(current.getRightChild());
            }
            }
            }

        }
    

