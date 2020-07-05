package com.imricki.breakingbad.domain.dto;

import java.io.Serializable;
import java.util.List;

public class Character implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private String birthday;

	private List<String> occupation;

	private String img;

	private String status;

	private String nickname;

	private List<Integer> appearance;

	private String portrayed;

	private List<String> category;

}
