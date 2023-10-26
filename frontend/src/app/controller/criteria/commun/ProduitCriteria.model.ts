import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {CategorieProduitCriteria} from './CategorieProduitCriteria.model';
import {MarqueCriteria} from './MarqueCriteria.model';
import {TauxTvaCriteria} from '../effet/TauxTvaCriteria.model';

export class ProduitCriteria  extends BaseCriteria  {

    public id: number;
    public reference: string;
    public referenceLike: string;
    public libelle: string;
    public libelleLike: string;
     public prixAchatMoyen: number;
     public prixAchatMoyenMin: number;
     public prixAchatMoyenMax: number;
     public prixVente: number;
     public prixVenteMin: number;
     public prixVenteMax: number;
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
  public categorieProduit: CategorieProduitCriteria ;
  public categorieProduits: Array<CategorieProduitCriteria> ;
  public marque: MarqueCriteria ;
  public marques: Array<MarqueCriteria> ;
  public tauxTva: TauxTvaCriteria ;
  public tauxTvas: Array<TauxTvaCriteria> ;

}
