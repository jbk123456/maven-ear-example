package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH84 {

    @EJB
    private HelperBeanG84 helperBeanG84;

    public String identify() {
        return "HelperBeanH84";
    }
}
