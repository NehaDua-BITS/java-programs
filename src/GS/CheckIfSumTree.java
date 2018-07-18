package GS;

class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;
  
  public TreeNode(int data)
  {
    this.data = data;
    left = right = null;
  }
}

public class CheckIfSumTree {

  public static void main(String[] args)
  {
    System.out.println("in main");
    TreeNode root = new TreeNode(26);
    root.left = new TreeNode(10);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(6);
    root.right.right = new TreeNode(3);
    root.right.left = new TreeNode(0);
    
    System.out.println("Is sum tree : "  + (new CheckIfSumTree().isSumTree(root) ? "yes" : "no"));
  }
  
  private boolean isLeafNode(TreeNode node)
  {
    if (node == null)
      return false;
    
    if (node.left == null && node.right == null)  
      return true;
     
    return false;  
  }
  
  private boolean isSumTree(TreeNode root)
  {
    if (root == null)
      return true;
    
    if (isLeafNode(root))
	return true;
	
    if (isSumTree(root.left) && isSumTree(root.right))
    {
       int ls = 0;
       if (root.left == null)
	ls = 0;
       else if (isLeafNode(root.left))
	  ls = root.left.data;
       else
	  ls = root.left.data * 2;

       int rs = 0;
       if (root.right == null)
	rs = 0;
       else if (isLeafNode(root.right))
	  rs = root.right.data;
       else
	  rs = root.right.data * 2;
	  
       return (root.data == ls + rs);	  
    }
    
    return false;
  }
  
}
