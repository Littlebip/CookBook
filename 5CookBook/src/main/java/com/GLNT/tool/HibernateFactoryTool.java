package com.GLNT.tool;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;

public class HibernateFactoryTool {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
//			try {
			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
			// by default configures the resource file hibernate.cfg.xml
			Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
			sessionFactory = meta.getSessionFactoryBuilder().build();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
