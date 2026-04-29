package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL151 {

    @EJB
    private HelperBeanK151 helperBeanK151;

    public String identify() {
        return "HelperBeanL151";
    }
}
