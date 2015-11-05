package com.cbi.eis.persistence.hibernate;

public interface HibernateSessionFactoryAware {
    void setHibernateSessionFactory(HibernateSessionFactory hsf);
}
