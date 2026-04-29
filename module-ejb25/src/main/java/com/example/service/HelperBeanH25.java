package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH25 {

    @EJB
    private HelperBeanG25 helperBeanG25;

    public String identify() {
        return "HelperBeanH25";
    }
}
