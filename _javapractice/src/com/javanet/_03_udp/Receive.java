package com.javanet._03_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//���ն�
public class Receive {
    public static void main(String[] args) throws Exception{
//�������ն˶���
       DatagramSocket receiver =  new DatagramSocket(10086);
//��������
        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer,1024);
        receiver.receive(dp);
//        ��ȡ���յ�����
        String msg = new String(dp.getData(),0,dp.getLength());
        System.out.println("sender's msg:"+msg);
    }
}