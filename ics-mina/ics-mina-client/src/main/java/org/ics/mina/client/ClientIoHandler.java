package org.ics.mina.client;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class ClientIoHandler implements IoHandler {

    public void exceptionCaught(IoSession session, Throwable throwable)
            throws Exception {
        
    }

    public void messageReceived(IoSession session, Object obj) throws Exception {
        //收到的内容
        System.out.println(obj.toString());
    }

    public void messageSent(IoSession session, Object obj) throws Exception {
        
    }

    public void sessionClosed(IoSession session) throws Exception {
        
    }

    public void sessionCreated(IoSession session) throws Exception {
        
    }

    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
        
    }

    public void sessionOpened(IoSession session) throws Exception {
        session.write("[Client: Server,I'm client.][Client: Server,I'm client.]");
    }

}

