package Domain.Data;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class DatabaseFactory implements IDatabaseFactory {

    private Configuration configuration;
    private Session currentSession;

    public DatabaseFactory(String configurationPath) {
        configuration = new Configuration();
        configuration.configure(configurationPath);
    }

    @Override
    public Session getSession() {
        return getCurrentSession();
    }

    private Session getCurrentSession() {
        if (currentSession == null)
            currentSession = configuration.buildSessionFactory(getServiceRegistry()).openSession();

        return currentSession;
    }

    private ServiceRegistry getServiceRegistry() {
        return new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    }
}
