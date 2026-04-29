package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK30 {

    @EJB
    private HelperBeanJ30 helperBeanJ30;

    public String identify() {
        return "HelperBeanK30";
    }
}
