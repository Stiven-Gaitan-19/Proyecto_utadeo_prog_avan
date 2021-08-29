package co.edu.utadeo.model;

import co.edu.utadeo.config.ConfigDB;
import co.edu.utadeo.domain.Coleccion;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDAO implements EntityDAO<Coleccion>{

    private ConfigDB db = ConfigDB.getInstance();

    @Override
    public void create(Coleccion entity) {
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
    public void update(Coleccion entity) {
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
    public List<Coleccion> findAll() {
        Session session = db.openConnec();
        Transaction trans = null;
        List<Coleccion> result = new ArrayList<>();
        try{
            trans = session.beginTransaction();
            result = session.createQuery("FROM Coleccion").list();
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
    public Coleccion findOne(Integer key) {
        Session session = db.openConnec();
        Transaction trans = null;
        Coleccion result = null;
        try{
            trans = session.beginTransaction();
            result = session.get(Coleccion.class, key);
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
        Coleccion result = null;
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
