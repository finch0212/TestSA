package Practice3;

public class CommandAdd extends Command {

    @Override
    public void Execute(String[] args) {

        if(args[0].equals("author") && args.length==3) {

            try {
                DBController.Inquiry("INSERT INTO authors (name,lastname) VALUES (\'" + args[1] + "\',\'" + args[2] + "\')");
                System.out.println("New author added.");
            }
            catch (Exception e)
            {
                System.out.println("Can't add new author to DB: " + e.toString());
            }
        }
        else if(args[0].equals("book") && args.length==4)
        {
            try {
                DBController.Inquiry("INSERT INTO books (title,author_id,year) VALUES (\'" + args[1] + "\',\'" + args[2] + "\',\'" + args[3] +"\')");
                System.out.println("New book added.");
            }
            catch (Exception e)
            {
                System.out.println("Can't add new book to DB: " + e.toString());
            }
        }
    }
}
