package com.idaoben.instrument.server;

import com.idaoben.instrument.server.handler.CsHandler;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author hezifeng
 * @create 2022/10/31 16:01
 */
@Component
@ConditionalOnProperty(
        name = "inst.cs5100",
        havingValue = "enable"
)
public class CsServer {
    private final static Logger log = LoggerFactory.getLogger(CsServer.class);

    @Resource
    public CsHandler handler;
    @Bean("cs_server")
    public void main() throws IOException {
        log.info("启动CS仪器监听服务端...");
        IoAcceptor acceptor = new NioSocketAcceptor();
        acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 30);
        acceptor.setHandler(handler);
        acceptor.bind(new InetSocketAddress(9123));
    }
}
