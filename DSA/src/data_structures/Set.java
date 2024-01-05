package data_structures;

import java.util.*;

public class Set<T> {

	private List<T> set;
	
	public Set() {
		this.set = new ArrayList<T>();
	}
	
	public Set(ArrayList<T> set) {
		this.set = set;
	}
	
	public Set(Set<T> set) {
		this.set = set.set;
	}
	
	public T search(T t) {
		
			for(T b : this.set) {
				if(b.equals(t)) {
					return b;
				}
			}
		return null;
	}
	
	public T min() {
		return this.set.get(0);
	}

	public T max() {
		return this.set.get(this.set.size() - 1);
	}
	
	public T successor(T t) {
		if(search(t).equals(max()) || search(t).equals(null)) {
			return null;
		}
		
		return this.set.get(this.set.indexOf(t) + 1);
		
	}
	
	public T predecessor(T t) {
		if(search(t).equals(min()) || search(t).equals(null)) {
			return null;
		}
		
		return this.set.get(this.set.indexOf(t) - 1);
	}
	
	public void insert(T t) {
		if(!this.set.contains(t)) {
			this.set.add(t);
		}		
	}
	
	public void delete(T t) {
		if(this.set.contains(t)) {
			this.set.remove(t);
		}		
	}

	public List<T> getSet() {
		return this.set;
	}
	
	
}
