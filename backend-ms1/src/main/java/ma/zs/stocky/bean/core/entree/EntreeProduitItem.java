package ma.zs.stocky.bean.core.entree;

import java.util.Objects;





import ma.zs.stocky.bean.core.commun.Produit;
import ma.zs.stocky.bean.core.effet.TauxTva;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.stocky.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "entree_produit_item")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="entree_produit_item_seq",sequenceName="entree_produit_item_seq",allocationSize=1, initialValue = 1)
public class EntreeProduitItem   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal quantite = BigDecimal.ZERO;
    private BigDecimal remise = BigDecimal.ZERO;
    private BigDecimal prixUnitaireTtc = BigDecimal.ZERO;
    private BigDecimal prixUht = BigDecimal.ZERO;
    private BigDecimal montantHt = BigDecimal.ZERO;
    private BigDecimal montantTtc = BigDecimal.ZERO;

    private Produit produit ;
    private TauxTva tauxTva ;
    private EntreeProduit entreeProduit ;


    public EntreeProduitItem(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="entree_produit_item_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Produit getProduit(){
        return this.produit;
    }
    public void setProduit(Produit produit){
        this.produit = produit;
    }
    public BigDecimal getQuantite(){
        return this.quantite;
    }
    public void setQuantite(BigDecimal quantite){
        this.quantite = quantite;
    }
    public BigDecimal getRemise(){
        return this.remise;
    }
    public void setRemise(BigDecimal remise){
        this.remise = remise;
    }
    public BigDecimal getPrixUnitaireTtc(){
        return this.prixUnitaireTtc;
    }
    public void setPrixUnitaireTtc(BigDecimal prixUnitaireTtc){
        this.prixUnitaireTtc = prixUnitaireTtc;
    }
    public BigDecimal getPrixUht(){
        return this.prixUht;
    }
    public void setPrixUht(BigDecimal prixUht){
        this.prixUht = prixUht;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TauxTva getTauxTva(){
        return this.tauxTva;
    }
    public void setTauxTva(TauxTva tauxTva){
        this.tauxTva = tauxTva;
    }
    public BigDecimal getMontantHt(){
        return this.montantHt;
    }
    public void setMontantHt(BigDecimal montantHt){
        this.montantHt = montantHt;
    }
    public BigDecimal getMontantTtc(){
        return this.montantTtc;
    }
    public void setMontantTtc(BigDecimal montantTtc){
        this.montantTtc = montantTtc;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public EntreeProduit getEntreeProduit(){
        return this.entreeProduit;
    }
    public void setEntreeProduit(EntreeProduit entreeProduit){
        this.entreeProduit = entreeProduit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntreeProduitItem entreeProduitItem = (EntreeProduitItem) o;
        return id != null && id.equals(entreeProduitItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

