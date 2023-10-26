import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {BanqueDto} from './Banque.model';
import {ProprietaireChequeEffetDto} from './ProprietaireChequeEffet.model';

export class CompteDto extends BaseDto{

    public numero: string;

    public proprietaireChequeEffet: ProprietaireChequeEffetDto ;
    public banque: BanqueDto ;
    

    constructor() {
        super();

        this.numero = '';
        this.proprietaireChequeEffet = new ProprietaireChequeEffetDto() ;
        this.banque = new BanqueDto() ;

        }

}
