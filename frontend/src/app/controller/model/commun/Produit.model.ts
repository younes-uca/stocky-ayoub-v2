import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {CategorieProduitDto} from './CategorieProduit.model';
import {MarqueDto} from './Marque.model';
import {TauxTvaDto} from '../effet/TauxTva.model';

export class ProduitDto extends BaseDto{

    public reference: string;

    public libelle: string;

    public prixAchatMoyen: null | number;

    public prixVente: null | number;

    public prix: null | number;

    public remise: null | number;

    public prixUnitaireTtc: null | number;

    public prixUht: null | number;

    public montantHt: null | number;

    public montantTtc: null | number;

    public categorieProduit: CategorieProduitDto ;
    public marque: MarqueDto ;
    public tauxTva: TauxTvaDto ;
    

    constructor() {
        super();

        this.reference = '';
        this.libelle = '';
        this.prixAchatMoyen = null;
        this.prixVente = null;
        this.prix = null;
        this.remise = null;
        this.prixUnitaireTtc = null;
        this.prixUht = null;
        this.montantHt = null;
        this.montantTtc = null;
        this.categorieProduit = new CategorieProduitDto() ;
        this.marque = new MarqueDto() ;
        this.tauxTva = new TauxTvaDto() ;

        }

}
