package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK163 {

    @EJB
    private HelperBeanJ163 helperBeanJ163;

    public String identify() {
        return "HelperBeanK163";
    }
}
