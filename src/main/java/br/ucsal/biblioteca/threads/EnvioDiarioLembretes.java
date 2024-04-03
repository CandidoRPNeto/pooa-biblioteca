package br.ucsal.biblioteca.threads;

import br.ucsal.biblioteca.controller.Biblioteca;

public class EnvioDiarioLembretes implements Runnable {
	
	private Biblioteca biblioteca;
	
	public EnvioDiarioLembretes(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	@Override
	public void run() {
        try {
            Thread.sleep((long) 1000*60*60*24 );
            System.out.println("\n--- Enviando Lembretes de Devolução ---");
            biblioteca.enviarLembretesDevolucao();
            System.out.println("\n--- Lembretes de Devolução Enviados---");
            this.run();
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida.");
        }
	}

}
