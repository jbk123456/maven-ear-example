package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK97 {

    @EJB
    private HelperBeanJ97 helperBeanJ97;

    public String identify() {
        return "HelperBeanK97";
    }
}
