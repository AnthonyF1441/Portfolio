// AVL tree implementation in Java

// Create node
class Node {
    int height;
    Node left, right;
    Logs logs;
    
    // initializes logs
    Node(Logs logs2) {
        logs = logs2;
        height = 1;
    }
  }
  
// Tree class
class AVLTree {
    Node root;

    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }
  
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }
  
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }
  
    // Get balance factor of a node
    int getBalanceFactor(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
        }
    
    // Insert a node
    Node insertion(Node node, Logs logs) {
        // Find the position and insert the node
        if (node == null)
            return (new Node(logs));
        if (logs.year < node.logs.year)
            node.left = insertion(node.left, logs);
        else if (logs.year > node.logs.year)
            node.right = insertion(node.right, logs);
        else
            return node;
  
        // Update the balance factor of each node
        // And, balance the tree
        node.height = 1 + max(height(node.left), height(node.right));
        int balanceFactor = getBalanceFactor(node);
        if (balanceFactor > 1) {
            if (logs.year < node.left.logs.year) {
            return rightRotate(node);
            } else if (logs.year > node.left.logs.year) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
            }
        }
        if (balanceFactor < -1) {
            if (logs.year > node.right.logs.year) {
            return leftRotate(node);
            } else if (logs.year < node.right.logs.year) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
            }
        }
        return node;
        }
  
        Node nodeWithMimumValue(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
        }
  
    // Delete a node
        Node deletion(Node root, int year) {
    
        // Find the node to be deleted and remove it
        if (root == null)
            return root;
        if (year < root.logs.year)
            root.left = deletion(root.left, year);
        else if (year > root.logs.year)
            root.right = deletion(root.right, year);
        else {
            if ((root.left == null) || (root.right == null)) {
            Node temp = null;
            if (temp == root.left)
                temp = root.right;
            else
                temp = root.left;
            if (temp == null) {
                temp = root;
                root = null;
            } else
                root = temp;
            } else {
                Node temp = nodeWithMimumValue(root.right);
                root.logs.year = temp.logs.year;
                root.right = deletion(root.right, temp.logs.year);
            }
        }
        if (root == null)
            return root;
    
      // Update the balance factor of each node and balance the tree
        root.height = max(height(root.left), height(root.right)) + 1;
        int balanceFactor = getBalanceFactor(root);
        if (balanceFactor > 1) {
            if (getBalanceFactor(root.left) >= 0) {
            return rightRotate(root);
            } else {
            root.left = leftRotate(root.left);
            return rightRotate(root);
            }
        }
        if (balanceFactor < -1) {
            if (getBalanceFactor(root.right) <= 0) {
            return leftRotate(root);
            } else {
            root.right = rightRotate(root.right);
            return leftRotate(root);
            }
        }
        return root;
        }
  
        void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.logs + " ");
            preOrder(node.left);
            preOrder(node.right);
            }
        }
  }