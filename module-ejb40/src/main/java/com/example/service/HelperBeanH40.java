package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH40 {

    @EJB
    private HelperBeanG40 helperBeanG40;

    public String identify() {
        return "HelperBeanH40";
    }
}
