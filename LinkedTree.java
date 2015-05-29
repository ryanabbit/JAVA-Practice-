package test;
import java.util.LinkedList;
import java.util.List;

public class LinkedTree<T> extends Tree<T>{
    protected List<LinkedTree<T>> childrenList;
    protected LinkedTree<T> parent;
    protected TreeList<T> children;
    protected int size;
    protected int depth;
   
    protected int level;
    
    
	public LinkedTree(T value) {
		super(value);
		// TODO Auto-generated constructor stub
		childrenList = new LinkedList<LinkedTree<T>>();
		children=new LinkedTreeList<T>(childrenList);
		depth=1;
		level=1;
		size=1;
		
	}

	@Override
	public Tree<T> parent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	public TreeList<T> children() {
		// TODO Auto-generated method stub
		return children;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int dept() {
		// TODO Auto-generated method stub
		return depth;
	}

	@Override
	public int degree() {
		// TODO Auto-generated method stub
		return childrenList.size();
	}

	@Override
	public int level() {
		// TODO Auto-generated method stub
		return level;
	}

	@Override
	public void add(T value) {
		// TODO Auto-generated method stub
		add(new LinkedTree<T>(value));
	}

	@Override
	public void add(Tree<T> tree) {
		// TODO Auto-generated method stub
		LinkedTree<T> gtree=(LinkedTree<T>)tree;
		if (gtree.parent!=null)
			gtree.remove();
		gtree.parent=this;
		if(gtree.depth+1>depth){
			depth=gtree.depth+1;
			bubbleDepth();
			
		}
		gtree.level=level+1;
		gtree.updateLevel();
		childrenList.add(gtree);
		size+=gtree.size;
		bubbleCount(gtree.size);
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if (parent==null)
			return;
		parent.childrenList.remove(this);
		if(depth+1==parent.depth)
			parent.updateDepth();
		parent.size-=size;
		parent.bubbleCount(-size);
		parent=null;
	}

	@Override
	public Tree<T> copy() {
		// TODO Auto-generated method stub
		return copy(1);
	}
	protected LinkedTree<T> copy(int level){
		LinkedTree<T> cloneTree=new LinkedTree<T>(value);
		cloneTree.depth=depth;
		cloneTree.level=level;
		cloneTree.size=size;
		for(LinkedTree<T> child: childrenList){
			LinkedTree<T> cloneChild=child.copy(level+1);
			cloneChild.parent=cloneTree;
			cloneTree.childrenList.add(cloneChild);
			}
		return cloneTree;
	}
	protected void bubbleDepth(){
		if(parent==null)
			return;
		if(depth+1>parent.depth){
			parent.depth=depth+1;
			parent.bubbleDepth();
		}
	}
	protected void bubbleCount(int diff){
		if (parent==null)
			return;
		parent.size+=diff;
		parent.bubbleCount(diff);
		
	}
	protected void updateLevel(){
		int childLevel=level+1;
		for(LinkedTree<T> child:childrenList){
			child.level=childLevel;
			child.updateLevel();
		}
		
	}
	protected void updateDepth(){
		int tmpDepth=depth;
		depth=1;
		for(LinkedTree<T> child:childrenList)
			if(child.depth+1>depth)
				depth=child.depth+1;
		if(tmpDepth==depth||parent==null)
			return;
		if(tmpDepth+1==parent.depth)
			parent.updateDepth();
		
		
	}
	

}
