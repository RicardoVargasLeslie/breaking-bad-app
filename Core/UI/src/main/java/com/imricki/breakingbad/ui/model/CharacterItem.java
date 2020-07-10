package com.imricki.breakingbad.ui.model;

import java.util.ArrayList;
import lombok.Data;

@Data
public class CharacterItem  {


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
