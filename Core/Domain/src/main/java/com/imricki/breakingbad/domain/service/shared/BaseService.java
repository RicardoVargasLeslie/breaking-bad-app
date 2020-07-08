package com.imricki.breakingbad.domain.service.shared;

import java.util.List;

public abstract interface BaseService {

	List<Object> getAll();

	Object getBy(Object criteria);

}
