package de.asedem.simplefriends.core.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import de.rytrox.sequeltence.Database;
import de.rytrox.sequeltence.QueryBuilder;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MySQL extends Database {

    public MySQL(String host, int port, String database, String username, String password) {
        final MysqlDataSource properties = new MysqlDataSource();

        properties.setUrl(String.format("jdbc:mysql://%s:%d/%s", host, port, database));
        properties.setDatabaseName(database);
        properties.setUser(username);
        properties.setPassword(password);

        this.source = properties;
    }

    @NotNull
    @Override
    public QueryBuilder prepare(@NotNull @Language("MySQL") String query, @Nullable Object... args) {
        return super.prepare(query, args);
    }
}
