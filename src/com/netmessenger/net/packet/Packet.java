/* 2016/3/24 */
package com.netmessenger.net.packet;

import com.netmessenger.net.message.Message;

public class Packet {
	
	private int type;
	private Message message;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}
