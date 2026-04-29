package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG40 {

    @EJB
    private HelperBeanF40 helperBeanF40;

    public String identify() {
        return "HelperBeanG40";
    }
}
