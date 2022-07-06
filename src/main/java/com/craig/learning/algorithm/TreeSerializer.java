package com.craig.learning.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.craig.structure.TreeNode;

/**
 * 二叉树的序列化与反序列化
 * https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/
 */
public class TreeSerializer {
    // 此方法不兼容重复值
    // Encodes a tree to a single string.
    // public String serialize(TreeNode root) {
    // StringBuilder preSb = new StringBuilder();
    // HashMap<Integer, Integer> countMap = new HashMap<>();
    // preOrder(root, preSb, countMap);

    // HashMap<Integer, Integer> midCountMap = new HashMap<>();
    // StringBuilder midSb = new StringBuilder();
    // midOrder(root, midSb, midCountMap);

    // preSb.delete(preSb.length() - 1, preSb.length()).append('|')
    // .append(midSb.delete(midSb.length() - 1, midSb.length()));

    // return preSb.toString();
    // }

    // private void midOrder(TreeNode root, StringBuilder midSb, HashMap<Integer,
    // Integer> countMap) {
    // if (root == null) {
    // return;
    // }
    // midOrder(root.left, midSb, countMap);

    // if(!countMap.containsKey(root.val)){
    // midSb.append(root.val + ",");
    // }else {
    // midSb.append(root.val + "(" + (countMap.get(root.val) + 1) + " )" + ",");
    // }
    // countMap.put(root.val, countMap.getOrDefault(root.val, 0) +1);

    // midOrder(root.right, midSb, countMap);
    // }

    // private void preOrder(TreeNode root, StringBuilder preSb, HashMap<Integer,
    // Integer> countMap) {
    // if (root == null) {
    // return;
    // }
    // if(!countMap.containsKey(root.val)){
    // preSb.append(root.val + ",");
    // }else {
    // preSb.append(root.val + "(" + (countMap.get(root.val) + 1) + ")" + ",");
    // }

    // countMap.put(root.val, countMap.getOrDefault(root.val, 0) +1);

    // preOrder(root.left, preSb, countMap);
    // preOrder(root.right, preSb, countMap);
    // }

    // // Decodes your encoded data to tree.
    // public TreeNode deserialize(String data) {
    // String[] nodeString = data.split("\\|");
    // List<String> preOrder =
    // Arrays.stream(nodeString[0].split(",")).collect(Collectors.toList());
    // List<String> midOrder =
    // Arrays.stream(nodeString[1].split(",")).collect(Collectors.toList());

    // TreeNode root = buidTree(preOrder, midOrder);

    // return root;
    // }

    // private TreeNode buidTree(List<String> preOrder, List<String> midOrder) {
    // if (preOrder.size() == 0 || midOrder.size() == 0) {
    // return null;
    // }
    // String rootVal = preOrder.get(0);
    // if(rootVal.contains("(")){
    // rootVal = rootVal.substring(0, rootVal.indexOf("("));
    // }
    // TreeNode root = new TreeNode(Integer.valueOf(rootVal));
    // if (preOrder.size() == 1 || midOrder.size() == 1) {
    // return root;
    // }

    // int midIndex = midOrder.indexOf(rootVal);
    // root.left = buidTree(preOrder.subList(1, 1 + midIndex), midOrder.subList(0,
    // midIndex));
    // root.right = buidTree(preOrder.subList(1 + midIndex,
    // preOrder.size()),midOrder.subList(midIndex + 1, midOrder.size()));
    // return root;
    // }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preOrder(root, sb);

        sb.delete(sb.length()-1, sb.length());

        return sb.toString();
    }

    private void preOrder(TreeNode root, StringBuilder midSb) {
        if (root == null) {
            midSb.append("NONE,");
            return;
        }
        midSb.append(root.val+",");
        preOrder(root.left, midSb);
        preOrder(root.right, midSb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> nodeList = Arrays.stream(data.split(",")).collect(Collectors.toList());
        return buildNode(nodeList);
    }

    private TreeNode buildNode(List<String> data){
        if(data.get(0).equals("NONE")){
            data.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(data.get(0))); //先构建根节点
        data.remove(0);
        root.left = buildNode(data);
        root.right = buildNode(data);

        return root;
    }
}
