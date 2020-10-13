package com.bancomaya.clientes.service;

import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.factorymethod.entity.TarjetaDigital;

@WebService
public interface TarjetaDigitalService {

		public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjeta);
		
		public List<TarjetaDigital> obetenerTarjetasDigitales();
		
		public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta);
		
		public TarjetaDigital obtenerTarjetaNombreCliente(String nombreCliente);
}
