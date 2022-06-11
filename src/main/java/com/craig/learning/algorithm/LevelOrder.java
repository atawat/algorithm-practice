package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.craig.structure.Node;
import com.craig.structure.TreeNode;

/**
 * 二叉树的层序遍历
 * https://leetcode.cn/problems/binary-tree-level-order-traversal/
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(root);
        List<Integer> levelData = new ArrayList<>();
        while (!queue1.isEmpty()) {
            TreeNode node = queue1.poll();
            levelData.add(node.val);

            if (node.left != null)
                queue2.add(node.left);
            if (node.right != null)
                queue2.add(node.right);
            
            if(queue1.isEmpty()){
                result.add(levelData);
                levelData = new ArrayList<>();
                Queue<TreeNode> temp = queue1;
                queue1 = queue2;
                queue2 = temp;
            }
        }

        return result;
    }

    //遍历统计从底层开始
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(0,level);
        }

        return ret;
    }

    /**
     * 二叉树的右视图
     * https://leetcode.cn/problems/binary-tree-right-side-view/
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                } 
                if(i == currentLevelSize){
                    ret.add(node.val);
                }
            }
        }

        return ret;
    }

    /**
     * 二叉树的层平均值
     * https://leetcode.cn/problems/average-of-levels-in-binary-tree/
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ret = new ArrayList<Double>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            double sum = 0.0;
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                } 
                sum+=node.val;
            }
            Double avg = sum/(double)currentLevelSize;
            ret.add(avg);
        }

        return ret;
    }

    /**
     * 在每个树行中找最大值
     * https://leetcode.cn/problems/find-largest-value-in-each-tree-row/
     * @param root
     * @return
     */
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
                if(node.val > max){
                    max = node.val;
                }
            }
            result.add(max);
        }

        return result;
    }

    private Node pre = null, first = null;
    /**
     * 填充每个节点的下一个右侧节点指针 II
     * https://leetcode.cn/problems/populating-next-right-pointers-in-each-node-ii/
     * @param root
     * @return
     */
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node start = root;
        
        while (start != null) {
            pre = null;
            first = null;
            do{
                if(start.left != null){
                    linkNode(start.left);
                }
                if(start.right != null){
                    linkNode(start.right);
                }
                start = start.next;
            }while(start != null);
            start = first;
        }

        return root;
    }

    private void linkNode(Node node){
        if(pre != null){
            pre.next = node;
        }
        if(first == null){
            first = node;
        }
        pre = node;
    }

    /**
     * 二叉树的最小深度
     * https://leetcode.cn/problems/minimum-depth-of-binary-tree/
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int minDepth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            minDepth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null){
                    return minDepth;
                }
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }

        return minDepth;
    }
}
