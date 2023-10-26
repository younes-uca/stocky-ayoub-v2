import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class ProprietaireChequeEffetDto extends BaseDto{

    public nom: string;

    

    constructor() {
        super();

        this.nom = '';

        }

}
