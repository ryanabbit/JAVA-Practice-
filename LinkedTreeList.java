package test;
import java.util.List;
import java.util.Iterator;


public class LinkedTreeList <T> extends TreeList<T>{
    protected List<LinkedTree<T>> list;
    
    public LinkedTreeList(List<LinkedTree<T>> list){
    	
    	this.list=list;
    	
    }
	@SuppressWarnings("unchecked")
	@Override
	public Iterator<Tree<T>> iterator() {
		// TODO Auto-generated method stub
		return (Iterator<Tree<T>>)((List<Tree<T>>)(List<?>)list).iterator();
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
		
	}
	
 
}
