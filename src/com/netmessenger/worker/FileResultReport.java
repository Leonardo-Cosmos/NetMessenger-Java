/* 2016/3/28 */
package com.netmessenger.worker;

import java.util.concurrent.Future;

import com.netmessenger.file.FileDigestResult;

public class FileResultReport extends FileReport {
	private Future<FileDigestResult> result;

	public Future<FileDigestResult> getResult() {
		return result;
	}

	public void setResult(Future<FileDigestResult> result) {
		this.result = result;
	}
}
