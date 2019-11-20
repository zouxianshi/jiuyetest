package store.Service;

import store.Entity.Phone;

public interface Function {

    String add(Phone phone) throws Exception;

    String delete(Phone phone) throws Exception;

    String mod(Phone phone) throws Exception;

    String query(Phone phone) throws Exception;
}
