package com.my.utils;

/**
 * 自定义二叉搜索树
 */
public class MyBinarySearchTree<K extends Comparable, V> {
    private Node root;

    public MyBinarySearchTree() {
    }

    /**
     * 插入值
     *
     * @param key
     * @param value
     */
    public void put(K key, V value) {
        root = put(root, key, value);
    }

    private Node put(Node x, K key, V value) {
        if (x == null) return new Node(key, value);
        int compare = key.compareTo(x.key);
        if (compare < 0)
            x.left = put(x.left, key, value);
        else if (compare > 0)
            x.right = put(x.right, key, value);
        else
            x.value = value;
        return x;
    }

    public V get(K key) {
        return get(root, key);//从根节点开始查找
    }

    /**
     * 查找key值
     *
     * @param node
     * @param key
     * @return
     */
    private V get(Node node, K key) {
        System.out.println("查找1次");
        //如果子节点为null，说明没有查找到数据
        if (node == null) {
            return null;
        }
        int result = key.compareTo(node.key);

        if (result == 0) {
            return (V) node.value;
        } else if (result > 0) {
            return get(node.right, key);
        } else {
            return get(node.left, key);
        }
    }

    class Node<K extends Comparable, V> {
        K key;
        V value;
        Node left;
        Node right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

