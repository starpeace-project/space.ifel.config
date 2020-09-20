package space.ifel.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Settings {
    @JsonProperty("allOnSsl")
    public boolean getAllOnSsl() {
        return this.allOnSsl;
    }

    public void setAllOnSsl(boolean allOnSsl) {
        this.allOnSsl = allOnSsl;
    }

    boolean allOnSsl;

    @JsonProperty("heartbeats")
    public boolean getHeartbeats() {
        return this.heartbeats;
    }

    public void setHeartbeats(boolean heartbeats) {
        this.heartbeats = heartbeats;
    }

    boolean heartbeats;

    @Override
    public String toString() {
        return "Settings{" +
                "allOnSsl=" + allOnSsl +
                ", heartbeats=" + heartbeats +
                '}';
    }
}
