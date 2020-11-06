package com.imricki.breakingbad.domain.item;

import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CharacterItem {

	private int charId;

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
