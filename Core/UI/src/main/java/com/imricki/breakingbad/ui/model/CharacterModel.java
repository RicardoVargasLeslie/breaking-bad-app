package com.imricki.breakingbad.ui.model;

import java.util.ArrayList;

import javafx.beans.property.StringProperty;
import lombok.Data;

@Data
public class CharacterModel  {


	private int id;

	private StringProperty name;

	private StringProperty birthday;

	private ArrayList<String> occupation;

	private StringProperty img;

	private StringProperty status;

	private StringProperty nickname;

	private ArrayList<Integer> appearance;

	private StringProperty portrayed;

	private ArrayList<String> category;

}
