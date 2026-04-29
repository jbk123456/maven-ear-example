package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO176 {

    @EJB
    private HelperBeanN176 helperBeanN176;

    public String identify() {
        return "HelperBeanO176";
    }
}
