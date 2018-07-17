/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    boolean check(Node n, int min, int max) {
        if(n == null)
            return true;
        if(n.data <= min || n.data >= max)
            return false;
        return check(n.left, min, n.data) && check(n.right, n.data, max);
    }