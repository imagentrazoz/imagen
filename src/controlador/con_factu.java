
package controlador;
import modelo.conexion;
import modelo.mo_factu;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class con_factu {
   conexion conc=new conexion();
    mo_factu mor=new mo_factu();
    
 public void ins (String cod_factura ,String cod_compra ,String fecha){
        
   try{
       
     mor.setCod_factura(cod_factura);
     mor.setCod_compra(cod_compra);
     mor.setFecha(fecha);
    

     
        Connection cn=conc.conexion();
   
        String SQL="INSERT INTO consultar_factura(cod_factura,cod_compra,fecha)values(?,?,?)";
        PreparedStatement st=cn.prepareStatement(SQL);//se crea tipo stement para al macenar consulta con la coonexion sql
   
         st.setString(1, mor.getCod_factura());//se asigna valor por  numeros de columnas  que se encuentra relacionado  la base de datos
         st.setString(2, mor.getCod_compra());
         st.setString(3, mor.getFecha());
        
         st.executeUpdate(); //codigo que dirige los valores a la base de datos 
            JOptionPane.showMessageDialog(null,"los datos se insertaron correctamente","INSERTAR",JOptionPane.INFORMATION_MESSAGE);
   
   } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"el registro no fue insertado ","INSERTAR",JOptionPane.ERROR_MESSAGE);
   }
    }    
    
}
