package com.imricki.breakingbad.ui.dto;

import java.util.List;

import javafx.beans.property.ListProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CharacterDto {

	private Integer id;

	private String name;

	private String birthday;

	private List<String> occupation;

	private String img;

	private String status;

	private String nickname;

	private ListProperty<String> appearance;

	private String portrayed;

	private List<String> category;

}
