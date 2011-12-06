package plugin;

import java.text.MessageFormat;
import java.util.ResourceBundle;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class CustomLogger
    extends Logger
    implements Comparable<CustomLogger>
{
    private final ResourceBundle bundle;

    protected CustomLogger(String rName)
    {
        this(rName, null);
    }

    protected CustomLogger(
        String         rName,
        ResourceBundle rBundle)
    {
        super(rName, null);

        bundle = rBundle;

        setUseParentHandlers(!rName.equals("com.triemax"));
        setLevel(Level.WARNING);
    }

    @Override
    public void addHandler(Handler rHandler)
    {
        Handler[] handlers = getHandlers();

        for (int i = 0; i < handlers.length; i++)
        {
            if (handlers[i] == rHandler)
            {
                return;
            }
        }

        super.addHandler(rHandler);
    }


    public int compareTo(CustomLogger rOther)
    {
        return getName().compareTo(rOther.getName());
    }
}
