import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class MarqueDto extends BaseDto{

    public reference: string;

    public libelle: string;

    

    constructor() {
        super();

        this.reference = '';
        this.libelle = '';

        }

}
