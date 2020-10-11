package com.bancomaya.clientes;

import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.TarjetaDigital;

@WebService
public interface TarjetaDigitalService {

		public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjeta);
		
		public List<TarjetaDigital> obetenerTarjetasDigitales();
		
		public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta);
		
		public TarjetaDigital obtenerTarjetaNombreCliente(String nombreCliente);
}
