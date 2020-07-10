package com.imricki.breakingbad.domain.mapper;

import org.modelmapper.ModelMapper;

import com.imricki.breakingbad.domain.dto.Quote;

public final class MapperUtil {

	private ModelMapper modelMapper;

	Quote quoteDto;

	private MapperUtil() {

		this.modelMapper = new ModelMapper();
	}

//	@Override
//	public Object toItem( source) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Object fromdto(Object source) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
