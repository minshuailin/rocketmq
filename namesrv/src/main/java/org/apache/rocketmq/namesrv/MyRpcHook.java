package org.apache.rocketmq.namesrv;

import org.apache.rocketmq.remoting.RPCHook;
import org.apache.rocketmq.remoting.protocol.RemotingCommand;

/**
 * @author msl
 * @date 2023年03月28日
 * @version: 1.0
 * @description: TODO
 */
public class MyRpcHook implements RPCHook {
    @Override
    public void doBeforeRequest(String remoteAddr, RemotingCommand request) {
        System.out.println("Before Request, remote address: " + remoteAddr + ", request: " + request.toString());
    }

    @Override
    public void doAfterResponse(String remoteAddr, RemotingCommand request, RemotingCommand response) {
        System.out.println("After Response, remote address: " + remoteAddr + ", response: " + response.toString());
    }
}
