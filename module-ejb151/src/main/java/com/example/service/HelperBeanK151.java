package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK151 {

    @EJB
    private HelperBeanJ151 helperBeanJ151;

    public String identify() {
        return "HelperBeanK151";
    }
}
