package com.iesVda.testMongo;

import java.util.List;

public interface DaoInterface<T> {

	T get(T t);

	List<T> getAll();

	T save(T t);

	T update(T t, String[] params);

	void delete(T t);

}
