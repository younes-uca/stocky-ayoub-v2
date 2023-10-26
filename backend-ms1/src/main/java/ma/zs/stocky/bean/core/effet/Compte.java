package ma.zs.stocky.bean.core.effet;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.stocky.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "compte")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="compte_seq",sequenceName="compte_seq",allocationSize=1, initialValue = 1)
public class Compte   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String numero;

    private ProprietaireChequeEffet proprietaireChequeEffet ;
    private Banque banque ;


    public Compte(){
        super();
    }

    public Compte(Long id,String numero){
        this.id = id;
        this.numero = numero ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="compte_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ProprietaireChequeEffet getProprietaireChequeEffet(){
        return this.proprietaireChequeEffet;
    }
    public void setProprietaireChequeEffet(ProprietaireChequeEffet proprietaireChequeEffet){
        this.proprietaireChequeEffet = proprietaireChequeEffet;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Banque getBanque(){
        return this.banque;
    }
    public void setBanque(Banque banque){
        this.banque = banque;
    }

    @Transient
    public String getLabel() {
        label = numero;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compte compte = (Compte) o;
        return id != null && id.equals(compte.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

