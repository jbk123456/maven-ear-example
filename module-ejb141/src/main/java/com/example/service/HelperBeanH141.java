package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH141 {

    @EJB
    private HelperBeanG141 helperBeanG141;

    public String identify() {
        return "HelperBeanH141";
    }
}
