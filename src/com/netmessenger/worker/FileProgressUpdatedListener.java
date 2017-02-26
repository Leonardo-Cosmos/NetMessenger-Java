/* 2016/3/24 */
package com.netmessenger.worker;

import java.util.EventListener;

public interface FileProgressUpdatedListener extends EventListener {
	void updateProgress(FileProgressUpdatedEvent e);
}
