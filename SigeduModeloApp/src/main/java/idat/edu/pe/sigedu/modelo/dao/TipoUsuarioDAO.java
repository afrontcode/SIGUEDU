package idat.edu.pe.sigedu.modelo.dao;


import idat.edu.pe.sigedu.modelo.TipoUsuario;
import idat.edu.pe.sigedu.modelo.util.JDBCutil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoUsuarioDAO implements  DAOBaseI<TipoUsuario, Integer>{
    
    private JDBCutil jdbc;

    public TipoUsuarioDAO(JDBCutil jdbc) {
        this.jdbc = jdbc;
    }
    

    @Override
    public List<TipoUsuario> buscarTodo() {
        String sql = "SELECT id,descripcion FROM tipousuario;";
        PreparedStatement pStament = jdbc.obtenerPreparedStatement(sql);
        ResultSet rs = jdbc.ejecutarConsulta(pStament);
        List<TipoUsuario> resultado = new ArrayList<TipoUsuario>();
        TipoUsuario objEncontrado = null;
        
        
        try {
            while (rs.next())
            {
                objEncontrado = new TipoUsuario();
                objEncontrado.setId(rs.getInt("id"));
                objEncontrado.setDescripcion(rs.getString("descripcion"));
                resultado.add(objEncontrado);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return resultado;
        
    }

    @Override
    public TipoUsuario buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(TipoUsuario object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(TipoUsuario object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
