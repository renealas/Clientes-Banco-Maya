package com.bancomaya.clientes.factorymethod.dao;

import java.util.List;

import com.bancomaya.clientes.factorymethod.entity.TarjetaDigital;

public interface TarjetaDigitalDAO {
	
	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjeta);
	
	public List<TarjetaDigital> obetenerTarjetasDigitales();
	
	public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta);
	
	public TarjetaDigital obtenerTarjetaNombreCliente(String nombreCliente);
}
