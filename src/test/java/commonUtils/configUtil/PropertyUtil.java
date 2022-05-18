package commonUtils.configUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class PropertyUtil {

    public static Properties loadProperties (String fileName) {
        try {
            Properties prop = new Properties();
            prop.load(Files.newInputStream(Path.of(fileName)));
            return prop;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
