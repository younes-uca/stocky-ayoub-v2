package ma.zs.stocky.bean.core.effet;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.stocky.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "proprietaire_cheque_effet_banque")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="proprietaire_cheque_effet_banque_seq",sequenceName="proprietaire_cheque_effet_banque_seq",allocationSize=1, initialValue = 1)
public class ProprietaireChequeEffetBanque   extends AuditBusinessObject     {

    private Long id;


    private ProprietaireChequeEffet proprietaireChequeEffet ;
    private Banque banque ;
    private Compte compte ;


    public ProprietaireChequeEffetBanque(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="proprietaire_cheque_effet_banque_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
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
    @ManyToOne(fetch = FetchType.LAZY)
    public Compte getCompte(){
        return this.compte;
    }
    public void setCompte(Compte compte){
        this.compte = compte;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProprietaireChequeEffetBanque proprietaireChequeEffetBanque = (ProprietaireChequeEffetBanque) o;
        return id != null && id.equals(proprietaireChequeEffetBanque.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

