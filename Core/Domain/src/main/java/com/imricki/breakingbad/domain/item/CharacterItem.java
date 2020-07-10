package com.imricki.breakingbad.domain.item;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class CharacterItem implements Serializable {

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
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<String> occupation;
	
	@JsonProperty("img")
	private String img;
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("nickname")
	private String nickname;
	
	@JsonProperty("appearance")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<Integer> appearance;
	
	@JsonProperty("portrayed")
	private String portrayed;
	
	@JsonProperty("category")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<String> category;

}
