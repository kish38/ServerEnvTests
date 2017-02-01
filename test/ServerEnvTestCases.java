import com.netenrich.*;
import java.sql.*;
import static org.junit.Assert.*;
import org.junit.Test;
public class ServerEnvTestCases {
	@Test
	public void Databasetest(){
		DatabaseDetails main = new DatabaseDetails();
		String database_url = main.Databaseurl();
		String database_username = main.Databaseusername();
		String database_password = main.Databasepassword();
		Databaseconnection db_connection = new Databaseconnection(database_username,database_password,database_url);
		java.sql.Connection connection = db_connection.Access_Database();
		assertNotNull(connection);
	}
	@Test
 	public void bothgivencorrect(){
  	Login n=new Login("1","1");
  	assertEquals("You are logged in.",n.validate());
 	}
 	@Test
 	public void bothgivenwrong(){
  	Login n=new Login("username","password");
  	assertEquals("Login Failed.",n.validate());
	 }
 	@Test
 	public void bothareOmitted(){
  	Login n=new Login("","");
  	assertEquals("Login Failed.",n.validate());
  	}
}
