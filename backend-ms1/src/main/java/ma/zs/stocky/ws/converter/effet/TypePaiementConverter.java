package  ma.zs.stocky.ws.converter.effet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.effet.TypePaiement;
import ma.zs.stocky.ws.dto.effet.TypePaiementDto;

@Component
public class TypePaiementConverter extends AbstractConverter<TypePaiement, TypePaiementDto> {


    public  TypePaiementConverter(){
        super(TypePaiement.class, TypePaiementDto.class);
    }

    @Override
    public TypePaiement toItem(TypePaiementDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypePaiement item = new TypePaiement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());



        return item;
        }
    }

    @Override
    public TypePaiementDto toDto(TypePaiement item) {
        if (item == null) {
            return null;
        } else {
            TypePaiementDto dto = new TypePaiementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
