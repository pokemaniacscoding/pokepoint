package com.pokepoint.validation;

import com.pokepoint.domain.dto.MovePokemonNewDTO;
import com.pokepoint.exception.FieldMessage;
import com.pokepoint.repository.MovePokemonRepository;
import com.pokepoint.repository.TypePokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class MoveInsertValidator implements ConstraintValidator<MoveInsert, MovePokemonNewDTO> {

    @Autowired
    private MovePokemonRepository movePokemonRepository;
    @Autowired
    private TypePokemonRepository typePokemonRepository;

    @Override
    public void initialize(MoveInsert constraintAnnotation) {

    }

    @Override
    public boolean isValid(MovePokemonNewDTO obj, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        if(obj.getPpMin() == null || obj.getPpMin().equals("") || obj.getPpMin() <= 0){
            list.add(new FieldMessage("ppMin","O numero minimo do PP do Movimento é invalido"));
        }

        if(obj.getPpMax() == null || obj.getPpMax().equals("") || obj.getPpMax() <= 0){
            list.add(new FieldMessage("ppMax","O numero maximo do PP do Movimento é invalido"));
        }

        if(obj.getAccuracy() == null || obj.getAccuracy().equals("") || obj.getAccuracy() <= 0){
            list.add(new FieldMessage("accuracy","O numero do accuracy do Movimento é invalido"));
        }

        if(obj.getPower() == null || obj.getPower().equals("") || obj.getPower() <= 0){
            list.add(new FieldMessage("power","O numero do power do Movimento é invalido"));
        }

        if(typePokemonRepository.findById(obj.getTypeId()) == null || typePokemonRepository.findById(obj.getTypeId()).isEmpty()){
            list.add(new FieldMessage("typeId","O numero do Tipo informado do Movimento não foi encontrado"));
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }

        return list.isEmpty();
    }
}
