package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH165 {

    @EJB
    private HelperBeanG165 helperBeanG165;

    public String identify() {
        return "HelperBeanH165";
    }
}
