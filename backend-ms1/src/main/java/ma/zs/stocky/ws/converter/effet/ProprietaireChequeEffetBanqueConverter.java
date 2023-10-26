package  ma.zs.stocky.ws.converter.effet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.stocky.ws.converter.effet.CompteConverter;
import ma.zs.stocky.ws.converter.effet.BanqueConverter;
import ma.zs.stocky.ws.converter.effet.ProprietaireChequeEffetConverter;



import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.effet.ProprietaireChequeEffetBanque;
import ma.zs.stocky.ws.dto.effet.ProprietaireChequeEffetBanqueDto;

@Component
public class ProprietaireChequeEffetBanqueConverter extends AbstractConverter<ProprietaireChequeEffetBanque, ProprietaireChequeEffetBanqueDto> {

    @Autowired
    private CompteConverter compteConverter ;
    @Autowired
    private BanqueConverter banqueConverter ;
    @Autowired
    private ProprietaireChequeEffetConverter proprietaireChequeEffetConverter ;
    private boolean proprietaireChequeEffet;
    private boolean banque;
    private boolean compte;

    public  ProprietaireChequeEffetBanqueConverter(){
        super(ProprietaireChequeEffetBanque.class, ProprietaireChequeEffetBanqueDto.class);
    }

    @Override
    public ProprietaireChequeEffetBanque toItem(ProprietaireChequeEffetBanqueDto dto) {
        if (dto == null) {
            return null;
        } else {
        ProprietaireChequeEffetBanque item = new ProprietaireChequeEffetBanque();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(this.proprietaireChequeEffet && dto.getProprietaireChequeEffet()!=null &&  dto.getProprietaireChequeEffet().getId() != null)
                item.setProprietaireChequeEffet(proprietaireChequeEffetConverter.toItem(dto.getProprietaireChequeEffet())) ;

            if(this.banque && dto.getBanque()!=null &&  dto.getBanque().getId() != null)
                item.setBanque(banqueConverter.toItem(dto.getBanque())) ;

            if(this.compte && dto.getCompte()!=null &&  dto.getCompte().getId() != null)
                item.setCompte(compteConverter.toItem(dto.getCompte())) ;




        return item;
        }
    }

    @Override
    public ProprietaireChequeEffetBanqueDto toDto(ProprietaireChequeEffetBanque item) {
        if (item == null) {
            return null;
        } else {
            ProprietaireChequeEffetBanqueDto dto = new ProprietaireChequeEffetBanqueDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.proprietaireChequeEffet && item.getProprietaireChequeEffet()!=null) {
            dto.setProprietaireChequeEffet(proprietaireChequeEffetConverter.toDto(item.getProprietaireChequeEffet())) ;
        }
        if(this.banque && item.getBanque()!=null) {
            dto.setBanque(banqueConverter.toDto(item.getBanque())) ;
        }
        if(this.compte && item.getCompte()!=null) {
            dto.setCompte(compteConverter.toDto(item.getCompte())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.proprietaireChequeEffet = value;
        this.banque = value;
        this.compte = value;
    }


    public CompteConverter getCompteConverter(){
        return this.compteConverter;
    }
    public void setCompteConverter(CompteConverter compteConverter ){
        this.compteConverter = compteConverter;
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
    public boolean  isCompte(){
        return this.compte;
    }
    public void  setCompte(boolean compte){
        this.compte = compte;
    }
}
