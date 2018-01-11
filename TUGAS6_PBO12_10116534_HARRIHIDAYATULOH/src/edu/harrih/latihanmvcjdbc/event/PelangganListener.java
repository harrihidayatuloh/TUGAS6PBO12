/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harrih.latihanmvcjdbc.event;

import edu.harrih.latihanmvcjdbc.entity.Pelanggan;
import edu.harrih.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author ASUS
 */
public interface PelangganListener {
   
    public void onChange(PelangganModel model);
    public void onList(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelaggan);

    public void onInsert(Pelanggan pelanggan);

    public void onInsert(Pelanggan pelanggan);

    public void onInsert(Pelanggan pelanggan);
    
}
