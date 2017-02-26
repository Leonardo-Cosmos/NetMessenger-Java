/* 2016/3/24 */
package com.netmessenger.worker;

import java.util.EventListener;

public interface FileCompletedListener extends EventListener {
	void complete(FileCompletedEvent e);
}
