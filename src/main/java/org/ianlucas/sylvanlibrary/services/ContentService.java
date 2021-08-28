package org.ianlucas.sylvanlibrary.services;

import java.util.List;

import org.ianlucas.sylvanlibrary.dto.TotalCardDTO;
import org.ianlucas.sylvanlibrary.entities.Content;
import org.springframework.stereotype.Service;

@Service
public interface ContentService {
	
	Content save(Content deck);
	List<TotalCardDTO> findLowCards(String archetype, String format);
}
