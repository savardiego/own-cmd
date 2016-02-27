package com.werfred.owncmd.bus;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * Created by diego on 26/02/16.
 */
public class ServerTest {
	//START command line tool "netcat -L 192.168.28.35 -p 20000"

    @Test
    public void testSendCommand() throws Exception {
    	System.out.println("Start");
        Server server = new Server("192.168.28.35", 20000);
        boolean execResult = server.sendCommand("*1*12*13##");
        Assert.assertTrue(execResult);
    }
    
    @Test
    public void testGettatus() throws Exception {
    	System.out.println("Start");
        Server server = new Server("192.168.28.35", 20000);
        String status = server.getStatus("*#1*13##");
        System.out.println("Status: " + status);
  
    }
}