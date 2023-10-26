import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class FournisseurDto extends BaseDto{

    public reference: string;

    public nom: string;

    public telephone: string;

    public email: string;

    public description: string;

    

    constructor() {
        super();

        this.reference = '';
        this.nom = '';
        this.telephone = '';
        this.email = '';
        this.description = '';

        }

}
