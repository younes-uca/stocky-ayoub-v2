import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {ProduitCriteria} from '../commun/ProduitCriteria.model';
import {SortieProduitCriteria} from './SortieProduitCriteria.model';
import {TauxTvaCriteria} from '../effet/TauxTvaCriteria.model';

export class SortieProduitItemCriteria  extends BaseCriteria  {

    public id: number;
     public quantite: number;
     public quantiteMin: number;
     public quantiteMax: number;
     public prix: number;
     public prixMin: number;
     public prixMax: number;
     public remise: number;
     public remiseMin: number;
     public remiseMax: number;
     public prixUnitaireTtc: number;
     public prixUnitaireTtcMin: number;
     public prixUnitaireTtcMax: number;
     public prixUht: number;
     public prixUhtMin: number;
     public prixUhtMax: number;
     public montantHt: number;
     public montantHtMin: number;
     public montantHtMax: number;
     public montantTtc: number;
     public montantTtcMin: number;
     public montantTtcMax: number;
  public produit: ProduitCriteria ;
  public produits: Array<ProduitCriteria> ;
  public tauxTva: TauxTvaCriteria ;
  public tauxTvas: Array<TauxTvaCriteria> ;
  public sortieProduit: SortieProduitCriteria ;
  public sortieProduits: Array<SortieProduitCriteria> ;

}
