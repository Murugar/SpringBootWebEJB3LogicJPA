package com.iqmsoft.boot.wlogic.jpa.ejb3;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
public interface MyServiceInterface{
    void someMethod();
    void someMethod1();
    void someData();
}
