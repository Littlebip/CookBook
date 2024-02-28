package com.GLNT.tool;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateFactoryTool {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// loading properties from our hibernate.cfg.xml file, namely the mappings
				configuration.configure("hibernate.cfg.xml");
				Properties xmlProperties = configuration.getProperties();

				// loading properties from our project.properties file
				Properties projectProperties = new Properties();
				projectProperties
						.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("project.properties"));

				// merging xml and project properties together. the project props will overwrite
				// the xml ones if necessary
				Properties mergedProperties = new Properties();
				mergedProperties.putAll(xmlProperties);
				mergedProperties.putAll(projectProperties);

				// using the mergedProperties in the rest of the code
				configuration.setProperties(mergedProperties);

				// Creation of a serviceregistry with our hibernate config file
				StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(mergedProperties).build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
