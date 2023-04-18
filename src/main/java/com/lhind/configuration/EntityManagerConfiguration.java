package com.lhind.configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class EntityManagerConfiguration {

    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("jpa-intro");
    private static final EntityManager ENTITY_MANAGER = FACTORY.createEntityManager();

    private EntityManagerConfiguration(){}

    public static EntityManager getEntityManager(){
        return ENTITY_MANAGER;
    }
}
