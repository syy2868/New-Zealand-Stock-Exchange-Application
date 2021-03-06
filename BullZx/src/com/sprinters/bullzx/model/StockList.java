/**
 * 
 */
package com.sprinters.bullzx.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chid
 *
 */
public class StockList {
	
	public StockList() {
		this.stockList = new ArrayList<Stock>();
	}
	
	public StockList(List<Stock> list) {
		this.stockList = list;
	}
	
	private List<Stock> stockList;

	/**
	 * @return the stockList
	 */
	public List<Stock> getStockList() {
		return stockList;
	}

	/**
	 * @param stockList the stockList to set
	 */
	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}

}
