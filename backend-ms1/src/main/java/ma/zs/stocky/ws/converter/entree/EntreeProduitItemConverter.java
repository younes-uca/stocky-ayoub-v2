package  ma.zs.stocky.ws.converter.entree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.stocky.ws.converter.commun.ProduitConverter;
import ma.zs.stocky.ws.converter.entree.EntreeProduitConverter;
import ma.zs.stocky.ws.converter.effet.TauxTvaConverter;

import ma.zs.stocky.bean.core.entree.EntreeProduit;


import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.entree.EntreeProduitItem;
import ma.zs.stocky.ws.dto.entree.EntreeProduitItemDto;

@Component
public class EntreeProduitItemConverter extends AbstractConverter<EntreeProduitItem, EntreeProduitItemDto> {

    @Autowired
    private ProduitConverter produitConverter ;
    @Autowired
    private EntreeProduitConverter entreeProduitConverter ;
    @Autowired
    private TauxTvaConverter tauxTvaConverter ;
    private boolean produit;
    private boolean tauxTva;
    private boolean entreeProduit;

    public  EntreeProduitItemConverter(){
        super(EntreeProduitItem.class, EntreeProduitItemDto.class);
    }

    @Override
    public EntreeProduitItem toItem(EntreeProduitItemDto dto) {
        if (dto == null) {
            return null;
        } else {
        EntreeProduitItem item = new EntreeProduitItem();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getQuantite()))
                item.setQuantite(dto.getQuantite());
            if(StringUtil.isNotEmpty(dto.getRemise()))
                item.setRemise(dto.getRemise());
            if(StringUtil.isNotEmpty(dto.getPrixUnitaireTtc()))
                item.setPrixUnitaireTtc(dto.getPrixUnitaireTtc());
            if(StringUtil.isNotEmpty(dto.getPrixUht()))
                item.setPrixUht(dto.getPrixUht());
            if(StringUtil.isNotEmpty(dto.getMontantHt()))
                item.setMontantHt(dto.getMontantHt());
            if(StringUtil.isNotEmpty(dto.getMontantTtc()))
                item.setMontantTtc(dto.getMontantTtc());
            if(this.produit && dto.getProduit()!=null &&  dto.getProduit().getId() != null)
                item.setProduit(produitConverter.toItem(dto.getProduit())) ;

            if(this.tauxTva && dto.getTauxTva()!=null &&  dto.getTauxTva().getId() != null)
                item.setTauxTva(tauxTvaConverter.toItem(dto.getTauxTva())) ;

            if(dto.getEntreeProduit() != null && dto.getEntreeProduit().getId() != null){
                item.setEntreeProduit(new EntreeProduit());
                item.getEntreeProduit().setId(dto.getEntreeProduit().getId());
                item.getEntreeProduit().setReference(dto.getEntreeProduit().getReference());
            }




        return item;
        }
    }

    @Override
    public EntreeProduitItemDto toDto(EntreeProduitItem item) {
        if (item == null) {
            return null;
        } else {
            EntreeProduitItemDto dto = new EntreeProduitItemDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getQuantite()))
                dto.setQuantite(item.getQuantite());
            if(StringUtil.isNotEmpty(item.getRemise()))
                dto.setRemise(item.getRemise());
            if(StringUtil.isNotEmpty(item.getPrixUnitaireTtc()))
                dto.setPrixUnitaireTtc(item.getPrixUnitaireTtc());
            if(StringUtil.isNotEmpty(item.getPrixUht()))
                dto.setPrixUht(item.getPrixUht());
            if(StringUtil.isNotEmpty(item.getMontantHt()))
                dto.setMontantHt(item.getMontantHt());
            if(StringUtil.isNotEmpty(item.getMontantTtc()))
                dto.setMontantTtc(item.getMontantTtc());
        if(this.produit && item.getProduit()!=null) {
            dto.setProduit(produitConverter.toDto(item.getProduit())) ;
        }
        if(this.tauxTva && item.getTauxTva()!=null) {
            dto.setTauxTva(tauxTvaConverter.toDto(item.getTauxTva())) ;
        }
        if(this.entreeProduit && item.getEntreeProduit()!=null) {
            dto.setEntreeProduit(entreeProduitConverter.toDto(item.getEntreeProduit())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.produit = value;
        this.tauxTva = value;
        this.entreeProduit = value;
    }


    public ProduitConverter getProduitConverter(){
        return this.produitConverter;
    }
    public void setProduitConverter(ProduitConverter produitConverter ){
        this.produitConverter = produitConverter;
    }
    public EntreeProduitConverter getEntreeProduitConverter(){
        return this.entreeProduitConverter;
    }
    public void setEntreeProduitConverter(EntreeProduitConverter entreeProduitConverter ){
        this.entreeProduitConverter = entreeProduitConverter;
    }
    public TauxTvaConverter getTauxTvaConverter(){
        return this.tauxTvaConverter;
    }
    public void setTauxTvaConverter(TauxTvaConverter tauxTvaConverter ){
        this.tauxTvaConverter = tauxTvaConverter;
    }
    public boolean  isProduit(){
        return this.produit;
    }
    public void  setProduit(boolean produit){
        this.produit = produit;
    }
    public boolean  isTauxTva(){
        return this.tauxTva;
    }
    public void  setTauxTva(boolean tauxTva){
        this.tauxTva = tauxTva;
    }
    public boolean  isEntreeProduit(){
        return this.entreeProduit;
    }
    public void  setEntreeProduit(boolean entreeProduit){
        this.entreeProduit = entreeProduit;
    }
}
