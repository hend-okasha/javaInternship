import java.sql.*;
public class updateEmpoyees {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false);


            String updateVacationSQL = "UPDATE Employee SET Vacation_Balance = 45 WHERE Age > 45";
            try (PreparedStatement pstmt = conn.prepareStatement(updateVacationSQL)) {
                pstmt.addBatch();
                pstmt.executeBatch();
            }


            String updateNameSQL = "UPDATE Employee SET F_Name = CASE WHEN Sex = 'M' THEN CONCAT('Mr. ', F_Name) ELSE CONCAT('Mrs. ', F_Name) END WHERE Age > 45";
            try (PreparedStatement pstmt = conn.prepareStatement(updateNameSQL)) {
                pstmt.addBatch();
                pstmt.executeBatch();
            }

            conn.commit();
            System.out.println("Batch update executed successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
