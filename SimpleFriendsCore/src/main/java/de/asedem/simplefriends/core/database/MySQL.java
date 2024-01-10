package de.asedem.simplefriends.core.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import de.rytrox.sequeltence.Database;

public class MySQL extends Database {

    public MySQL(MysqlDataSource source) {
        this.source = source;
    }

    public MySQL(String host, int port, String database, String username, String password) {
        final MysqlDataSource properties = new MysqlDataSource();

        properties.setUrl(String.format("jdbc:mysql://%s:%d/%s", host, port, database));
        properties.setDatabaseName(database);
        properties.setUser(username);
        properties.setPassword(password);

        this.source = properties;
    }

}
