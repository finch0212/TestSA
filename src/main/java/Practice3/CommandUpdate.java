package Practice3;

public class CommandUpdate extends Command {

    @Override
    public void Execute(String[] args) {
        if(args[0].equals("author") && args.length==4) {
            try {
                DBController.Inquiry("UPDATE authors SET name = \'"+args[2]+"\', lastname = \'"+args[3]+"\' WHERE id = " + args[1] +";");
                System.out.println("Author updated.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(args[0].equals("book") && args.length==5) {
            try {
                DBController.Inquiry("UPDATE books SET title = \'"+args[2]+"\', author_id = \'"+args[3]+"\', year = \'"+args[4]+"\' WHERE id = " + args[1] +";");
                System.out.println("Book updated.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
