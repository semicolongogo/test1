package sist.com.basic.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Store {
	private List<Book>list;
	private Set<Book>set;
	private Map<Integer,Book>map;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<Integer, Book> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Book> map) {
		this.map = map;
	}

	public Set<Book> getSet() {
		return set;
	}

	public void setSet(Set<Book> set) {
		this.set = set;
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
	
	
	

}
