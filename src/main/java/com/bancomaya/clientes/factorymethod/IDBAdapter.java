package com.bancomaya.clientes.factorymethod;

import java.sql.Connection;

public interface IDBAdapter {

	public Connection getConnection();
}
