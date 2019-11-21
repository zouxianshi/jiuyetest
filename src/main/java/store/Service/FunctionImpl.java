package store.Service;

import store.Entity.Phone;
import store.Sql.Sql;
import store.Sql.SqlConnect;

public class FunctionImpl implements Function {
    private SqlConnect sqlConnect = new SqlConnect();
    private Sql sql = new Sql();
    private String color,model;
    private float price,size;


    public FunctionImpl(Phone phone){
        this.color =phone.getColor();
        this.model= phone.getModel();
        this.price = phone.getPrice();
        this.size = phone.getSize();
    }
    @Override
    public String add(Phone phone){
        new FunctionImpl(phone);
        sqlConnect.execute(sql.Add(color,model,price,size));
        return null;
    }

    @Override
    public String delete(Phone phone) {
        new FunctionImpl(phone);
        return null;
    }

    @Override
    public String mod(Phone phone) {
        new FunctionImpl(phone);
        return null;
    }

    @Override
    public String query(Phone phone) {
        new FunctionImpl(phone);
        sqlConnect.execute(sql.Query(color,model,price,size));
        return null;
    }
}
