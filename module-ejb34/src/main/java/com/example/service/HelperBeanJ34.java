package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ34 {

    @EJB
    private HelperBeanI34 helperBeanI34;

    public String identify() {
        return "HelperBeanJ34";
    }
}
