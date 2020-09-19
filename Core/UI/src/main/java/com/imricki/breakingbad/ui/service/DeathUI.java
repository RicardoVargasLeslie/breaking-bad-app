package com.imricki.breakingbad.ui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.item.DeathItem;
import com.imricki.breakingbad.domain.service.DeathClient;
import com.imricki.breakingbad.ui.dto.DeathDto;
import com.imricki.breakingbad.ui.model.DeathModel;

@Service
public class DeathUI implements DeathUIService {

	@Autowired
	private DeathClient service;

	@Override
	public List<DeathModel> getAll() {

		DeathModel model = new DeathModel();

		return model.tofxList(this.service.getAll());
	}

	@Override
	public DeathModel getRandom() {

		DeathItem item = this.service.getRandom();

		return new DeathModel(new DeathDto(item.getId(), item.getDeath(), item.getCause(), item.getResponsible(),
				item.getLastWords(), item.getLastWords(), item.getEpisode(), item.getNumberOfdeaths()));
	}

}
