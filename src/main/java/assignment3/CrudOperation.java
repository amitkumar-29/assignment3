package assignment3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;    


public class CrudOperation {
public static void main(String[] args) {
	String DB_URL="jdbc:mysql://localhost/bankaccount";
	String DB_USER="root";
	String DB_PASSWORD="Nuvelabs123$";
	   //Date now =new Date();  

	//Account acc1=new Account("Amit","new address",20F,now,"Active","Savings");
	try(Connection connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			Statement statement=connection.createStatement();){
	
		//create(statement);
		//read(statement);
		//delete(statement);
		update(statement);
		//alter(statement);
		
	} catch(SQLException e) {
		e.printStackTrace();
	}
}
//create
private static void create(Statement statement)throws SQLException {
	statement.execute("insert into accounts values(2,'Sumit','new Address','2021-08-17','active','savings')");
}
private static void read(Statement statement) throws SQLException{
	 final String Query="SELECT * FROM ACCOUNTS WHERE idAccounts=1";
		ResultSet resultSet = statement.executeQuery(Query );
		if(resultSet.next()) {
		System.out.println(resultSet.getNString("name"));
		}

}
private static void delete(Statement  statement) throws SQLException{
	statement.execute("DELETE FROM ACCOUNTS WHERE idAccounts=2");

}
private static void update(Statement statement) throws SQLException{
	statement.execute("UPDATE ACCOUNTS SET balance=33664 WHERE idAccounts=1");

}
private static void alter(Statement statement) throws SQLException{
	statement.execute("ALTER TABLE accounts ADD balance DECIMAL(10,2)");
}
}
