package space.ifel.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReadServer {
    @JsonProperty("whitelist")
    public List<String> getBlacklist() {
        return this.blacklist;
    }

    public void setBlacklist(List<String> blacklist) {
        this.blacklist = blacklist;
    }

    List<String> blacklist;

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
        return "ReadServer{" +
                "blacklist=" + blacklist +
                ", threadLimit=" + threadLimit +
                ", port=" + port +
                '}';
    }
}
