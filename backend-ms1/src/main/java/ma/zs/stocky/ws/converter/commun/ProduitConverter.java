package  ma.zs.stocky.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.stocky.ws.converter.commun.CategorieProduitConverter;
import ma.zs.stocky.ws.converter.commun.MarqueConverter;
import ma.zs.stocky.ws.converter.effet.TauxTvaConverter;



import ma.zs.stocky.zynerator.util.StringUtil;
import ma.zs.stocky.zynerator.converter.AbstractConverter;
import ma.zs.stocky.zynerator.util.DateUtil;
import ma.zs.stocky.bean.core.commun.Produit;
import ma.zs.stocky.ws.dto.commun.ProduitDto;

@Component
public class ProduitConverter extends AbstractConverter<Produit, ProduitDto> {

    @Autowired
    private CategorieProduitConverter categorieProduitConverter ;
    @Autowired
    private MarqueConverter marqueConverter ;
    @Autowired
    private TauxTvaConverter tauxTvaConverter ;
    private boolean categorieProduit;
    private boolean marque;
    private boolean tauxTva;

    public  ProduitConverter(){
        super(Produit.class, ProduitDto.class);
    }

    @Override
    public Produit toItem(ProduitDto dto) {
        if (dto == null) {
            return null;
        } else {
        Produit item = new Produit();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getPrixAchatMoyen()))
                item.setPrixAchatMoyen(dto.getPrixAchatMoyen());
            if(StringUtil.isNotEmpty(dto.getPrixVente()))
                item.setPrixVente(dto.getPrixVente());
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
            if(this.categorieProduit && dto.getCategorieProduit()!=null &&  dto.getCategorieProduit().getId() != null)
                item.setCategorieProduit(categorieProduitConverter.toItem(dto.getCategorieProduit())) ;

            if(this.marque && dto.getMarque()!=null &&  dto.getMarque().getId() != null)
                item.setMarque(marqueConverter.toItem(dto.getMarque())) ;

            if(this.tauxTva && dto.getTauxTva()!=null &&  dto.getTauxTva().getId() != null)
                item.setTauxTva(tauxTvaConverter.toItem(dto.getTauxTva())) ;




        return item;
        }
    }

    @Override
    public ProduitDto toDto(Produit item) {
        if (item == null) {
            return null;
        } else {
            ProduitDto dto = new ProduitDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getPrixAchatMoyen()))
                dto.setPrixAchatMoyen(item.getPrixAchatMoyen());
            if(StringUtil.isNotEmpty(item.getPrixVente()))
                dto.setPrixVente(item.getPrixVente());
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
        if(this.categorieProduit && item.getCategorieProduit()!=null) {
            dto.setCategorieProduit(categorieProduitConverter.toDto(item.getCategorieProduit())) ;
        }
        if(this.marque && item.getMarque()!=null) {
            dto.setMarque(marqueConverter.toDto(item.getMarque())) ;
        }
        if(this.tauxTva && item.getTauxTva()!=null) {
            dto.setTauxTva(tauxTvaConverter.toDto(item.getTauxTva())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.categorieProduit = value;
        this.marque = value;
        this.tauxTva = value;
    }


    public CategorieProduitConverter getCategorieProduitConverter(){
        return this.categorieProduitConverter;
    }
    public void setCategorieProduitConverter(CategorieProduitConverter categorieProduitConverter ){
        this.categorieProduitConverter = categorieProduitConverter;
    }
    public MarqueConverter getMarqueConverter(){
        return this.marqueConverter;
    }
    public void setMarqueConverter(MarqueConverter marqueConverter ){
        this.marqueConverter = marqueConverter;
    }
    public TauxTvaConverter getTauxTvaConverter(){
        return this.tauxTvaConverter;
    }
    public void setTauxTvaConverter(TauxTvaConverter tauxTvaConverter ){
        this.tauxTvaConverter = tauxTvaConverter;
    }
    public boolean  isCategorieProduit(){
        return this.categorieProduit;
    }
    public void  setCategorieProduit(boolean categorieProduit){
        this.categorieProduit = categorieProduit;
    }
    public boolean  isMarque(){
        return this.marque;
    }
    public void  setMarque(boolean marque){
        this.marque = marque;
    }
    public boolean  isTauxTva(){
        return this.tauxTva;
    }
    public void  setTauxTva(boolean tauxTva){
        this.tauxTva = tauxTva;
    }
}
