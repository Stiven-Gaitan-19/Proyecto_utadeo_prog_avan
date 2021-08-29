package co.edu.utadeo.model;

import co.edu.utadeo.config.ConfigDB;
import co.edu.utadeo.domain.Coleccion;
import co.edu.utadeo.domain.Empleado;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO implements EntityDAO<Empleado>{

    private ConfigDB db = ConfigDB.getInstance();

    @Override
    public void create(Empleado entity) {
        Session session = db.openConnec();
        Transaction trans = null;
        try{
            trans = session.beginTransaction();
            session.save(entity);
            trans.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            if(trans != null){
                trans.rollback();
            }
        }finally {
            session.close();
        }
    }

    @Override
    public void update(Empleado entity) {
        Session session = db.openConnec();
        Transaction trans = null;
        try{
            trans = session.beginTransaction();
            session.update(entity);
            trans.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            if(trans != null){
                trans.rollback();
            }
        }finally {
            session.close();
        }
    }

    @Override
    public List<Empleado> findAll() {
        Session session = db.openConnec();
        Transaction trans = null;
        List<Empleado> result = new ArrayList<>();
        try{
            trans = session.beginTransaction();
            result = session.createQuery("FROM Empleado").list();
            trans.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            if(trans != null){
                trans.rollback();
            }
        }finally {
            session.close();
        }
        return result;
    }

    @Override
    public Empleado findOne(Integer key) {
        Session session = db.openConnec();
        Transaction trans = null;
        Empleado result = null;
        try{
            trans = session.beginTransaction();
            result = session.get(Empleado.class, key);
            trans.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            if(trans != null){
                trans.rollback();
            }
        }finally {
            session.close();
        }
        return result;
    }

    @Override
    public void deleteOne(Integer key) {
        Session session = db.openConnec();
        Transaction trans = null;
        Empleado result = null;
        try{
            trans = session.beginTransaction();
            result = this.findOne(key);
            session.delete(result);
            trans.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            if(trans != null){
                trans.rollback();
            }
        }finally {
            session.close();
        }
    }
}
