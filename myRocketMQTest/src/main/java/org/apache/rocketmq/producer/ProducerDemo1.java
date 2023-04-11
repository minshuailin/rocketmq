package org.apache.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * @author msl
 * @date 2023年04月10日
 * @version: 1.0
 * @description: TODO
 */
public class ProducerDemo1 {
    public static void main(String[] args) throws Exception {
        String namesrvAddr = "127.0.0.1:9876";
        String group = "test_group";
        String topic = "test_hello_rocketmq";

        // 构建Producer实例
        DefaultMQProducer producer = new DefaultMQProducer();
        producer.setNamesrvAddr(namesrvAddr);
        producer.setProducerGroup(group);
        // 启动producer
        producer.start();
        // 发送消息
        SendResult result = producer.send(new Message(topic, "hello rocketmq".getBytes()));
        System.out.println(result.getSendStatus());
        // 关闭producer
        producer.shutdown();
    }
}
