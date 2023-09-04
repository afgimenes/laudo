package com.dicom.job.exception;

public class InvalidFileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6642932446363895931L;

	public InvalidFileException() {
		super();
		
	}

	public InvalidFileException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public InvalidFileException(String arg0) {
		super(arg0);
		
	}

	public InvalidFileException(Throwable arg0) {
		super(arg0);

	}

}