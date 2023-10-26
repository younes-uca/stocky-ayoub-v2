import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {ProduitCriteria} from '../commun/ProduitCriteria.model';
import {EntreeProduitCriteria} from './EntreeProduitCriteria.model';
import {TauxTvaCriteria} from '../effet/TauxTvaCriteria.model';

export class EntreeProduitItemCriteria  extends BaseCriteria  {

    public id: number;
     public quantite: number;
     public quantiteMin: number;
     public quantiteMax: number;
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
  public entreeProduit: EntreeProduitCriteria ;
  public entreeProduits: Array<EntreeProduitCriteria> ;

}
