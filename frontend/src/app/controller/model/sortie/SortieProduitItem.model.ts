import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {ProduitDto} from '../commun/Produit.model';
import {SortieProduitDto} from './SortieProduit.model';
import {TauxTvaDto} from '../effet/TauxTva.model';

export class SortieProduitItemDto extends BaseDto{

    public quantite: null | number;

    public prix: null | number;

    public remise: null | number;

    public prixUnitaireTtc: null | number;

    public prixUht: null | number;

    public montantHt: null | number;

    public montantTtc: null | number;

    public produit: ProduitDto ;
    public tauxTva: TauxTvaDto ;
    public sortieProduit: SortieProduitDto ;
    

    constructor() {
        super();

        this.quantite = null;
        this.prix = null;
        this.remise = null;
        this.prixUnitaireTtc = null;
        this.prixUht = null;
        this.montantHt = null;
        this.montantTtc = null;
        this.produit = new ProduitDto() ;
        this.tauxTva = new TauxTvaDto() ;
        this.sortieProduit = new SortieProduitDto() ;

        }

}
