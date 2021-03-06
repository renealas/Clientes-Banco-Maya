package com.bancomaya.clientes.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.factorymethod.dao.TarjetaDigitalDAO;
import com.bancomaya.clientes.factorymethod.dao.TarjetaDigitalDAOImpl;
import com.bancomaya.clientes.factorymethod.entity.TarjetaDigital;

@WebService(endpointInterface = "com.bancomaya.clientes.service.TarjetaDigitalService")
public class TarjetaDigitalServiceImpl implements TarjetaDigitalService{
	
	//private static List<TarjetaDigital> tarjetas = new ArrayList<TarjetaDigital>();
	
	/*static {
		TarjetaDigital tarjeta = new TarjetaDigital();
		tarjeta.setId(1);
		tarjeta.setBanco("Banco Albo");
		tarjeta.setCliente("Rene Alas");
		tarjeta.setNumero("2222-2222-2222-2222");
		tarjeta.setNumeroSeguridad("222");
		tarjetas.add(tarjeta);
	}*/
	
	TarjetaDigitalDAO dao = new TarjetaDigitalDAOImpl();

	@Override
	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjeta) {
		//tarjeta.setId(tarjetas.size() +1);
		//tarjetas.add(tarjeta);
		
		return dao.crearTarjetaDigital(tarjeta);
	}

	@Override
	public List<TarjetaDigital> obetenerTarjetasDigitales() {
		return dao.obetenerTarjetasDigitales();
	}

	@Override
	public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaDigital obtenerTarjetaNombreCliente(String nombreCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
