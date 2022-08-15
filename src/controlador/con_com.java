

package controlador;
import modelo.conexion;
import modelo.mo_com;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class con_com {
    conexion conc=new conexion();
    mo_com mor=new mo_com();
    
 public void ins (String cod_compra ,String cod_factura,String cod_producto,int cantidad_c,String fecha){
        
   try{
       
     mor.setCod_compra(cod_compra);
     mor.setCod_factura(cod_factura);
     mor.setCod_producto(cod_producto);
     mor.setCantidad_c(cantidad_c);
     mor.setFecha(fecha);
     
        Connection cn=conc.conexion();
   
        String SQL="INSERT INTO registro_compra(cod_compra,cod_factura,cod_producto,cantidad_c,fecha)values(?,?,?,?,?)";
        PreparedStatement st=cn.prepareStatement(SQL);//se crea tipo stement para al macenar consulta con la coonexion sql
   
         st.setString(1, mor.getCod_compra());//se asigna valor por  numeros de columnas  que se encuentra relacionado  la base de datos
         st.setString(2, mor.getCod_factura());
         st.setString(3, mor.getCod_producto());
         st.setInt(4, mor.getCantidad_c());
         st.setString(5, mor.getFecha());
         st.executeUpdate(); //codigo que dirige los valores a la base de datos 
            JOptionPane.showMessageDialog(null,"los datos se insertaron correctamente","INSERTAR",JOptionPane.INFORMATION_MESSAGE);
   
   } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"el registro no fue insertado ","INSERTAR",JOptionPane.ERROR_MESSAGE);
   }
    }    
    
    
    
}
