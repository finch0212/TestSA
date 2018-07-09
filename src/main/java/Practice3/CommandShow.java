package Practice3;

import java.sql.*;

public class CommandShow extends Command {

    @Override
    public void Execute(String[] args) {

        try {
            if(args[0].equals("books")){
                ResultSet rs = DBController.InquiryWithResult("select * from books");
                System.out.println("Books:");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": Title: " + rs.getString("title") + " , Author:" + rs.getString("author_id") + " , Year:" + rs.getString("year"));
                }
            }
            else if(args[0].equals("authors")){
                ResultSet rs = DBController.InquiryWithResult("select * from authors");
                System.out.println("Authors:");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " " + rs.getString("lastname"));
                }
            }
            else if(args[0].equals("all")){
                ResultSet rs = DBController.InquiryWithResult("select * from authors");
                System.out.println("Authors:");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " " + rs.getString("lastname"));
                }
                rs = DBController.InquiryWithResult("select * from books");
                System.out.println("Books:");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": Title: " + rs.getString("title") + " , Author:" + rs.getString("author_id") + " , Year:" + rs.getString("year"));
                }
            }
        } catch (Exception e) {

        }
    }
}
