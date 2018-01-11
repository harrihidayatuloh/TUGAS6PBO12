package edu.harrih.latihanmvcjdbc.database;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.harrih.latihanmvcjdbc.impl.PelangganDAOImpl;
import edu.harrih.latihanmvcjdbc.service.PelangganDAO;
import java.sql.Connection;
import java.sql.SQLException;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class BarbershopDatabases {
    
    private static Connection connection;
    private static PelangganDAO pelangganDAO;
    
    public static Connection getConnection() throws SQLException{
        if(connection == null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/barbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static PelangganDAO getPelangganDAO() throws SQLException{
        
        if (pelangganDAO==null){
            pelangganDAO = new PelangganDAOImpl(getConnection());
        }
        return pelangganDAO;
    }
}
