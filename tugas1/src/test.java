import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.DatabaseMetaData;

public class test {
    public static void main(String[] args) {
        database db = new database();
        db.open();
        db.view();
//        System.out.println(db.data);
    }
}
