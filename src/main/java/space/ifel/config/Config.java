package space.ifel.config;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Config {

    private ObjectMapper objectMapper;
    private Root root;

    public Config() {
        try {
            this.objectMapper = new ObjectMapper();
            this.root = this.objectMapper.readValue(new File("directory.json"), Root.class);

            if (root == null) {
                System.out.println("No config, creating.");
                this.root = initializeConfig();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Registering config shutdown hook.");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down writing config to disk.");
            try {
                this.objectMapper.writeValue(new File("directory.json"), this.root);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        System.out.println("Config shutdown hook registered.");
    }

    private Root initializeConfig() {
        Root root = new Root();

        // Write Server
        root.setWriteServer(new WriteServer());
        root.writeServer.setPort(2222);
        root.writeServer.threadLimit = 100;
        root.writeServer.whitelist = new ArrayList<>();

        // Read Server
        root.setReadServer(new ReadServer());
        root.readServer.port = 1111;
        root.readServer.threadLimit = 100;
        root.readServer.blacklist = new ArrayList<>();

        // Mssql
        root.setMssql(new Mssql());
        root.mssql.serverAddress = "";
        root.mssql.serverPort = 1433;
        root.mssql.databaseName = "";
        root.mssql.databaseUsername = "";
        root.mssql.databasePassword = "";
        root.mssql.connectionPoolLimit = 50;

        // Mysql
        root.setMysql(new Mysql());
        root.mysql.serverAddress = "";
        root.mysql.serverPort = 3306;
        root.mysql.databaseName = "";
        root.mysql.databaseUsername = "";
        root.mysql.databasePassword = "";
        root.mysql.connectionPoolLimit = 50;

        // Settings
        root.setSettings(new Settings());
        root.settings.allOnSsl = false;
        root.settings.heartbeats = false;

        return root;
    }

    public Root get() {
        return this.root;
    }

    public Root set() {
        return this.root;
    }

    @Override
    public String toString() {
        return "Config{" +
                "root=" + root +
                '}';
    }
}
