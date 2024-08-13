import java.sql.*;

public class insertEmployees {
    public static void main(String[] args) {
       final String url= "jdbc:mysql://localhost:3306/mydb";
       final String user= "root";
       final String password= "1234";

       String insertSQL = "INSERT INTO Employee (Id, F_Name, L_Name, Sex, Age, Address, Phone_Number, Vacation_Balance) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        String updateVacationSQL = "UPDATE Employee SET Vacation_Balance = 45 WHERE Age > 45";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {


            pstmt.setInt(1, 1);
            pstmt.setString(2, "Hend");
            pstmt.setString(3, "okasha");
            pstmt.setString(4, "F");
            pstmt.setInt(5, 21);
            pstmt.setString(6, "123 Elm Street");
            pstmt.setString(7, "555-1234");
            pstmt.setInt(8, 30);
            pstmt.addBatch();


            pstmt.setInt(1, 2);
            pstmt.setString(2, "Mohammed");
            pstmt.setString(3, "Alaa");
            pstmt.setString(4, "M");
            pstmt.setInt(5, 18);
            pstmt.setString(6, "456 Oak Street");
            pstmt.setString(7, "555-5678");
            pstmt.setInt(8, 30);
            pstmt.addBatch();

            pstmt.setInt(1, 3);
            pstmt.setString(2, "Hager");
            pstmt.setString(3, "Mohammed");
            pstmt.setString(4, "F");
            pstmt.setInt(5, 21);
            pstmt.setString(6, "456 tes Street");
            pstmt.setString(7, "555-45878");
            pstmt.setInt(8, 30);
            pstmt.addBatch();

            pstmt.setInt(1, 4);
            pstmt.setString(2, "Amira");
            pstmt.setString(3, "Ali");
            pstmt.setString(4, "F");
            pstmt.setInt(5, 30);
            pstmt.setString(6, "456 Abd Street");
            pstmt.setString(7, "555-34987");
            pstmt.setInt(8, 30);
            pstmt.addBatch();

            pstmt.setInt(1, 5);
            pstmt.setString(2, "Ahmed");
            pstmt.setString(3, "elsayed");
            pstmt.setString(4, "M");
            pstmt.setInt(5, 14);
            pstmt.setString(6, "456 OLk Street");
            pstmt.setString(7, "555-54398");
            pstmt.setInt(8, 30);
            pstmt.addBatch();


            pstmt.executeBatch();

            System.out.println("Rows inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    }
