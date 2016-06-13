package cl.curso.java.prueba_tres.mValenzuela;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TarjetaBip {

	private int numeroTarjeta;
	private int saldo;
	private List<Viaje> viajes;
	
	public TarjetaBip(){
		
	}

	public TarjetaBip(int numeroTarjeta, int saldo, List<Viaje> viajes) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldo = saldo;
		this.viajes = viajes;
	}

	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta
	 *            the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the viajes
	 */
	public List<Viaje> getViajes() {
		return viajes;
	}

	/**
	 * @param viajes
	 *            the viajes to set
	 */
	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	public void recargar(int monto) {
		this.setSaldo(this.getSaldo() + monto);
	}

	public synchronized void pagarViaje(int valorViaje) throws SinSaldoException {
		if (this.getSaldo() >= valorViaje) {
			this.setSaldo(this.getSaldo() - valorViaje);
			this.getViajes().add(new Viaje(new Date()));

		} else
			throw new SinSaldoException("No dispone de saldo suficiente");
	}

	public void imprimir() {

		Collections.sort(this.getViajes());
		System.out.println(this.getNumeroTarjeta());
		for (Viaje viajes1 : this.getViajes()) {
			System.out.println(viajes1.toString());
		}

	}
}
