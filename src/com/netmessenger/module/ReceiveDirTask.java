/* 2016/11/27 */
package com.netmessenger.module;

import java.io.File;

import com.netmessenger.ui.ReceiveDirPanel;

public class ReceiveDirTask {
	
	private File dir;
	
	private ReceiveDirPanel panel;

	public File getDir() {
		return dir;
	}

	public void setDir(File dir) {
		this.dir = dir;
	}

	public ReceiveDirPanel getPanel() {
		return panel;
	}

	public void setPanel(ReceiveDirPanel panel) {
		this.panel = panel;
	}
	
}
