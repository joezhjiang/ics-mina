package org.ics.mina.utils;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;
import org.apache.mina.filter.codec.demux.MessageEncoder;

/**
 * @author joe
 * @param <T>
 */
public class MyMessageEncoder implements MessageEncoder<String> {

    /**
     * 编码器未做任何处理
     * @param session 
     * @param msg 
     * @param out 
     * @throws Exception 
     */
    public void encode(IoSession session, String msg,
            ProtocolEncoderOutput out) throws Exception {
        IoBuffer buf = IoBuffer.allocate(msg.getBytes().length);
        buf.put(msg.getBytes());
        buf.flip();
        out.write(buf);
    }

}

