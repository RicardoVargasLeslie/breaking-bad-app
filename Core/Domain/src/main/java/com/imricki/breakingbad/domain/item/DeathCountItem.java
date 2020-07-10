package com.imricki.breakingbad.domain.item;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DeathCountItem {

	private Integer deathCount;

}
