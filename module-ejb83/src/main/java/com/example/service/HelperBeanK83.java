package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK83 {

    @EJB
    private HelperBeanJ83 helperBeanJ83;

    public String identify() {
        return "HelperBeanK83";
    }
}
