import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';

import {TypePaiementDto} from 'src/app/controller/model/effet/TypePaiement.model';
import {TypePaiementCriteria} from 'src/app/controller/criteria/effet/TypePaiementCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class TypePaiementAdminService extends AbstractService<TypePaiementDto, TypePaiementCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/typePaiement/');
    }

    public constrcutDto(): TypePaiementDto {
        return new TypePaiementDto();
    }

    public constrcutCriteria(): TypePaiementCriteria {
        return new TypePaiementCriteria();
    }
}
