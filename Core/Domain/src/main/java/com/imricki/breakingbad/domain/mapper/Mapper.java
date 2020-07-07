package com.imricki.breakingbad.domain.mapper;

public interface Mapper<S, T> {

	public T from(S source);

	public S to(T source);
}
