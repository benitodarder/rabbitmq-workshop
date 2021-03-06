package local.tin.tests.rabbitmq.base.model;


import com.rabbitmq.client.AMQP.BasicProperties;

/**
 *
 * @author benitodarder
 */
public class RabbitMQMessageSend extends RabbitMQMessage {
    
    private BasicProperties messageProperties;    
    private boolean closeConnection;
    private boolean closeChannel;

    public boolean isCloseConnection() {
        return closeConnection;
    }

    public void setCloseConnection(boolean closeConnection) {
        this.closeConnection = closeConnection;
    }
    
    public BasicProperties getMessageProperties() {
        return messageProperties;
    }

    public void setMessageProperties(BasicProperties messageProperties) {
        this.messageProperties = messageProperties;
    }    

    public boolean isCloseChannel() {
        return closeChannel;
    }

    public void setCloseChannel(boolean closeChannel) {
        this.closeChannel = closeChannel;
    }
    
}
