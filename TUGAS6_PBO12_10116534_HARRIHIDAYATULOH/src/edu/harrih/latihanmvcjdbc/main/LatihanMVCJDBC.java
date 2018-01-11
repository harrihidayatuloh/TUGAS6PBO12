/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harrih.latihanmvcjdbc.main;

import edu.harrih.latihanmvcjdbc.database.BarbershopDatabases;
import edu.harrih.latihanmvcjdbc.entity.Pelanggan;
import edu.harrih.latihanmvcjdbc.error.PelangganException;
import edu.harrih.latihanmvcjdbc.service.PelangganDAO;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        PelangganDAO dao = BarbershopDatabases.getPelangganDAO();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("HARRI H");
        pelanggan.setAlamat("KOSAN PONDOK BUNDA");
        pelanggan.setTelepon("08121485052");
        pelanggan.setEmail("harrihidayatuloh@gmail.com");
        
        dao.insertPelanggan(pelanggan);
        
    }
    
}
