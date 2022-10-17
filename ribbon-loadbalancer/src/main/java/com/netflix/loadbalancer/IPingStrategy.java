package com.netflix.loadbalancer;

/**
 * 检查服务实例操作的执行策略对象
 * Defines the strategy, used to ping all servers, registered in
 * <b>com.netflix.loadbalancer.BaseLoadBalancer</b>. You would
 * typically create custom implementation of this interface, if you
 * want your servers to be pinged in parallel. <b>Please note,
 * that implementations of this interface should be immutable.</b>
 *
 * @author Dmitry_Cherkas
 * @see Server
 * @see IPing
 */
public interface IPingStrategy {

    boolean[] pingServers(IPing ping, Server[] servers);
}
