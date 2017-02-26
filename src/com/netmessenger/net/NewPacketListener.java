/* 2016/3/24 */
package com.netmessenger.net;

import java.util.EventListener;

@FunctionalInterface
public interface NewPacketListener extends EventListener {
	void handlePacket(NewPachetEvent e);
}
