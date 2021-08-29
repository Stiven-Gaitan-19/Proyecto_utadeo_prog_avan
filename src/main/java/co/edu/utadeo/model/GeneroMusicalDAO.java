package co.edu.utadeo.model;

import co.edu.utadeo.config.ConfigDB;
import co.edu.utadeo.domain.Agencia;
import co.edu.utadeo.domain.GeneroMusical;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class GeneroMusicalDAO implements EntityDAO<GeneroMusical>{

    private ConfigDB db = ConfigDB.getInstance();

    @Override
    public void create(GeneroMusical entity) {
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
    public void update(GeneroMusical entity) {
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
    public List<GeneroMusical> findAll() {
        Session session = db.openConnec();
        Transaction trans = null;
        List<GeneroMusical> result = new ArrayList<>();
        try{
            trans = session.beginTransaction();
            result = session.createQuery("FROM GeneroMusical").list();
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
    public GeneroMusical findOne(Integer key) {
        Session session = db.openConnec();
        Transaction trans = null;
        GeneroMusical result = null;
        try{
            trans = session.beginTransaction();
            result = session.get(GeneroMusical.class, key);
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
        GeneroMusical result = null;
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
