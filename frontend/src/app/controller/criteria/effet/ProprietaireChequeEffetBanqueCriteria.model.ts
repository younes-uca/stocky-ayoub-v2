import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {CompteCriteria} from './CompteCriteria.model';
import {BanqueCriteria} from './BanqueCriteria.model';
import {ProprietaireChequeEffetCriteria} from './ProprietaireChequeEffetCriteria.model';

export class ProprietaireChequeEffetBanqueCriteria  extends BaseCriteria  {

    public id: number;
  public proprietaireChequeEffet: ProprietaireChequeEffetCriteria ;
  public proprietaireChequeEffets: Array<ProprietaireChequeEffetCriteria> ;
  public banque: BanqueCriteria ;
  public banques: Array<BanqueCriteria> ;
  public compte: CompteCriteria ;
  public comptes: Array<CompteCriteria> ;

}
