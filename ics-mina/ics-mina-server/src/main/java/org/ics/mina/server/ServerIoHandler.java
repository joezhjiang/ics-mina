package org.ics.mina.server;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class ServerIoHandler implements IoHandler {

    public void exceptionCaught(IoSession session, Throwable pArg1)
            throws Exception {
        
    }

    public void messageReceived(IoSession session, Object obj) throws Exception {
        //收到的信息
        System.out.println(obj.toString());
    }

    public void messageSent(IoSession session, Object pArg1) throws Exception {
        
    }

    public void sessionClosed(IoSession session) throws Exception {
        
    }

    public void sessionCreated(IoSession session) throws Exception {
        
    }

    public void sessionIdle(IoSession session, IdleStatus pArg1) throws Exception {
        
    }

    public void sessionOpened(IoSession session) throws Exception {
        session.write("[Server: Client,I'm server.][Server: Client,I'm server.]");
    }

}

