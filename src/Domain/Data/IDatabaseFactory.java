package Domain.Data;

import org.hibernate.Session;

public interface IDatabaseFactory {

    Session getSession();
}
