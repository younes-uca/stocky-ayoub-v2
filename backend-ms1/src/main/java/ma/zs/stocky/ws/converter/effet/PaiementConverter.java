package  ma.zs.stocky.ws.converter.effet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.stocky.ws.converter.effet.CompteConverter;
import ma.zs.stocky.ws.converter.effet.BeneficiaireConverter;
import ma.zs.stocky.ws.converter.effet.ProprietaireChequeEffetConverter;
import ma.zs.stocky.ws.converter.effet.TypePaiementConverter;



import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.effet.Paiement;
import ma.zs.stocky.ws.dto.effet.PaiementDto;

@Component
public class PaiementConverter extends AbstractConverter<Paiement, PaiementDto> {

    @Autowired
    private CompteConverter compteConverter ;
    @Autowired
    private BeneficiaireConverter beneficiaireConverter ;
    @Autowired
    private ProprietaireChequeEffetConverter proprietaireChequeEffetConverter ;
    @Autowired
    private TypePaiementConverter typePaiementConverter ;
    private boolean proprietaireChequeEffet;
    private boolean compte;
    private boolean typePaiement;
    private boolean beneficiaire;

    public  PaiementConverter(){
        super(Paiement.class, PaiementDto.class);
    }

    @Override
    public Paiement toItem(PaiementDto dto) {
        if (dto == null) {
            return null;
        } else {
        Paiement item = new Paiement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateEmission()))
                item.setDateEmission(DateUtil.stringEnToDate(dto.getDateEmission()));
            if(StringUtil.isNotEmpty(dto.getCodeChequeEffet()))
                item.setCodeChequeEffet(dto.getCodeChequeEffet());
            if(StringUtil.isNotEmpty(dto.getDateEcheance()))
                item.setDateEcheance(DateUtil.stringEnToDate(dto.getDateEcheance()));
            if(StringUtil.isNotEmpty(dto.getDateEncaissement()))
                item.setDateEncaissement(DateUtil.stringEnToDate(dto.getDateEncaissement()));
            if(StringUtil.isNotEmpty(dto.getMontant()))
                item.setMontant(dto.getMontant());
            if(StringUtil.isNotEmpty(dto.getPathCheque()))
                item.setPathCheque(dto.getPathCheque());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.proprietaireChequeEffet && dto.getProprietaireChequeEffet()!=null &&  dto.getProprietaireChequeEffet().getId() != null)
                item.setProprietaireChequeEffet(proprietaireChequeEffetConverter.toItem(dto.getProprietaireChequeEffet())) ;

            if(this.compte && dto.getCompte()!=null &&  dto.getCompte().getId() != null)
                item.setCompte(compteConverter.toItem(dto.getCompte())) ;

            if(this.typePaiement && dto.getTypePaiement()!=null &&  dto.getTypePaiement().getId() != null)
                item.setTypePaiement(typePaiementConverter.toItem(dto.getTypePaiement())) ;

            if(this.beneficiaire && dto.getBeneficiaire()!=null &&  dto.getBeneficiaire().getId() != null)
                item.setBeneficiaire(beneficiaireConverter.toItem(dto.getBeneficiaire())) ;




        return item;
        }
    }

    @Override
    public PaiementDto toDto(Paiement item) {
        if (item == null) {
            return null;
        } else {
            PaiementDto dto = new PaiementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateEmission()!=null)
                dto.setDateEmission(DateUtil.dateTimeToString(item.getDateEmission()));
            if(StringUtil.isNotEmpty(item.getCodeChequeEffet()))
                dto.setCodeChequeEffet(item.getCodeChequeEffet());
            if(item.getDateEcheance()!=null)
                dto.setDateEcheance(DateUtil.dateTimeToString(item.getDateEcheance()));
            if(item.getDateEncaissement()!=null)
                dto.setDateEncaissement(DateUtil.dateTimeToString(item.getDateEncaissement()));
            if(StringUtil.isNotEmpty(item.getMontant()))
                dto.setMontant(item.getMontant());
            if(StringUtil.isNotEmpty(item.getPathCheque()))
                dto.setPathCheque(item.getPathCheque());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.proprietaireChequeEffet && item.getProprietaireChequeEffet()!=null) {
            dto.setProprietaireChequeEffet(proprietaireChequeEffetConverter.toDto(item.getProprietaireChequeEffet())) ;
        }
        if(this.compte && item.getCompte()!=null) {
            dto.setCompte(compteConverter.toDto(item.getCompte())) ;
        }
        if(this.typePaiement && item.getTypePaiement()!=null) {
            dto.setTypePaiement(typePaiementConverter.toDto(item.getTypePaiement())) ;
        }
        if(this.beneficiaire && item.getBeneficiaire()!=null) {
            dto.setBeneficiaire(beneficiaireConverter.toDto(item.getBeneficiaire())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.proprietaireChequeEffet = value;
        this.compte = value;
        this.typePaiement = value;
        this.beneficiaire = value;
    }


    public CompteConverter getCompteConverter(){
        return this.compteConverter;
    }
    public void setCompteConverter(CompteConverter compteConverter ){
        this.compteConverter = compteConverter;
    }
    public BeneficiaireConverter getBeneficiaireConverter(){
        return this.beneficiaireConverter;
    }
    public void setBeneficiaireConverter(BeneficiaireConverter beneficiaireConverter ){
        this.beneficiaireConverter = beneficiaireConverter;
    }
    public ProprietaireChequeEffetConverter getProprietaireChequeEffetConverter(){
        return this.proprietaireChequeEffetConverter;
    }
    public void setProprietaireChequeEffetConverter(ProprietaireChequeEffetConverter proprietaireChequeEffetConverter ){
        this.proprietaireChequeEffetConverter = proprietaireChequeEffetConverter;
    }
    public TypePaiementConverter getTypePaiementConverter(){
        return this.typePaiementConverter;
    }
    public void setTypePaiementConverter(TypePaiementConverter typePaiementConverter ){
        this.typePaiementConverter = typePaiementConverter;
    }
    public boolean  isProprietaireChequeEffet(){
        return this.proprietaireChequeEffet;
    }
    public void  setProprietaireChequeEffet(boolean proprietaireChequeEffet){
        this.proprietaireChequeEffet = proprietaireChequeEffet;
    }
    public boolean  isCompte(){
        return this.compte;
    }
    public void  setCompte(boolean compte){
        this.compte = compte;
    }
    public boolean  isTypePaiement(){
        return this.typePaiement;
    }
    public void  setTypePaiement(boolean typePaiement){
        this.typePaiement = typePaiement;
    }
    public boolean  isBeneficiaire(){
        return this.beneficiaire;
    }
    public void  setBeneficiaire(boolean beneficiaire){
        this.beneficiaire = beneficiaire;
    }
}
