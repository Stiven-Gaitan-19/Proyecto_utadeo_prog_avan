package co.edu.utadeo.model;

import co.edu.utadeo.config.ConfigDB;
import co.edu.utadeo.domain.Agencia;
import co.edu.utadeo.domain.Portafolio;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class PortafolioDAO implements EntityDAO<Portafolio>{

    private ConfigDB db = ConfigDB.getInstance();

    @Override
    public void create(Portafolio entity) {
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
    public void update(Portafolio entity) {
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
    public List<Portafolio> findAll() {
        Session session = db.openConnec();
        Transaction trans = null;
        List<Portafolio> result = new ArrayList<>();
        try{
            trans = session.beginTransaction();
            result = session.createQuery("FROM Portafolio").list();
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
    public Portafolio findOne(Integer key) {
        Session session = db.openConnec();
        Transaction trans = null;
        Portafolio result = null;
        try{
            trans = session.beginTransaction();
            result = session.get(Portafolio.class, key);
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
        Portafolio result = null;
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
