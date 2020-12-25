package com.hescov.tcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class TcpApplication implements ApplicationListener<ApplicationReadyEvent> {

    private final TCPServer tcpServer;

    public TcpApplication(TCPServer tcpServer) {
        this.tcpServer = tcpServer;
    }

    public static void main(String[] args) {
        SpringApplication.run(TcpApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        tcpServer.start();
    }
}
