package local.tin.tests.rabbitmq.simple.consumer.callbacks;

import com.rabbitmq.client.DeliverCallback;
import com.rabbitmq.client.Delivery;
import java.io.IOException;
import javax.imageio.IIOException;
import local.tin.tests.rabbitmq.base.exchanges.Consumer;
import local.tin.tests.rabbitmq.base.model.RabbitMQException;
import local.tin.tests.rabbitmq.base.model.RabbitMQMessageConsume;
import org.apache.log4j.Logger;

/**
 *
 * @author benitodarder
 */
public class AnotherSimpleDeliverCallback implements DeliverCallback {

    private static final Logger LOGGER = Logger.getLogger(AnotherSimpleDeliverCallback.class);
    private final RabbitMQMessageConsume rabbitMQMessageConsume;

    public AnotherSimpleDeliverCallback(RabbitMQMessageConsume rabbitMQMessageConsume) {
        this.rabbitMQMessageConsume = rabbitMQMessageConsume;
    }
    

    
    @Override
    public void handle(String string, Delivery dlvr) throws IOException {
        LOGGER.info(new String(dlvr.getBody(), rabbitMQMessageConsume.getCharset()));
        try {
            Consumer.getInstance().acknolewdge(rabbitMQMessageConsume, dlvr.getEnvelope().getDeliveryTag());
        } catch (RabbitMQException ex) {
            throw new IIOException("Could not acknowledge.", ex);
        }
    }

    public String getCharset() {
        return rabbitMQMessageConsume.getCharset();
    }
    
    
}
