
import java.sql.*;
public class Demojdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
         * import package
         * load and register
         * create connection
         * create statement
         * execute statement
         * process the results
         * close
         * */
        int sid =6;
        int marks =100;
        String sname = "krisvais";
        String url ="jdbc:postgresql://localhost:5432/Demo";
        String uname= "postgres";
        String pass = "****";
        String sql = "Insert into Student values (?,?,?)";
//        Class.forName("org.postgresql.Driver");
        //My jdbc

        //Establishing connnection
        Connection con = DriverManager.getConnection(url,uname,pass);
//        System.out.println("Connection Established");
//        Statement st = con.createStatement();

        /*
        * Prepared statement performs functionality of a cache memory thus helping to
        * reduce the amout of reads on a DB*/
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,sid);
        ps.setInt(2,marks);
        ps.setString(3,sname);
        ps.execute();
//        boolean res= st.execute(sql);
//        ResultSet rs = st.executeQuery(sql);
        //Moves the result pointer by one, therefore giving the right result
//        while(rs.next()){
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getInt(2) + " - ");
//            System.out.println(rs.getString(3));
//        }
//        System.out.println(res);
        con.close();
        System.out.println("Connection Closed");
    }




}
