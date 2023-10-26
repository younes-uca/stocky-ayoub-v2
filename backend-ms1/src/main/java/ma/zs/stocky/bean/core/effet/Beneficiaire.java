package ma.zs.stocky.bean.core.effet;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.stocky.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "beneficiaire")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="beneficiaire_seq",sequenceName="beneficiaire_seq",allocationSize=1, initialValue = 1)
public class Beneficiaire   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String cin;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String tel;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String adresse;
    @Column(length = 500)
    private String description;
    private BigDecimal creance = BigDecimal.ZERO;



    public Beneficiaire(){
        super();
    }

    public Beneficiaire(Long id,String nom){
        this.id = id;
        this.nom = nom ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="beneficiaire_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public BigDecimal getCreance(){
        return this.creance;
    }
    public void setCreance(BigDecimal creance){
        this.creance = creance;
    }

    @Transient
    public String getLabel() {
        label = nom;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beneficiaire beneficiaire = (Beneficiaire) o;
        return id != null && id.equals(beneficiaire.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

