package com.br.lp3.model.dao;

import com.br.lp3.model.ConnectionFactory;
import com.br.lp3.model.javabeans.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 31431038
 */
public class UserDAO implements GenericDAO {
    
    private PreparedStatement ps;
    private Connection conn;

    public UserDAO() {
        try{
            conn = ConnectionFactory.getConnection();
        } catch (SQLException | ClassNotFoundException ex){
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    

    @Override
    public boolean Insert(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> read() {
        
        String query = "SELECT * FROM usuario";
        
        List<User> users = new ArrayList<>();
        try {
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String nome = rs.getString("username");
                String senha = rs.getString("password");
                int id = rs.getInt("id_usuario");
                User u = new User(id,nome,senha);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex){
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
