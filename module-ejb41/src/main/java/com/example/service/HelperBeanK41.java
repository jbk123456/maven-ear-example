package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK41 {

    @EJB
    private HelperBeanJ41 helperBeanJ41;

    public String identify() {
        return "HelperBeanK41";
    }
}
