package co.edu.utadeo.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ConfigDB {

    private static ConfigDB configDB;
    private SessionFactory factory;

    private ConfigDB(){
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        factory = metadata.getSessionFactoryBuilder().build();
    }

    public static ConfigDB getInstance(){
        if(configDB == null){
            configDB = new ConfigDB();
        }
        return configDB;
    }

    public Session openConnec(){
        return factory.openSession();
    }

}
