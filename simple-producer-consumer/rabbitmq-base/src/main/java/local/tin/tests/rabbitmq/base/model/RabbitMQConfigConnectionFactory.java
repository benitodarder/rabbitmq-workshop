package local.tin.tests.rabbitmq.base.model;

/**
 *
 * @author benitodarder
 */
public class RabbitMQConfigConnectionFactory {
    private String host;    
    private String userName;
    private String password;
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
    
}
