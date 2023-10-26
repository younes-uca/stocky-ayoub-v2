package  ma.zs.stocky.ws.converter.effet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.stocky.ws.converter.effet.BanqueConverter;
import ma.zs.stocky.ws.converter.effet.ProprietaireChequeEffetConverter;



import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.effet.Compte;
import ma.zs.stocky.ws.dto.effet.CompteDto;

@Component
public class CompteConverter extends AbstractConverter<Compte, CompteDto> {

    @Autowired
    private BanqueConverter banqueConverter ;
    @Autowired
    private ProprietaireChequeEffetConverter proprietaireChequeEffetConverter ;
    private boolean proprietaireChequeEffet;
    private boolean banque;

    public  CompteConverter(){
        super(Compte.class, CompteDto.class);
    }

    @Override
    public Compte toItem(CompteDto dto) {
        if (dto == null) {
            return null;
        } else {
        Compte item = new Compte();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNumero()))
                item.setNumero(dto.getNumero());
            if(this.proprietaireChequeEffet && dto.getProprietaireChequeEffet()!=null &&  dto.getProprietaireChequeEffet().getId() != null)
                item.setProprietaireChequeEffet(proprietaireChequeEffetConverter.toItem(dto.getProprietaireChequeEffet())) ;

            if(this.banque && dto.getBanque()!=null &&  dto.getBanque().getId() != null)
                item.setBanque(banqueConverter.toItem(dto.getBanque())) ;




        return item;
        }
    }

    @Override
    public CompteDto toDto(Compte item) {
        if (item == null) {
            return null;
        } else {
            CompteDto dto = new CompteDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNumero()))
                dto.setNumero(item.getNumero());
        if(this.proprietaireChequeEffet && item.getProprietaireChequeEffet()!=null) {
            dto.setProprietaireChequeEffet(proprietaireChequeEffetConverter.toDto(item.getProprietaireChequeEffet())) ;
        }
        if(this.banque && item.getBanque()!=null) {
            dto.setBanque(banqueConverter.toDto(item.getBanque())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.proprietaireChequeEffet = value;
        this.banque = value;
    }


    public BanqueConverter getBanqueConverter(){
        return this.banqueConverter;
    }
    public void setBanqueConverter(BanqueConverter banqueConverter ){
        this.banqueConverter = banqueConverter;
    }
    public ProprietaireChequeEffetConverter getProprietaireChequeEffetConverter(){
        return this.proprietaireChequeEffetConverter;
    }
    public void setProprietaireChequeEffetConverter(ProprietaireChequeEffetConverter proprietaireChequeEffetConverter ){
        this.proprietaireChequeEffetConverter = proprietaireChequeEffetConverter;
    }
    public boolean  isProprietaireChequeEffet(){
        return this.proprietaireChequeEffet;
    }
    public void  setProprietaireChequeEffet(boolean proprietaireChequeEffet){
        this.proprietaireChequeEffet = proprietaireChequeEffet;
    }
    public boolean  isBanque(){
        return this.banque;
    }
    public void  setBanque(boolean banque){
        this.banque = banque;
    }
}
