package Practice3;

import java.sql.*;

public class DBController {

    public static Connection connection;
    public static Statement statement;
    public int idACount;
    public int idBCount;

    public static void Connect()
    {
        try {
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:file:~/test",
                    "sa", "");
            statement = connection.createStatement();
            //CreateDB();

        }
        catch (Exception e)
        {
            System.out.println("Can't connect to DB: " + e.toString());
        }

    }

    public static ResultSet InquiryWithResult(String str)
    {
        try {
            ResultSet rs = statement.executeQuery(str);
            return rs;
        }
        catch (Exception e)
        {
            System.out.println("Can't handle inquiry: " + e.toString());
        }
        return  null;
    }

    public static void Inquiry(String str) throws  Exception {

        statement.execute(str);
    }


    public static void CreateDB()
    {
        try {
            /*statement.execute("create table authors(" +
                    "id integer primary key auto_increment, " + "name varchar(100)," +
                    "lastname varchar(100));");*/
            //statement.execute("CREATE TABLE Books (id integer NOT NULL AUTO_INCREMENT, title varchar(255) NOT NULL, author_id integer NOT NULL, year integer, CONSTRAINT PK_Books PRIMARY KEY (id));");

        }
        catch (Exception e)
        {
            System.out.println("Can't create DB: " + e.toString());
        }
    }

    /*public static int GetAuthorsMaxId()
    {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM authors ORDER BY ID DESC LIMIT 1");
            rs.next();
            if (!rs.next()) {
                return -1;
            }
            return rs.getInt("id");
        }
        catch (Exception e)
        {
            System.out.println("Can't get Authors Max Id DB: " + e.toString());
        }
        return 0;
    }

    public static int GetBooksMaxId()
    {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM books ORDER BY ID DESC LIMIT 1");
            rs.next();
            return  rs.getInt("id");
        } catch (Exception e) {
            System.out.println("Can't get Books Max Id DB: " + e.toString());
        }
        return 0;
    }*/

}
