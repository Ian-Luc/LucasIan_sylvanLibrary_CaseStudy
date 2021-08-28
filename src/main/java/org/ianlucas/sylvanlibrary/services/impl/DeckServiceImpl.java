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
	public Deck findByDeckId(Integer id) {
		return deckRepository.findByDeckId(id);
	}
	
	@Override
	public Deck save(Deck deck) {
		return deckRepository.save(deck);
	}

	//Central method of the service: returns the DTO for the Search by Card function
	@Override
	public List<ArchetypeDTO> findTop10ArchetypeDTO(String card, String format) {
		System.out.println("ENTERED METHOD...");
		List<ArchetypeDTO> dtoList = new ArrayList<>();
		for (Deck deck : deckRepository.findListByThings(format, card)) {
			System.out.println("DECKLIST SIZE: "+deckRepository.findListByThings(format, card).size());
			System.out.println("DECK = "+deck.getDeckName());
			dtoList.add(buildDto(deck));
		}
		return dtoList;
	}

	@Override
	public List<Deck> findAll() {
		return deckRepository.findAll();
	}
}
