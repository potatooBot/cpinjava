class Solution {
    private String lcaToStart, lcaToEnd;

    private TreeNode lca(TreeNode node, int s, int d) {
        if (node == null) return null;

        TreeNode leftSide = lca(node.left, s, d);
        TreeNode rightSide = lca(node.right, s, d);

        if ((leftSide != null && rightSide != null) || (node.val == s || node.val == d))
            return node;
        return (leftSide == null) ? rightSide : leftSide;
    }

    private void dfs(TreeNode node, StringBuilder pathString, int s, int d) {
        if (node == null) return;
        if (node.val == s) lcaToStart = pathString.toString();
        if (node.val == d) lcaToEnd = pathString.toString();

        pathString.append('L');
        dfs(node.left, pathString, s, d);
        pathString.deleteCharAt(pathString.length() - 1);

        pathString.append('R');
        dfs(node.right, pathString, s, d);
        pathString.deleteCharAt(pathString.length() - 1);
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lcaNode = lca(root, startValue, destValue);

        StringBuilder pathString = new StringBuilder();
        dfs(lcaNode, pathString, startValue, destValue);

        StringBuilder result = new StringBuilder();
        for (char ch : lcaToStart.toCharArray()) {
            result.append('U');
        }
        result.append(lcaToEnd);
        return result.toString();
    }
}