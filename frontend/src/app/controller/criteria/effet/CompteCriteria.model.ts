import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {BanqueCriteria} from './BanqueCriteria.model';
import {ProprietaireChequeEffetCriteria} from './ProprietaireChequeEffetCriteria.model';

export class CompteCriteria  extends BaseCriteria  {

    public id: number;
    public numero: string;
    public numeroLike: string;
  public proprietaireChequeEffet: ProprietaireChequeEffetCriteria ;
  public proprietaireChequeEffets: Array<ProprietaireChequeEffetCriteria> ;
  public banque: BanqueCriteria ;
  public banques: Array<BanqueCriteria> ;

}
