package com.imricki.breakingbad.domain.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Character implements Serializable {

	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private static final long serialVersionUID = 1L;

	@JsonProperty("char_id")
	private int charId;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("birthday")
	private String birthday;
	
	@JsonProperty("occupation")
	private List<String> occupation=new ArrayList<String>();
	
	@JsonProperty("img")
	private String img;
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("nickname")
	private String nickname;
	
	@JsonProperty("appearance")
	private List<Integer> appearance=new ArrayList<Integer>();
	
	@JsonProperty("portrayed")
	private String portrayed;
	
	@JsonProperty("category")
	private List<String> category;

}
