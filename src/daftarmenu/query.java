/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmenu;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author Tiwi
 */
public class query {
    

     public void Add(Object object) {
        
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("daftarmenuPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        try {
                em.persist(object);
                em.getTransaction().commit();
        } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
        } finally {
                em.close();
        }
    }
    
  public void update(String a,String b,String c){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("daftarmenuPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        em.createQuery("UPDATE hargamenu e SET e.kdbarang=?1,e.jenisbarang=?2, WHERE e.harga=?3",hargamenu.class).setParameter(1, a).setParameter(2, b).setParameter(3, c).executeUpdate();
        em.getTransaction().commit();
  }
  
  public void hapus(String kdbarang){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("daftarmenuPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        int hapus=em.createQuery("DELETE FROM hargamenu e WHERE e.kdbarang:par").setParameter("par", kdbarang).executeUpdate();
        em.getTransaction().commit();
      
        
  }
  public void Show() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("daftarmenuPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM hargamenu e");
        List<hargamenu> result = query.getResultList();
        for (hargamenu e : result) {
                 System.out.println("kdbarang :"+ e.getKdbarang()+ "\n jenisbarang :" + e.getJenisbarang()+ "\n harga :" +e.getHarga());   
        }
    }
}