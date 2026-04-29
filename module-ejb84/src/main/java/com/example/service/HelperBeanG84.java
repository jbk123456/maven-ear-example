package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG84 {

    @EJB
    private HelperBeanF84 helperBeanF84;

    public String identify() {
        return "HelperBeanG84";
    }
}
