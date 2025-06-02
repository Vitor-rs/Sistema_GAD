package com.ifms.gad.config.exception;

/**
 * Exceção para recursos não encontrados
 */
public class ResourceNotFoundException extends BusinessException {
    
    public ResourceNotFoundException(String resource, Object id) {
        super(String.format("%s não encontrado com ID: %s", resource, id));
    }
    
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
