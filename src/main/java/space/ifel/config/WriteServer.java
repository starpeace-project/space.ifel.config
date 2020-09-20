package space.ifel.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WriteServer {
    @JsonProperty("whitelist")
    public List<String> getWhitelist() {
        return this.whitelist;
    }

    public void setWhitelist(List<String> whitelist) {
        this.whitelist = whitelist;
    }

    List<String> whitelist;

    @JsonProperty("threadLimit")
    public int getThreadLimit() {
        return this.threadLimit;
    }

    public void setThreadLimit(int threadLimit) {
        this.threadLimit = threadLimit;
    }

    int threadLimit;

    @JsonProperty("port")
    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    int port;

    @Override
    public String toString() {
        return "WriteServer{" +
                "whitelist=" + whitelist +
                ", threadLimit=" + threadLimit +
                ", port=" + port +
                '}';
    }
}
