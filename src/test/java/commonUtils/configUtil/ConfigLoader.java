package commonUtils.configUtil;

import commonUtils.Constants.Environment;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() {
        String environment = System.getProperty("environment", String.valueOf(Environment.QA));
        switch (environment) {
            case "PROD" -> properties = PropertyUtil.loadProperties((System.getProperty("user.dir") + "/src/test/resources/prod_config.properties"));
            case "STAGE" -> properties = PropertyUtil.loadProperties((System.getProperty("user.dir") + "/src/test/resources/stage_config.properties"));
            case "QA" -> properties = PropertyUtil.loadProperties((System.getProperty("user.dir") + "/src/test/resources/qa_config.properties"));
            default -> throw new IllegalStateException("Invalid environment : " + environment);
        }
    }

    public static ConfigLoader getInstance() {
        if(configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseURL() {
        return properties.getProperty("baseUrl");
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }
}
