package trees;
import java.util.*;

public class Treeuse {
	public static TreeNode<Integer> input(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the data of root:");
		int n=sc.nextInt();
		TreeNode<Integer>root=new TreeNode<>(n);
		System.out.print("Enter the number of child nodes in "+n+":");
		int children=sc.nextInt();
		for(int i=0;i<children;i++)
		{
			TreeNode<Integer>child=input();
			root.children.add(child);
		}
		System.out.println();
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	public static void main(String args[]) {
		print(input());
		
	}

}
