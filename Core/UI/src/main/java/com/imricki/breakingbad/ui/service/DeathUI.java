package com.imricki.breakingbad.ui.service;

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
		List<DeathModel> modelList;

		for (DeathItem deathItem : itemList) {

			DeathModel m=new DeathModel(deathItem.getId(), deathItem.getDeath(), deathItem.getDeath(), deathItem.getResponsible(), deathItem.getLastWords(), deathItem.getSeason(), deathItem.getEpisode(), deathItem.getNumberOfdeaths())

			modelList.add(m);
		}

		return null;
	}

	@Override
	public DeathModel getRandom() {

		DeathModel model = new DeathModel();

		return model.toFxBean(this.service.getRandom());
	}

}
