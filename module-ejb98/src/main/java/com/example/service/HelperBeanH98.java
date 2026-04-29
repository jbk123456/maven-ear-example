package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH98 {

    @EJB
    private HelperBeanG98 helperBeanG98;

    public String identify() {
        return "HelperBeanH98";
    }
}
