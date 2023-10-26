package  ma.zs.stocky.ws.converter.effet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffet;
import ma.zs.stocky.ws.dto.effet.ProprietaireChequeEffetDto;

@Component
public class ProprietaireChequeEffetConverter extends AbstractConverter<ProprietaireChequeEffet, ProprietaireChequeEffetDto> {


    public  ProprietaireChequeEffetConverter(){
        super(ProprietaireChequeEffet.class, ProprietaireChequeEffetDto.class);
    }

    @Override
    public ProprietaireChequeEffet toItem(ProprietaireChequeEffetDto dto) {
        if (dto == null) {
            return null;
        } else {
        ProprietaireChequeEffet item = new ProprietaireChequeEffet();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());



        return item;
        }
    }

    @Override
    public ProprietaireChequeEffetDto toDto(ProprietaireChequeEffet item) {
        if (item == null) {
            return null;
        } else {
            ProprietaireChequeEffetDto dto = new ProprietaireChequeEffetDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
