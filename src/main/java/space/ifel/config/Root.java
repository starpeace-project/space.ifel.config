package space.ifel.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty("writeServer")
    public WriteServer getWriteServer() {
        return this.writeServer;
    }

    public void setWriteServer(WriteServer writeServer) {
        this.writeServer = writeServer;
    }

    WriteServer writeServer;

    @JsonProperty("readServer")
    public ReadServer getReadServer() {
        return this.readServer;
    }

    public void setReadServer(ReadServer readServer) {
        this.readServer = readServer;
    }

    ReadServer readServer;

    @JsonProperty("mssql")
    public Mssql getMssql() {
        return this.mssql;
    }

    public void setMssql(Mssql mssql) {
        this.mssql = mssql;
    }

    Mssql mssql;

    @JsonProperty("mysql")
    public Mysql getMysql() {
        return this.mysql;
    }

    public void setMysql(Mysql mysql) {
        this.mysql = mysql;
    }

    Mysql mysql;

    @JsonProperty("settings")
    public Settings getSettings() {
        return this.settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    Settings settings;

    @Override
    public String toString() {
        return "Root{" +
                "writeServer=" + writeServer +
                ", readServer=" + readServer +
                ", mssql=" + mssql +
                ", mysql=" + mysql +
                ", settings=" + settings +
                '}';
    }
}


