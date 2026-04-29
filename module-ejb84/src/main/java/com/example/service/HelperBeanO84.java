package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO84 {

    @EJB
    private HelperBeanN84 helperBeanN84;

    public String identify() {
        return "HelperBeanO84";
    }
}
