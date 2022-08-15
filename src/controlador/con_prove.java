
package controlador;
import modelo.conexion;
import modelo.mo_prove;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class con_prove {
    conexion conc=new conexion();
    mo_prove mor=new mo_prove();
    
 public void ins (String cod_proveedor,String n_empresa,int telefono,int nit){
        
   try{
       
     mor.setCod_proveedor(cod_proveedor);
     mor.setN_empresa(n_empresa);
     mor.setTelefono(telefono);
     mor.setNit(nit);

     
        Connection cn=conc.conexion();
   
        String SQL="INSERT INTO registro_proveedores(cod_proveedor,n_empresa,telefono,nit)values(?,?,?,?)";
        PreparedStatement st=cn.prepareStatement(SQL);//se crea tipo stement para al macenar consulta con la coonexion sql
   
         st.setString(1, mor.getCod_proveedor());//se asigna valor por  numeros de columnas  que se encuentra relacionado  la base de datos
         st.setString(2, mor.getN_empresa());
         st.setInt(3, mor.getTelefono());
         st.setInt(4, mor.getNit());
         st.executeUpdate(); //codigo que dirige los valores a la base de datos 
            JOptionPane.showMessageDialog(null,"los datos se insertaron correctamente","INSERTAR",JOptionPane.INFORMATION_MESSAGE);
   
   } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"el registro no fue insertado ","INSERTAR",JOptionPane.ERROR_MESSAGE);
   }
    }    
    
}
