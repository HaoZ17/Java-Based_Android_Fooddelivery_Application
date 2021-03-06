public class DatabaseConstant {

    public static final String PROTOCAL = "jdbc:derby:";

    public static final String CREATE = "CREATE TABLE orders (order_id int primary key, "
            + "account_id int,"
            + "total double,"
            + "status varchar(20))";

    public static final String CREATE_DETAIL = "CREATE TABLE order_detail (order_id int, "
            + "name varchar(20),"
            + "price double,"
            + "quantity int, primary key (order_id, name))";

    public static final String CREATE_USER = "CREATE TABLE users ("
            + "account_id int GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
            + "account varchar(20),"
            + "password varchar(20))";

    public static final String EMBEDDED_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";

    public static final String DATABASE_PATH = "./rsdb";

    public static final String INVENTORY = "inventory.txt";

}
