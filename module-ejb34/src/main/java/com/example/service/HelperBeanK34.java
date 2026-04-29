package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK34 {

    @EJB
    private HelperBeanJ34 helperBeanJ34;

    public String identify() {
        return "HelperBeanK34";
    }
}
