package store.Service;

import store.Entity.phone;

import java.util.Map;

public interface function {

    String add(phone phone) throws Exception;

    String delete(phone phone) throws Exception;

    String mod(phone phone) throws Exception;

    String query(phone phone) throws Exception;
}
