package plugin;

import org.gradle.api.*;
import org.gradle.api.logging.*;
import org.gradle.api.plugins.*;
import org.gradle.api.specs.*;
import org.gradle.api.tasks.*;

public class SimplePlugin implements Plugin<Project> {
    public void apply(Project rProject) {
        Logger log = Logging.getLogger(getClass());
        log.info("Load SimplePlugin");
        CustomLogger logger = Log.getLogger("plugin");
        log.info("SimplePlugin loaded");
    }
}
