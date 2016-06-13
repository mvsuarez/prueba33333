package cl.curso.java.prueba_tres.mValenzuela;

import java.util.Date;

public class Viaje implements Comparable<Viaje> {

	private Date fecha;
	private int saldoTarjeta;
	private int valorViaje;

	public Viaje() {
	}

	public Viaje(int saldoTarjeta, int valorViaje) {
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}

	public Viaje(Date fecha) {
		this.fecha = fecha;
	}

	public Viaje(Date fecha, int saldoTarjeta, int valorViaje) {
		super();
		this.fecha = fecha;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 *            the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the saldoTarjeta
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}

	/**
	 * @param saldoTarjeta
	 *            the saldoTarjeta to set
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}

	/**
	 * @return the valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}

	/**
	 * @param valorViaje
	 *            the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	@Override
	public String toString() {
		return this.getFecha() + " " + this.getSaldoTarjeta() + " " + this.getValorViaje();

	}

	public int compareTo(Viaje viaje) {
		return this.getFecha().compareTo(viaje.getFecha());
	}

}
