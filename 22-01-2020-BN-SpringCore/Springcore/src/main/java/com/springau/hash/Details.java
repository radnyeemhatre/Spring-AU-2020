package com.springau.hash;

import java.util.Map;

public class Details {
	private Map<Integer , Students> details;

	/**
	 * @param details
	 */
	public Details(Map<Integer, Students> details) {
		super();
		this.details = details;
	}

	@Override
	public String toString() {
		return "Details [details=" + details + "]";
	}
	
}
