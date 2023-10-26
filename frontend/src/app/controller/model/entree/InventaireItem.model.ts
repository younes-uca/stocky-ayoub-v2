import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {InventaireDto} from './Inventaire.model';
import {ProduitDto} from '../commun/Produit.model';

export class InventaireItemDto extends BaseDto{

    public quantiteEstime: null | number;

    public quantiteReelle: null | number;

    public produit: ProduitDto ;
    public inventaire: InventaireDto ;
    

    constructor() {
        super();

        this.quantiteEstime = null;
        this.quantiteReelle = null;
        this.produit = new ProduitDto() ;
        this.inventaire = new InventaireDto() ;

        }

}
