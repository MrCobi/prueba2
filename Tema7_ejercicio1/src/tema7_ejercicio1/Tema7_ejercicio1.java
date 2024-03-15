package tema7_ejercicio1;

class CuentaBancaria {
	 protected int saldo = 0;

	public void operar(int a) {
		saldo += a;
	}
}

class Prueba {
	
	public static void main(String[] args) {
		CuentaBancaria c = new CuentaBancaria();
		c.operar(-1000);
		System.out.println(c.saldo);
	}
}
