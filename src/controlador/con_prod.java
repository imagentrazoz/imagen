
package controlador;
import modelo.conexion;
import modelo.mo_prod;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class con_prod {
    conexion conc=new conexion();
    mo_prod mor=new mo_prod();
    
 public void ins (String cod_producto ,String n_producto,int cantidad_p,String cod_proveedor ){
        
   try{
       
     mor.setCod_producto(cod_producto);
     mor.setN_producto(n_producto);
     mor.setCantidad_p(cantidad_p);
     mor.setCod_proveedor(cod_proveedor);

     
        Connection cn=conc.conexion();
   
        String SQL="INSERT INTO registro_producto(cod_producto,n_producto,cantidad_p,cod_proveedor)values(?,?,?,?)";
        PreparedStatement st=cn.prepareStatement(SQL);//se crea tipo stement para al macenar consulta con la coonexion sql
   
         st.setString(1, mor.getCod_producto());//se asigna valor por  numeros de columnas  que se encuentra relacionado  la base de datos
         st.setString(2, mor.getN_producto());
         st.setInt(3, mor.getCantidad_p());
         st.setString(4, mor.getCod_proveedor());
         st.executeUpdate(); //codigo que dirige los valores a la base de datos 
            JOptionPane.showMessageDialog(null,"los datos se insertaron correctamente","INSERTAR",JOptionPane.INFORMATION_MESSAGE);
   
   } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"el registro no fue insertado ","INSERTAR",JOptionPane.ERROR_MESSAGE);
   }
    }    
}
