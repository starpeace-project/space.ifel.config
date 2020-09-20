package space.ifel.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mysql {
    @JsonProperty("serverAddress")
    public String getServerAddress() {
        return this.serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    String serverAddress;

    @JsonProperty("serverPort")
    public Integer getServerPort() {
        return this.serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    Integer serverPort;

    @JsonProperty("databaseName")
    public String getDatabaseName() {
        return this.databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    String databaseName;

    @JsonProperty("databaseUsername")
    public String getDatabaseUsername() {
        return this.databaseUsername;
    }

    public void setDatabaseUsername(String databaseUsername) {
        this.databaseUsername = databaseUsername;
    }

    String databaseUsername;

    @JsonProperty("databasePassword")
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    String databasePassword;

    @JsonProperty("connectionPoolLimit")
    public int getConnectionPoolLimit() {
        return this.connectionPoolLimit;
    }

    public void setConnectionPoolLimit(int connectionPoolLimit) {
        this.connectionPoolLimit = connectionPoolLimit;
    }

    int connectionPoolLimit;

    @Override
    public String toString() {
        return "Mysql{" +
                "serverAddress='" + serverAddress + '\'' +
                ", databaseName='" + databaseName + '\'' +
                ", databaseUsername='" + databaseUsername + '\'' +
                ", databasePassword='" + databasePassword + '\'' +
                ", connectionPoolLimit=" + connectionPoolLimit +
                '}';
    }
}
