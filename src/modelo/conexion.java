
package modelo;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

   public Connection conexion (){
       Connection conectar=null;//creamos el objeto de tipo conexion
   try {
        Class.forName("com.mysql.cj.jdbc.Driver"); //cargamos el driver pormedio de la clase class.forname
        conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro_trazoz","root","");//se establece la conexion
       /* JOptionPane.showMessageDialog(null,"la conexion se realizo con exito","CONEXION",JOptionPane.INFORMATION_MESSAGE);    */    
   } catch (HeadlessException | ClassNotFoundException | SQLException e){
       JOptionPane.showMessageDialog(null,"no se realizo la conexion a la base de datos "+e,"CONEXION",JOptionPane.ERROR_MESSAGE);
   }
   return conectar;
   
  }

    
    
}
