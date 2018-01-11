/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harrih.latihanmvcjdbc.model;

import edu.harrih.latihanmvcjdbc.database.BarbershopDatabases;
import edu.harrih.latihanmvcjdbc.entity.Pelanggan;
import edu.harrih.latihanmvcjdbc.error.PelangganException;
import edu.harrih.latihanmvcjdbc.event.PelangganListener;
import edu.harrih.latihanmvcjdbc.service.PelangganDAO;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class PelangganModel {
    private int id;
    private String nama;
    private String alamat;
    private String telepon;
    private String email;

    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }
    
    protected void fieOnChange(){
        if (listener!=null){
            listener.onChange(this);
        }
    }
    protected void fieOnInsert(Pelanggan pelanggan){
        if (listener!=null){
            listener.onInsert(pelanggan);
        }
        
    }
    protected void fieOnUpdate(Pelanggan pelanggan){
        if (listener!=null){
            listener.onUpdate(pelanggan);
        }
    }
    protected void fieOnDelete(){
        if (listener!=null){
            listener.onDelete();
        }
    }
    public void insertPelanggan() throws SQLException, PelangganException{
     
        PelangganDAO dao = BarbershopDatabases.getPelangganDAO();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelepon(telepon);
        pelanggan.setEmail(email);
        
        dao.insertPelanggan(pelanggan);
        fieOnInsert(pelanggan);
    }
    
    public void deletePelanggan() throws SQLException, PelangganException{
     
        PelangganDAO dao = BarbershopDatabases.getPelangganDAO();
        dao.deletePelanggan(id);
        fieOnDelete();
    }

    public void resetPelanggan(){
        setId(0);
        setNama("");
        setAlamat("");
        setTelepon("");
        setEmail("");
    }

    private void fireOnChange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updatePelanggan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
