//Using DFS
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> levelOrder(TreeNode root) {  
        result = new ArrayList<>();
        dfs(root,0);
        return result;
    }
    
    private void dfs(TreeNode root, int level){
        List<Integer> list = new ArrayList<>();
        if(root==null) return;
        
        //Create a list for each level
        if(level==result.size()){
            result.add(new ArrayList<>());
        }
        dfs(root.left,level+1);
        dfs(root.right, level+1);
        
        //Retrieve the list for that level and then add to list
        result.get(level).add(root.val);
    }
    
}
