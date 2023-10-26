import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {CompteDto} from './Compte.model';
import {BanqueDto} from './Banque.model';
import {ProprietaireChequeEffetDto} from './ProprietaireChequeEffet.model';

export class ProprietaireChequeEffetBanqueDto extends BaseDto{

    public proprietaireChequeEffet: ProprietaireChequeEffetDto ;
    public banque: BanqueDto ;
    public compte: CompteDto ;
    

    constructor() {
        super();

        this.proprietaireChequeEffet = new ProprietaireChequeEffetDto() ;
        this.banque = new BanqueDto() ;
        this.compte = new CompteDto() ;

        }

}
