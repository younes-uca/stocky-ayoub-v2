package  ma.zs.stocky.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.commun.CategorieProduit;
import ma.zs.stocky.ws.dto.commun.CategorieProduitDto;

@Component
public class CategorieProduitConverter extends AbstractConverter<CategorieProduit, CategorieProduitDto> {


    public  CategorieProduitConverter(){
        super(CategorieProduit.class, CategorieProduitDto.class);
    }

    @Override
    public CategorieProduit toItem(CategorieProduitDto dto) {
        if (dto == null) {
            return null;
        } else {
        CategorieProduit item = new CategorieProduit();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());



        return item;
        }
    }

    @Override
    public CategorieProduitDto toDto(CategorieProduit item) {
        if (item == null) {
            return null;
        } else {
            CategorieProduitDto dto = new CategorieProduitDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
