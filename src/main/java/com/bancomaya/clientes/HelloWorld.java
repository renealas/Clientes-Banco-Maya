package com.bancomaya.clientes;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

