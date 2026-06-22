package com.eteration.dp.solid.di.bad;

public class PrinterDesk {
	private DotMatrixPrinterPrinter printer;

	public PrinterDesk(DotMatrixPrinterPrinter printer) {
		super();
		this.printer = printer;
	}
	
	
	public void printFilefast(){

		String API_KEY = "q342342304u2038";

		System.out.println(API_TOKEN);

		printer.print("File Content printed");
	}
	
}
