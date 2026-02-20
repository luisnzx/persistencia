/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luisn
 */
public class ControladorTarea {
    private static EntityManagerFactory emf;
    private static ControladorTarea instancia;

    private ControladorTarea() {
        // Cambia aquí el nombre según lo que quieras usar:
        // "ObjectDB_Unit" para Windows o "MariaDB_Unit" para Ubuntu
        emf = Persistence.createEntityManagerFactory("MariaDB_Unit");
    }

    public static ControladorTarea getInstancia() {
        if (instancia == null) instancia = new ControladorTarea();
        return instancia;
    }
    
    // Al usar em.persist(), el objeto se sincroniza automáticamente 
    public void nuevaTarea(Tarea t) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(t); 
        em.getTransaction().commit();
        em.close();
    }
}