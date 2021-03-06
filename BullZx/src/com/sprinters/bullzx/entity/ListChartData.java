package com.sprinters.bullzx.entity;

import java.util.ArrayList;
import java.util.List;

public class ListChartData<T> implements IChartData<T> {
	private List<T> datas;

	public int size() {
		return datas.size();
	}

	public T get(int index) {
		return datas.get(index);
	}

	public boolean hasData() {
		return datas != null && !datas.isEmpty();
	}

	public boolean hasNoData() {
		return !hasData();
	}

	public void add(T data) {
		if (null == datas || datas.isEmpty()) {
			datas = new ArrayList<T>();
		}
		datas.add(data);
	}

	public ListChartData() {
		datas = new ArrayList<T>();
	}

	public ListChartData(List<T> data) {
		datas = new ArrayList<T>();
		datas.addAll(data);
	}
}
