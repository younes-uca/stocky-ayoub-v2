package  ma.zs.stocky.ws.converter.sortie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.stocky.ws.converter.commun.ProduitConverter;
import ma.zs.stocky.ws.converter.sortie.SortieProduitConverter;
import ma.zs.stocky.ws.converter.effet.TauxTvaConverter;

import ma.zs.stocky.bean.core.sortie.SortieProduit;


import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.sortie.SortieProduitItem;
import ma.zs.stocky.ws.dto.sortie.SortieProduitItemDto;

@Component
public class SortieProduitItemConverter extends AbstractConverter<SortieProduitItem, SortieProduitItemDto> {

    @Autowired
    private ProduitConverter produitConverter ;
    @Autowired
    private SortieProduitConverter sortieProduitConverter ;
    @Autowired
    private TauxTvaConverter tauxTvaConverter ;
    private boolean produit;
    private boolean tauxTva;
    private boolean sortieProduit;

    public  SortieProduitItemConverter(){
        super(SortieProduitItem.class, SortieProduitItemDto.class);
    }

    @Override
    public SortieProduitItem toItem(SortieProduitItemDto dto) {
        if (dto == null) {
            return null;
        } else {
        SortieProduitItem item = new SortieProduitItem();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getQuantite()))
                item.setQuantite(dto.getQuantite());
            if(StringUtil.isNotEmpty(dto.getPrix()))
                item.setPrix(dto.getPrix());
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

            if(dto.getSortieProduit() != null && dto.getSortieProduit().getId() != null){
                item.setSortieProduit(new SortieProduit());
                item.getSortieProduit().setId(dto.getSortieProduit().getId());
                item.getSortieProduit().setReference(dto.getSortieProduit().getReference());
            }




        return item;
        }
    }

    @Override
    public SortieProduitItemDto toDto(SortieProduitItem item) {
        if (item == null) {
            return null;
        } else {
            SortieProduitItemDto dto = new SortieProduitItemDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getQuantite()))
                dto.setQuantite(item.getQuantite());
            if(StringUtil.isNotEmpty(item.getPrix()))
                dto.setPrix(item.getPrix());
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
        if(this.sortieProduit && item.getSortieProduit()!=null) {
            dto.setSortieProduit(sortieProduitConverter.toDto(item.getSortieProduit())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.produit = value;
        this.tauxTva = value;
        this.sortieProduit = value;
    }


    public ProduitConverter getProduitConverter(){
        return this.produitConverter;
    }
    public void setProduitConverter(ProduitConverter produitConverter ){
        this.produitConverter = produitConverter;
    }
    public SortieProduitConverter getSortieProduitConverter(){
        return this.sortieProduitConverter;
    }
    public void setSortieProduitConverter(SortieProduitConverter sortieProduitConverter ){
        this.sortieProduitConverter = sortieProduitConverter;
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
    public boolean  isSortieProduit(){
        return this.sortieProduit;
    }
    public void  setSortieProduit(boolean sortieProduit){
        this.sortieProduit = sortieProduit;
    }
}
