import {Component, OnInit} from '@angular/core';
import {MarqueAdminService} from 'src/app/controller/service/admin/commun/MarqueAdmin.service';
import {MarqueDto} from 'src/app/controller/model/commun/Marque.model';
import {MarqueCriteria} from 'src/app/controller/criteria/commun/MarqueCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';



@Component({
  selector: 'app-marque-list-admin',
  templateUrl: './marque-list-admin.component.html'
})
export class MarqueListAdminComponent extends AbstractListController<MarqueDto, MarqueCriteria, MarqueAdminService>  implements OnInit {

    fileName = 'Marque';



    constructor( private marqueService: MarqueAdminService  ) {
        super(marqueService);
        this.pdfName = 'Marque.pdf';
    }

    ngOnInit(): void {
        this.findPaginatedByCriteria();
        this.initExport();
        this.initCol();
    }


    public initCol() {
        this.cols = [
            {field: 'reference', header: 'Reference'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }





   public prepareColumnExport(): void {
        this.exportData = this.items.map(e => {
            return {
                 'Reference': e.reference ,
                 'Libelle': e.libelle ,
            }
        });

        this.criteriaData = [{
            'Reference': this.criteria.reference ? this.criteria.reference : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
        }];
      }
}
