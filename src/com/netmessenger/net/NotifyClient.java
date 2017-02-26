/* 2016/3/24 */
package com.netmessenger.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

import org.apache.log4j.Logger;

import com.netmessenger.net.message.Message;
import com.netmessenger.net.packet.Packet;
import com.netmessenger.net.packet.PacketFactory;

public class NotifyClient {
	private Logger LOGGER = Logger.getLogger(NotifyClient.class.getSimpleName());
	
	private static final int BUFFER_LENGTH = 0x400;
	
	private byte[] buffer = new byte[BUFFER_LENGTH];
	
	public NotifyClient() {
		
	}
	
	public void send(String remoteHost, Message message) throws IOException {
		
		DatagramSocket socket = null;
		
		try {
			socket = new DatagramSocket();
			DatagramPacket datagramPacket = new DatagramPacket(buffer, BUFFER_LENGTH,
					new InetSocketAddress(remoteHost, NotifyServer.PORT_NOTIFY));
			
			Packet packet = PacketFactory.createPacket(message);
			String packetString = PacketFactory.toString(packet);
			LOGGER.debug(packetString);
			
			datagramPacket.setData(packetString.getBytes());
			socket.send(datagramPacket);
		} finally {
			if (socket != null) {
				socket.close();
			}
		}
	}
}
