import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';

import {ProprietaireChequeEffetBanqueDto} from 'src/app/controller/model/effet/ProprietaireChequeEffetBanque.model';
import {ProprietaireChequeEffetBanqueCriteria} from 'src/app/controller/criteria/effet/ProprietaireChequeEffetBanqueCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class ProprietaireChequeEffetBanqueAdminService extends AbstractService<ProprietaireChequeEffetBanqueDto, ProprietaireChequeEffetBanqueCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/proprietaireChequeEffetBanque/');
    }

    public constrcutDto(): ProprietaireChequeEffetBanqueDto {
        return new ProprietaireChequeEffetBanqueDto();
    }

    public constrcutCriteria(): ProprietaireChequeEffetBanqueCriteria {
        return new ProprietaireChequeEffetBanqueCriteria();
    }
}
