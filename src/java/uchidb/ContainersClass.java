package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class ContainersClass<T, S> implements Containers<T, S>
{
	private Map<S,T> contmap;

	public Set<T> initSet(T[] tArray) {
		Set<T> set = new HashSet<T>(tArray.length);
		for (int i = 0; i < tArray.length; i++) {
			set.add(tArray[i]);
		}
		return set;
	}
	
	public List<T> initList(T[] tArray) {
		List<T> list = new ArrayList<T>(tArray.length);
		for (int i = 0; i < tArray.length; i++) {
			list.add(tArray[i]);
		}
		return list;
	}

	public Map<S,T> initEmptyMap() {
		Map<S,T> map = new HashMap<S,T>();
		return map;
	}
	
	public void storeMap(Map<S,T> mapToStoreInClass) {
		this.contmap = mapToStoreInClass;
	}

	public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
		if (!this.contmap.containsKey(key) || overwriteExistingKey) {
			this.contmap.put(key, value);
			return true;
		}
		return false;
	}
	
	public T getValueFromMap(S key) {
		T ret = this.contmap.get(key);
		return ret;
	}
	
	// An overloaded function to get a value from the store/local map, but with a default value
	// if the key is not present in the map.
	public T getValueFromMap(S key, T defaultValue) {
		T ret = this.contmap.get(key);
		if (ret != null)
			return ret;
		return defaultValue;
	}
}