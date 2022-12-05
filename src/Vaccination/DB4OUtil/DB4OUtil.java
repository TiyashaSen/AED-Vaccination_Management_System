package Vaccination.DB4OUtil;

import Vaccination.Configuration.AdminSystemConfigure;
import Vaccination.Configuration.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Predicate;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author prakruthisomashekar
 */
public class DB4OUtil {

    private static final String fileName = Paths.get("Database.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer Connection) {
        if (Connection != null) {
            Connection.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, fileName);
            return db;
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }

    public synchronized void saveSystem(EcoSystem system) {
        ObjectContainer Connection = createConnection();
        Connection.store(system);
        Connection.commit();
        Connection.close();
    }

    public void deleteSystem(ObjectContainer connection) {
        ObjectSet<EcoSystem> systems = Connection.query(new Predicate<EcoSystem>() {
            @Override
            public boolean match(EcoSystem et) {
                return true;
            }
        });
        for (EcoSystem ecoSystem : systems) {
            Connection.delete(ecoSystem);
        }
    }

    public EcoSystem getSystem() {
        ObjectContainer Connection = createConnection();
        ObjectSet<EcoSystem> systems = Connection.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.size() == 0) {
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        } else {
            system = systems.get(systems.size() - 1);
        }
        Connection.close();
        return system;
    }
}
