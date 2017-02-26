/* 2016/3/29 */
package com.netmessenger.worker;

public class FileProgress {
	
	private long processed;
	
	private long total;

	public long getProcessed() {
		return processed;
	}

	public void setProcessed(long processed) {
		this.processed = processed;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
}
