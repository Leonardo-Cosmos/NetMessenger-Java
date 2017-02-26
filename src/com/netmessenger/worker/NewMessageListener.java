/* 2016/3/24 */
package com.netmessenger.worker;

import java.util.EventListener;

import com.netmessenger.net.message.Message;

@FunctionalInterface
public interface NewMessageListener <T extends Message> extends EventListener {
	void handle(NewMessageEvent<T> e);
}
