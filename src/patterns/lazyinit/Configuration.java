package src.patterns.lazyinit;

public class Configuration {

    private static Configuration config;
    private String dbUrl;

    private Configuration() {
        System.out.println("Loading configuration...");
        this.dbUrl = "jdbc:mysql://localhost:3306/library";
    }

    public static Configuration getInstance() {
        if (config == null) {
            config = new Configuration();
        }
        return config;
    }

    public String getDbUrl() {
        return dbUrl;
    }
}
