/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmenu;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Tiwi
 */
@Entity
public class hargamenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String kdbarang;
    private String jenisbarang;
    private String harga;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof hargamenu)) {
            return false;
        }
        hargamenu other = (hargamenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "daftarmenu.hargamenu[ id=" + id + " ]";
    }

    /**
     * @return the kdbarang
     */
    public String getKdbarang() {
        return kdbarang;
    }

    /**
     * @param kdbarang the kdbarang to set
     */
    public void setKdbarang(String kdbarang) {
        this.kdbarang = kdbarang;
    }

    /**
     * @return the jenisbarang
     */
    public String getJenisbarang() {
        return jenisbarang;
    }

    /**
     * @param jenisbarang the jenisbarang to set
     */
    public void setJenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    /**
     * @return the harga
     */
    public String getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(String harga) {
        this.harga = harga;
    }
    
}
