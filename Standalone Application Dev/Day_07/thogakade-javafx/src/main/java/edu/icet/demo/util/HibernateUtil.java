package edu.icet.demo.util;

import edu.icet.demo.entity.CustomerEntity;
import edu.icet.demo.entity.ItemEntity;
import edu.icet.demo.entity.OrderDetailEntity;
import edu.icet.demo.entity.OrderEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory session = createSession();

    private static SessionFactory createSession() {
        StandardServiceRegistry build = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        Metadata metadata = new MetadataSources(build)
                .addAnnotatedClass(CustomerEntity.class)
                .addAnnotatedClass(OrderEntity.class)
                .addAnnotatedClass(OrderDetailEntity.class)
                .addAnnotatedClass(ItemEntity.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        return metadata.getSessionFactoryBuilder().build();
    }

    public static Session getSession(){
        return session.openSession();
    }
}
