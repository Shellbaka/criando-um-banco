package Dio.banco_spring_poo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoSpringPooApplication {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new contaCorrente(venilton);
		Conta poupanca = new contaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
