package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ108 {

    @EJB
    private HelperBeanI108 helperBeanI108;

    public String identify() {
        return "HelperBeanJ108";
    }
}
