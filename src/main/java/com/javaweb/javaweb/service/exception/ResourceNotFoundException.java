package com.javaweb.javaweb.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 3094212736720148502L;

	public ResourceNotFoundException(Object id) {
		super("Resource not found Id" + id);
	}
}
