package com.algaworks.osworks.api.model;

import javax.validation.constraints.NotNull;

public class ClienteIdInpult {
	
	@NotNull
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}