package com.imricki.breakingbad.domain.mapper;

import org.modelmapper.ModelMapper;

import com.imricki.breakingbad.domain.dto.Quote;

public final class MapperUtil implements Mapper<Object, Object> {

	private ModelMapper modelMapper;

	private MapperUtil() {

		this.modelMapper = new ModelMapper();
	}

	@Override
	public Object from(Object source) {

		return this.modelMapper.map(source, Quote.class);
	}

	@Override
	public Object to(Object source) {

		return this.modelMapper.map(source, Quote.class);

	}

}
