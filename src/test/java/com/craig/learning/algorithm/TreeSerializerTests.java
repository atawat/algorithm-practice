package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.craig.structure.TreeNode;

public class TreeSerializerTests {
    TreeSerializer serializer = new TreeSerializer();

    @Test
    void testDeserialize() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        assertEquals("1,2,NONE,NONE,3,4,NONE,NONE,5,NONE,NONE", serializer.serialize(root)); 
    }

    @Test
    void testSerialize() {
        TreeNode root = serializer.deserialize("1,2,NONE,NONE,3,4,NONE,NONE,5,NONE,NONE");

        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertEquals(3, root.right.val);
    }
}
