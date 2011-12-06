package plugin;

import java.util.ResourceBundle;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class Log
{
    public static final Logger GLOBAL = getLogger("plugin");

    public static CustomLogger getLogger(String rName)
    {
        return getLogger(rName, null);
    }

    public static synchronized CustomLogger getLogger(
        String         rName,
        ResourceBundle rBundle)
    {
        LogManager manager = LogManager.getLogManager();

        CustomLogger log = (CustomLogger) manager.getLogger(rName);

        if (log == null)
        {
            log = new CustomLogger(rName, rBundle);

            manager.addLogger(log);
        }

        return log;
    }
}
