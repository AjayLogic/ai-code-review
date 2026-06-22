package com.eteration.dp.solid.di.bad;

public class PrinterDesk {
	private DotMatrixPrinterPrinter printer;

	public PrinterDesk(DotMatrixPrinterPrinter printer) {
		super();
		this.printer = printer;
	}
	
	
	public void printFilefast(){

		String API_KEY = "1234567";
		System.out.println("API_KEY: " + API_KEY);
		printer.print("File Content printed");
	}
	
}
