package javaServerSocketChat;

import java.net.*;

public class Server {
	public static void main(String[] args) {
		Socket socket = null; // Client�� ����ϱ� ���� Socket ����
		User user = new User(); // ä�ù濡 ������ �ִ� Client ���� ��ü
		ServerSocket server_socket = null; // Client ������ �ޱ� ���� ServerSocket
		
		int count = 0; // ������ �Ҵ��� ���� ����
		Thread thread[] = new Thread[10]; // 10������ ������ �Ҵ�, �� ä�ù濡 10���� ���� ����
		
		try {
			server_socket = new ServerSocket(4444); // ���� ��Ʈ�� ������ ����
			
			while(true) {
				socket = server_socket.accept(); // ����� ����Ǳ� ������ ���� 

				/*
				 * receiver Class���� implements Runnable�� ����߱� ������
				 * Thread ��ü �ȿ� �����带 ����Ϸ��� ��ü�� �־��༭ ��üȭ�� �� �� �ֽ��ϴ�.
				 */
				thread[count] = new Thread(new Receiver(user, socket)); //Receiver Ŭ������ Thread���� ����
				thread[count].start(); // ������ ����
				count++;
			}
		}catch(Exception e) {
			
		};
	}
}