package org.ianlucas.sylvanlibrary.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.ianlucas.sylvanlibrary.dto.ArchetypeDTO;
import org.ianlucas.sylvanlibrary.entities.Deck;
import org.ianlucas.sylvanlibrary.repositories.DeckRepository;
import org.ianlucas.sylvanlibrary.services.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DeckService")
public class DeckServiceImpl implements DeckService{
	
	private DeckRepository deckRepository;
	
	@Autowired
	public DeckServiceImpl(DeckRepository deckRepository) {
		this.deckRepository = deckRepository;
	}
	
	private ArchetypeDTO buildDto(Deck deck) {
		ArchetypeDTO archetypeDto = new ArchetypeDTO();
		archetypeDto.setArchetype(deck.getArchetype());
		archetypeDto.setName(deck.getDeckName());
		archetypeDto.setPlayerName(deck.getPlayerName());
		archetypeDto.setFormat(deck.getFormat());
		return archetypeDto;
	}

	@Override
	public List<Deck> findByPlayerName(String player) {
		return deckRepository.findByPlayerName(player);
	}

	@Override
	public List<Deck> findByArchetype(String archetype) {
		return deckRepository.findByArchetype(archetype);
	}

	@Override
	public Deck findByDeckId(Integer id) {
		return deckRepository.findByDeckId(id);
	}

	@Override
	public Deck findByDeckNameAndPlayerName(String deckName, String playerName) {
		return deckRepository.findByDeckNameAndPlayerName(deckName, playerName);
	}

//	@Override
//	public DeckCatalog removeDeck(DeckCatalog deck) {
//		return deckRepository.removeDeck(deck);
//	}
//
//	@Override
//	public List<CardCatalog> findCardsByDeckId(Integer deckId) {
//		return deckRepository.findCardsByDeckId(deckId);
//	}
	
	@Override
	public Deck save(Deck deck) {
		return deckRepository.save(deck);
	}

	@Override
	public List<ArchetypeDTO> findTop10ArchetypeDTO(String card, String format) {
		List<ArchetypeDTO> dtoList = new ArrayList<>();
		for (Deck deck : deckRepository.findByFormatAndContentCardContaining(format, card)) {
			dtoList.add(buildDto(deck));
		}
		System.out.println(dtoList.size());
		return dtoList;
	}
}
