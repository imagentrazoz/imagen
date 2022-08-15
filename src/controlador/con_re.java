
package controlador;

import modelo.conexion;
import modelo.mo_re;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class con_re {
    conexion conc=new conexion();
    mo_re mor=new mo_re();
   
    
 
    //se crea metodo puclico void ya que no retorna valores para enlace para la base de datos
    public void inser (String nombre,String correo,String id_usuario,String password,String validar_password){
        
   try{
       
     mor.setNombre(nombre);
     mor.setCorreo(correo);
     mor.setId_usuario(id_usuario);
     mor.setPassword(password);
     mor.setValidar_password(validar_password);
     
        Connection cn=conc.conexion();
   
        String SQL="INSERT INTO registro_usuario(nombre,correo,id_usuario,password,validar_password)values(?,?,?,?,?)";
        PreparedStatement st=cn.prepareStatement(SQL);//se crea tipo stement para al macenar consulta con la coonexion sql
   
         st.setString(1, mor.getNombre());//se asigna valor por  numeros de columnas  que se encuentra relacionado  la base de datos
         st.setString(2, mor.getCorreo());
         st.setString(3, mor.getId_usuario());
         st.setString(4, mor.getPassword());
         st.setString(5, mor.getValidar_password());
         st.executeUpdate(); //codigo que dirige los valores a la base de datos 
         
         
            JOptionPane.showMessageDialog(null,"los datos se insertaron correctamente","INSERTAR",JOptionPane.INFORMATION_MESSAGE);
   
   } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"el registro no fue insertado ","INSERTAR",JOptionPane.ERROR_MESSAGE);
   }
    }
    // 2. se crea METODOS resulset = para la validacion con registro usuario parta dejar ingresar a la aplicacion 
     public ResultSet Consultar(){ 
         try {
             Connection cn=conc.conexion(); //se ecrea otra ves un objecto de tipo conexion al nuevo metodo asignado
             java.sql.Statement leer =null; // se crea variable de tipo stement  y se deja en blanco que es =null
             leer=cn.createStatement(); //se declara = a la conexion 
             ResultSet resultado =null;// se crea variable de tipo resulset = queda todos los registro que consulte a la base de datos
             resultado=leer .executeQuery("SELECT * FROM  registro_usuario"); // guarda la consulta que se le hace  a la base de datos
             return resultado; // me retorna todo lo que trajo de la base de datos
         }catch (SQLException ex){
            return null; // si facha un valaor en blanco
   }
     
     }

   
     
}
