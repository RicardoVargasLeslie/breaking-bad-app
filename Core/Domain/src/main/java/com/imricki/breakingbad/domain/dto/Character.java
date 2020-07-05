package com.imricki.breakingbad.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Character implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private String birthday;

	private ArrayList<String> occupation;

	private String img;

	private String status;

	private String nickname;

	private ArrayList<Integer> appearance;

	private String portrayed;

	private ArrayList<String> category;

}
