package idat.edu.pe.sigedu.modelo.dao;

import java.util.List;

/**
 *
 * @author Administrador
 */
public interface DAOBaseI <T, ID > {
    
    List <T> buscarTodo();
    
    T buscarPorId(ID id);
    
    void crear(T object);
    
    void actualizar(T object);
    
    void borrar(ID id);
}
