package com.pokepoint.validation;

import com.pokepoint.domain.dto.MovePokemonNewDTO;
import com.pokepoint.exception.FieldMessage;
import com.pokepoint.repository.MovePokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class MoveInsertValidator implements ConstraintValidator<MoveInsert, MovePokemonNewDTO> {

    @Autowired
    private MovePokemonRepository movePokemonRepository;

    @Override
    public void initialize(MoveInsert constraintAnnotation) {

    }

    @Override
    public boolean isValid(MovePokemonNewDTO obj, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        if(obj.getEnglishName() == null || obj.getEnglishName().equals("")){
            list.add(new FieldMessage("englishName","O nome Inglês do Movimento não foi informado"));
        }
        if(obj.getJapaneseName() == null || obj.getJapaneseName().equals("")){
            list.add(new FieldMessage("japaneseName","O nome em Japones do Movimento não foi informado"));
        }
        if(obj.getPortugueseName() == null || obj.getPortugueseName().equals("")){
            list.add(new FieldMessage("portugueseName","O nome em Português do Movimento não foi informado"));
        }
        if(obj.getPower() == null || obj.getPower().equals("")){
            list.add(new FieldMessage("power","O power do Movimento não foi informado"));
        }
        if(obj.getAccuracy() == null || obj.getAccuracy().equals("")){
            list.add(new FieldMessage("Accuracy","O Accuracy do Movimento não foi informado"));
        }
        if(obj.getPpMax() == null || obj.getPpMax().equals("")){
            list.add(new FieldMessage("ppMax","O maximo do PP do Movimento não foi informado"));
        }
        if(obj.getPpMin() == null || obj.getPpMin().equals("")){
            list.add(new FieldMessage("ppMin","O minimo do PP do Movimento não foi informado"));
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }

        return list.isEmpty();
    }
}
