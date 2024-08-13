import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/mydb";
            String user="root";
            String password= "1234";
            String query= " select emp_id , first_name ,last_name from employees";

            Connection con=DriverManager.getConnection(url,user,password);
            Statement stmnt = con.createStatement();
            ResultSet rslt = stmnt.executeQuery(query);

            while (rslt.next()){
                int id = rslt.getInt("emp_id");
                String firstName= rslt.getString("first_name");
                String lastName= rslt.getString("last_name");
                System.out.println("id : " + id + " first name : " + firstName +" last name : " + lastName);
            }
            rslt.close();
            stmnt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e)
         {
            e.printStackTrace();

        }

    }
}