package org.sos.sixbox.utils.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Lodour on 17/6/21 07:28.
 * DAO助手
 */
public class DAOSupport {
    private SessionFactory sessionFactory;

    protected DAOSupport(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

}