package com.pokepoint.service;

import com.pokepoint.domain.MovePokemon;
import com.pokepoint.domain.TypePokemon;
import com.pokepoint.domain.dto.MovePokemonDTO;
import com.pokepoint.domain.dto.MovePokemonNewDTO;
import com.pokepoint.exception.ObjectNotFoundException;
import com.pokepoint.repository.MovePokemonRepository;
import com.pokepoint.repository.TypePokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MovePokemonService {

    @Autowired
    private MovePokemonRepository repo;
    @Autowired
    private TypePokemonRepository typePokemonRepository;

    public List<MovePokemon> findAll(){
        return repo.findAll();
    }

    public MovePokemon find(Integer id){
        Optional<MovePokemon> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Move não encontrado"));
    }

    public Page<MovePokemon> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repo.findAll(pageRequest);
    }

    public MovePokemon fromDTO(MovePokemonNewDTO obj) {
        TypePokemon objType = typePokemonRepository.findById(obj.getTypeId()).orElseThrow();
        TypePokemon typePokemon = new TypePokemon(objType.getId(), objType.getEnglishName(), objType.getJapaneseName(), objType.getPortugueseName());
        MovePokemon movePokemon = new MovePokemon(null, obj.getEnglishName(), obj.getJapaneseName(), obj.getPortugueseName(), obj.getAccuracy(), obj.getPower(), obj.getPpMin(), obj.getPpMax(), typePokemon);

        if(!typePokemon.getMoves().contains(movePokemon)){
            typePokemon.getMoves().add(movePokemon);
        }

        return movePokemon;
    }

    @Transactional
    public MovePokemon insert(MovePokemon obj) {
        obj.setId(null);
        obj = repo.save(obj);
        return obj;
    }

    public List<MovePokemon> findMoveByType(String nameMove) {
        List<MovePokemon> list = this.repo.findByTypeEnglishName(nameMove);
        return list;
    }
}
