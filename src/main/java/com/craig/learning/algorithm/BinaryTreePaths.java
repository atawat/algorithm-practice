package com.craig.learning.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.craig.structure.TreeNode;

/**
 * 二叉树的所有路径
 * https://leetcode.cn/problems/binary-tree-paths/
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        return drawPath(root);
    }

    public List<String> drawPath(TreeNode root){
        if(root==null){
            return new ArrayList<>();
        }
        if(root.left == null && root.right == null){
            return new ArrayList<>(){{ add(String.valueOf(root.val));}};
        }

        List<String> result = new ArrayList<>();
        List<String> leftPath = drawPath(root.left);
        for (String s : leftPath) {
            result.add(root.val + "->" + s);  
        }
        List<String> rightPath = drawPath(root.right);
        for (String s : rightPath) {
            result.add(root.val + "->" + s);  
        }

        return result;
    }

    //速度比上面的快
    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        constructPaths(root, "", paths);
        return paths;
    }

    public void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            path += Integer.toString(root.val);
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(path);  // 把路径加入到答案中
            } else {
                path +="->";  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, path, paths);
                constructPaths(root.right, path, paths);
            }
        }
    }
}
