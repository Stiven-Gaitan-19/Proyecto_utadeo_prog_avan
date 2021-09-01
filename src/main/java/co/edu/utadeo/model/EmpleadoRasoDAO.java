package co.edu.utadeo.model;

import co.edu.utadeo.config.ConfigDB;
import co.edu.utadeo.domain.Coleccion;
import co.edu.utadeo.domain.EmpleadoRaso;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRasoDAO implements EntityDAO<EmpleadoRaso>{

    private ConfigDB db = ConfigDB.getInstance();

    @Override
    public void create(EmpleadoRaso entity) {
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
    public void update(EmpleadoRaso entity) {
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
    public List<EmpleadoRaso> findAll() {
        Session session = db.openConnec();
        Transaction trans = null;
        List<EmpleadoRaso> result = new ArrayList<>();
        try{
            trans = session.beginTransaction();
            result = session.createQuery("FROM EmpleadoRaso").list();
            trans.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            if(trans != null){
                trans.rollback();
            }
        }finally {
            //session.close();
        }
        return result;
    }

    @Override
    public EmpleadoRaso findOne(Integer key) {
        Session session = db.openConnec();
        Transaction trans = null;
        EmpleadoRaso result = null;
        try{
            trans = session.beginTransaction();
            result = session.get(EmpleadoRaso.class, key);
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
        EmpleadoRaso result = null;
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
