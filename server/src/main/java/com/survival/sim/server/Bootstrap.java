package com.survival.sim.server;

import com.survival.sim.server.netty.NettyServer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zach on 10/16/2017.
 */
public class Bootstrap {


    public static void main(String[] args) {
        NettyServer.start();
    }
}
