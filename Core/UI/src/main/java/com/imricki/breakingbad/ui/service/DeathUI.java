package com.imricki.breakingbad.ui.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.item.DeathItem;
import com.imricki.breakingbad.domain.service.DeathClient;
import com.imricki.breakingbad.ui.model.DeathModel;

@Service
public class DeathUI implements DeathUIService {

	@Autowired
	private DeathClient service;

	@Override
	public List<DeathModel> getAll() {

		List<DeathItem> itemList = this.service.getAll();
		List<DeathModel> modelList = new ArrayList<>();

		for (DeathItem item : itemList) {

			DeathModel m = new DeathModel(item.getId(), item.getDeath(), item.getCause(), item.getResponsible(),
					item.getLastWords(), String.valueOf(item.getSeason()), item.getEpisode(), item.getNumberOfdeaths());

			modelList.add(m);
		}

		return modelList;
	}

	@Override
	public DeathModel getRandom() {

		DeathModel model = new DeathModel();

		return model.toFxBean(this.service.getRandom());
	}

}
