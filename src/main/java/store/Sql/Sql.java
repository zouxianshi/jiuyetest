package store.Sql;

public class Sql {
    public String Add(String color,String model,float price,float size) {
        return "INSERT INTO phone (color,model,price,size) VALUES (\'"+color+"\',\'"+model+"\',"+price+","+size+");";
    }


    public String Query(String color,String model,float price,float size) {
        if (color.isEmpty()) {
            String str1 = "";
            if (model.isEmpty()) {

            }
        } else {
            return "SELECT * FROM phone WHERE color = \'" + color + "\' AND model = \'" + model + "\' AND price = " + price + " AND size = " + size + ";";
        }
        return null;
    }
}
