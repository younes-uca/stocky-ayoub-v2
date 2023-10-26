package ma.zs.stocky.bean.core.effet;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.stocky.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "proprietaire_cheque_effet")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="proprietaire_cheque_effet_seq",sequenceName="proprietaire_cheque_effet_seq",allocationSize=1, initialValue = 1)
public class ProprietaireChequeEffet   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String nom;



    public ProprietaireChequeEffet(){
        super();
    }

    public ProprietaireChequeEffet(Long id,String nom){
        this.id = id;
        this.nom = nom ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="proprietaire_cheque_effet_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
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
        ProprietaireChequeEffet proprietaireChequeEffet = (ProprietaireChequeEffet) o;
        return id != null && id.equals(proprietaireChequeEffet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

